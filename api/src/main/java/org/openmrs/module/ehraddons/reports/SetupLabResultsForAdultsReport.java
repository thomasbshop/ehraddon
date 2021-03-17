package org.openmrs.module.ehraddons.reports;

import org.openmrs.module.kenyacore.report.ReportDescriptor;
import org.openmrs.module.kenyacore.report.builder.AbstractHybridReportBuilder;
import org.openmrs.module.kenyacore.report.builder.AbstractReportBuilder;
import org.openmrs.module.kenyacore.report.builder.Builds;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.SqlDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.springframework.stereotype.Component;
//import org.openmrs.module.kenyacore.report.builder.AbstractHybridReportBuilder;

import org.openmrs.module.kenyacore.report.HybridReportDescriptor;
import org.openmrs.module.kenyacore.report.builder.AbstractHybridReportBuilder;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.dataset.definition.PatientDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.openmrs.module.kenyacore.report.ReportUtils.map;

@Component
@Builds({ "ehraddons.common.labadults" })
public class SetupLabResultsForAdultsReport extends AbstractHybridReportBuilder {
	
	@Override
	protected Mapped<CohortDefinition> buildCohort(HybridReportDescriptor descriptor, PatientDataSetDefinition dsd) {
		CohortDefinition cd = new RDQACohortDefinition();
		cd.setName("RDQA All Patients");
		return ReportUtils.map(cd, "");
	}
	
	@Override
	protected List<Mapped<DataSetDefinition>> buildDataSets(ReportDescriptor descriptor, ReportDefinition report) {
		
		SqlDataSetDefinition sqlDSD = new SqlDataSetDefinition();
		sqlDSD.setSqlQuery("SELECT * FROM patient");
		//        allPatients.addRowFilter(allPatientsCohort());
		
		return Arrays.asList(ReportUtils.map(sqlDSD, ""));
	}
}
