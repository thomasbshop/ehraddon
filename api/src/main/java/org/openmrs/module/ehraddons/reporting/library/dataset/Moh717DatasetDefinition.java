package org.openmrs.module.ehraddons.reporting.library.dataset;

import org.openmrs.module.ehraddons.diagnosis.lists.DiagnosisLists;
import org.openmrs.module.ehraddons.reporting.library.indicator.Moh717IndicatorDefinition;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh717DatasetDefinition extends EhrAddOnBaseDataSet {
	
	private Moh717IndicatorDefinition moh717Indicator;
	
	@Autowired
	public Moh717DatasetDefinition(Moh717IndicatorDefinition moh717Indicator) {
		this.moh717Indicator = moh717Indicator;
	}
	
	private void getTuberculosis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("T1", "Tuberculosis-T1", ReportUtils.map(
		    moh717Indicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 1), indParam), "");
		dsd.addColumn("T2", "Tuberculosis-T2", ReportUtils.map(
		    moh717Indicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 2), indParam), "");
		dsd.addColumn("T3", "Tuberculosis-T3", ReportUtils.map(
		    moh717Indicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 3), indParam), "");
		dsd.addColumn("T4", "Tuberculosis-T4", ReportUtils.map(
		    moh717Indicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 4), indParam), "");
	}
	
	private void getDiarrhoea(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("D1", "Diarrhoea-D1", ReportUtils.map(
		    moh717Indicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 1), indParam), "");
		dsd.addColumn("D2", "Diarrhoea-D2", ReportUtils.map(
		    moh717Indicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 2), indParam), "");
		dsd.addColumn("D3", "Diarrhoea-D3", ReportUtils.map(
		    moh717Indicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 3), indParam), "");
		dsd.addColumn("D4", "Diarrhoea-D4", ReportUtils.map(
		    moh717Indicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 4), indParam), "");
	}
	
	/**
	 * Get moh 705 a dataset
	 * 
	 * @return @{@link org.openmrs.module.reporting.dataset.definition.DataSetDefinition}
	 */
	public DataSetDefinition getMoh717Dataset() {
		CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
		String indParam = "startDate=${startDate},endDate=${endDate}";
		//dsd.addDimension("days", ReportUtils.map(ehrAddonDimesion.encountersOfMonthPerDay(), "endDate=${endDate}"));
		dsd.setName("MOH717");
		dsd.addParameters(getParameters());
		// populate datasets
		getDiarrhoea(dsd, indParam);
		getTuberculosis(dsd, indParam);
		
		return dsd;
		
	}
	
}
