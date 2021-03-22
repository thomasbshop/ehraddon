package org.openmrs.module.ehraddons.reporting.library.cohorts;

import java.util.Date;

import org.openmrs.api.context.Context;
import org.openmrs.module.ehraddons.metadata.EhrAddonsMetadata;
import org.openmrs.module.ehraddons.metadata.OutpatientMetadata;
import org.openmrs.module.ehraddons.reporting.calculation.EncountersBasedOnDaySuppliedCalculation;
import org.openmrs.module.ehraddons.reporting.library.queries.Moh717Queries;
import org.openmrs.module.ehraddons.reporting.utils.EhrReportConstants;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.kenyacore.report.cohort.definition.CalculationCohortDefinition;
import org.openmrs.module.ehraddons.reporting.calculation.CombinedStateCalculation;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CompositionCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh717CohortDefination {
	
	private EhrAddonsMetadata ehrAddonsMetadata;
	
	private OutpatientMetadata outpatientMetadata;
	
	@Autowired
	public Moh717CohortDefination(EhrAddonsMetadata ehrAddonsMetadata, OutpatientMetadata outpatientMetadata) {
		this.outpatientMetadata = outpatientMetadata;
		this.ehrAddonsMetadata = ehrAddonsMetadata;
	}
	
	//    /**
	//     * Get adult patients who have given diagnosis - MOH705A
	//     *
	//     * @return @{@link org.openmrs.module.reporting.cohort.definition.CohortDefinition}
	//     */
	//    public CohortDefinition getPatientsWhoHaveDiagnosis(List<Integer> list) {
	//        SqlCohortDefinition cd = new SqlCohortDefinition();
	//        cd.setName("Get children patients who have diagnosis based on list of concepts");
	//        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
	//        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
	//        cd.setQuery(Moh705Queries.getChildrenPatientsWhoMatchDiagnosisBasedOnConcepts(ehrAddonsMetadata
	//                .getDiagnosisConceptClass().getConceptClassId(), list));
	//        return cd;
	//    }
	//    /** Get outpatients **/
	//    public CohortDefinition getOutPatients() {
	//
	//        SqlCohortDefinition cd = new SqlCohortDefinition();
	//        cd.setName("Outpatient");
	//        cd.addParameter(new Parameter("startDate", "StartDate", Date.class));
	//        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
	//        cd.setQuery(
	//                Moh717Queries.getOutPatientClinicPatients(
	//                        outpatientMetadata.getAdultsInitialEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getAdultReturnEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getPedsInitialEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getPedsReturnEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getRegInitialEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getRegReturnEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getOpdEncounterType().getEncounterTypeId()));
	//        return cd;
	//    }
	
	//    /**
	//     * Get special clinic patients
	//     *
	//     * @param
	//     * @return
	//     */
	//    public CohortDefinition getSpecialClinicPatients(int answer) {
	//        SqlCohortDefinition cd = new SqlCohortDefinition();
	//        cd.setName("Special Clinic Patients");
	//        cd.addParameter(new Parameter("startDate", "StartDate", Date.class));
	//        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
	//        cd.setQuery(
	//                Moh717Queries.getSpecialClinicPatients(
	//                        outpatientMetadata.getAdultsInitialEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getAdultReturnEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getPedsInitialEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getPedsReturnEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getCheckInEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getAncEncounterType().getEncounterTypeId(),
	//                        outpatientMetadata.getSpecialClinicConcept().getConceptId(),
	//                        answer));
	//        return cd;
	//    }
	
	/**
	 * Get patients who are queued as casuality during facility visit
	 * 
	 * @return
	 */
	public CohortDefinition getPatientsQueuedAsCasuality() {
		SqlCohortDefinition cd = new SqlCohortDefinition();
		cd.setName("Casuality Patients");
		cd.addParameter(new Parameter("startDate", "StartDate", Date.class));
		cd.addParameter(new Parameter("endDate", "End Date", Date.class));
		cd.setQuery(Moh717Queries.getPatientsGeneralQuery(outpatientMetadata.getTriageConcept().getConceptId(),
		    outpatientMetadata.getOpdWardConcept().getConceptId(), outpatientMetadata.getCasualityOpdConcept()
		            .getConceptId(), outpatientMetadata.getCasualityTriageConcept().getConceptId()));
		return cd;
	}
	
	public CohortDefinition getRevisitPatientStates(EhrReportConstants.OccurenceStates state) {
		CalculationCohortDefinition cd = new CalculationCohortDefinition("Returning Patients", Context
		        .getRegisteredComponents(CombinedStateCalculation.class).get(0));
		cd.addParameter(new Parameter("onOrBefore", "End Date", Date.class));
		cd.addCalculationParameter("state", state);
		return cd;
	}
}
