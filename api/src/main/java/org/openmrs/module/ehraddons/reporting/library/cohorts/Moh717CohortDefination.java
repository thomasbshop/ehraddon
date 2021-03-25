package org.openmrs.module.ehraddons.reporting.library.cohorts;

import java.util.Date;

import org.openmrs.api.context.Context;
import org.openmrs.module.ehraddons.metadata.EhrAddonsMetadata;
import org.openmrs.module.ehraddons.metadata.OutpatientMetadata;
import org.openmrs.module.ehraddons.reporting.calculation.EncountersBasedOnDaySuppliedCalculation;
import org.openmrs.module.ehraddons.reporting.library.queries.Moh717Queries;
import org.openmrs.module.ehraddons.Moh717Constants;
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
	
	public CohortDefinition getRevisitPatientStates(Moh717Constants.OccurenceStates state) {
		CalculationCohortDefinition cd = new CalculationCohortDefinition("Returning Patients", Context
		        .getRegisteredComponents(CombinedStateCalculation.class).get(0));
		cd.addParameter(new Parameter("onOrBefore", "End Date", Date.class));
		cd.addCalculationParameter("state", state);
		return cd;
	}
	
}
