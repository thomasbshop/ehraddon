package org.openmrs.module.ehraddons.reporting.library.indicator;

import org.openmrs.module.ehraddons.reporting.library.cohorts.Moh717CohortDefinition;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.openmrs.module.kenyacore.report.ReportUtils.map;
import static org.openmrs.module.kenyaemr.reporting.EmrReportingUtils.cohortIndicator;

@Component
public class Moh717IndicatorDefinition {
	
	private Moh717CohortDefinition moh717CohortDefinition;
	
	@Autowired
	public Moh717IndicatorDefinition(Moh717CohortDefinition moh717CohortDefinition) {
		this.moh717CohortDefinition = moh717CohortDefinition;
	}
	
	//Diagnonosis
	public CohortIndicator getAllPatientsWithDiagnosis(List<Integer> list, int day) {
		return cohortIndicator(
		    "Diagnosis",
		    map(moh717CohortDefinition.getChildrenPatientsWhoHaveDiagnosisOnAgivenDay(list, day),
		        "startDate=${startDate},endDate=${endDate}"));
	}
}
