package org.openmrs.module.ehraddons.reports.indicator;

import org.openmrs.module.kenyacore.report.HybridReportDescriptor;
import org.openmrs.module.kenyacore.report.builder.AbstractHybridReportBuilder;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.dataset.definition.PatientDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;

public class TestHybrid extends AbstractHybridReportBuilder {
	
	@Override
	protected Mapped<CohortDefinition> buildCohort(HybridReportDescriptor hybridReportDescriptor,
	        PatientDataSetDefinition patientDataSetDefinition) {
		return null;
	}
}
