package org.openmrs.module.ehraddons.reporting.library.dataset;

import org.openmrs.module.ehraddons.diagnosis.lists.DiagnosisLists;
import org.openmrs.module.ehraddons.reporting.library.indicator.Moh705aIndicatorDefinition;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh705aDatasetDefinition extends EhrAddOnBaseDataSet {
	
	private Moh705aIndicatorDefinition moh705aIndicator;
	
	@Autowired
	public Moh705aDatasetDefinition(Moh705aIndicatorDefinition moh705aIndicator) {
		this.moh705aIndicator = moh705aIndicator;
	}
	
	private void getTuberculosis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("T1", "Tuberculosis-T1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 1), indParam), "");
		dsd.addColumn("T2", "Tuberculosis-T2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 2), indParam), "");
		dsd.addColumn("T3", "Tuberculosis-T3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 3), indParam), "");
		dsd.addColumn("T4", "Tuberculosis-T4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 4), indParam), "");
		dsd.addColumn("T5", "Tuberculosis-T5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 5), indParam), "");
		dsd.addColumn("T6", "Tuberculosis-T6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 6), indParam), "");
		dsd.addColumn("T7", "Tuberculosis-T7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 7), indParam), "");
		dsd.addColumn("T8", "Tuberculosis-T8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 8), indParam), "");
		dsd.addColumn("T9", "Tuberculosis-T9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 9), indParam), "");
		dsd.addColumn("T10", "Tuberculosis-T10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 10), indParam), "");
		dsd.addColumn("T11", "Tuberculosis-T11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 11), indParam), "");
		dsd.addColumn("T12", "Tuberculosis-T12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 12), indParam), "");
		dsd.addColumn("T13", "Tuberculosis-T13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 13), indParam), "");
		dsd.addColumn("T14", "Tuberculosis-T14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 14), indParam), "");
		dsd.addColumn("T15", "Tuberculosis-T15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 15), indParam), "");
		dsd.addColumn("T16", "Tuberculosis-T16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 16), indParam), "");
		dsd.addColumn("T17", "Tuberculosis-T17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 17), indParam), "");
		dsd.addColumn("T18", "Tuberculosis-T18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 18), indParam), "");
		dsd.addColumn("T19", "Tuberculosis-T19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 19), indParam), "");
		dsd.addColumn("T20", "Tuberculosis-T20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 20), indParam), "");
		dsd.addColumn("T21", "Tuberculosis-T21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 21), indParam), "");
		dsd.addColumn("T22", "Tuberculosis-T22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 22), indParam), "");
		dsd.addColumn("T23", "Tuberculosis-T23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 23), indParam), "");
		dsd.addColumn("T24", "Tuberculosis-T24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 24), indParam), "");
		dsd.addColumn("T25", "Tuberculosis-T25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 25), indParam), "");
		dsd.addColumn("T26", "Tuberculosis-T26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 26), indParam), "");
		dsd.addColumn("T27", "Tuberculosis-T27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 27), indParam), "");
		dsd.addColumn("T28", "Tuberculosis-T28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 28), indParam), "");
		dsd.addColumn("T29", "Tuberculosis-T29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 29), indParam), "");
		dsd.addColumn("T30", "Tuberculosis-T30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 30), indParam), "");
		dsd.addColumn("T31", "Tuberculosis-T31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 31), indParam), "");
		
	}
	
	private void getDiarrhoea(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("D1", "Diarrhoea-D1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 1), indParam), "");
		dsd.addColumn("D2", "Diarrhoea-D2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 2), indParam), "");
		dsd.addColumn("D3", "Diarrhoea-D3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 3), indParam), "");
		dsd.addColumn("D4", "Diarrhoea-D4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 4), indParam), "");
		dsd.addColumn("D5", "Diarrhoea-D5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 5), indParam), "");
		dsd.addColumn("D6", "Diarrhoea-D6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 6), indParam), "");
		dsd.addColumn("D7", "Diarrhoea-D7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 7), indParam), "");
		dsd.addColumn("D8", "Diarrhoea-D8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 8), indParam), "");
		dsd.addColumn("D9", "Diarrhoea-D9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 9), indParam), "");
		dsd.addColumn("D10", "Diarrhoea-D10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 10), indParam), "");
		dsd.addColumn("D11", "Diarrhoea-D11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 11), indParam), "");
		dsd.addColumn("D12", "Diarrhoea-D12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 12), indParam), "");
		dsd.addColumn("D13", "Diarrhoea-D13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 13), indParam), "");
		dsd.addColumn("D14", "Diarrhoea-D14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 14), indParam), "");
		dsd.addColumn("D15", "Diarrhoea-D15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 15), indParam), "");
		dsd.addColumn("D16", "Diarrhoea-D16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 16), indParam), "");
		dsd.addColumn("D17", "Diarrhoea-D17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 17), indParam), "");
		dsd.addColumn("D18", "Diarrhoea-D18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 18), indParam), "");
		dsd.addColumn("D19", "Diarrhoea-D19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 19), indParam), "");
		dsd.addColumn("D20", "Diarrhoea-D20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 20), indParam), "");
		dsd.addColumn("D21", "Diarrhoea-D21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 21), indParam), "");
		dsd.addColumn("D22", "Diarrhoea-D22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 22), indParam), "");
		dsd.addColumn("D23", "Diarrhoea-D23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 23), indParam), "");
		dsd.addColumn("D24", "Diarrhoea-D24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 24), indParam), "");
		dsd.addColumn("D25", "Diarrhoea-D25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 25), indParam), "");
		dsd.addColumn("D26", "Diarrhoea-D26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 26), indParam), "");
		dsd.addColumn("D27", "Diarrhoea-D27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 27), indParam), "");
		dsd.addColumn("D28", "Diarrhoea-D28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 28), indParam), "");
		dsd.addColumn("D29", "Diarrhoea-D29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 29), indParam), "");
		dsd.addColumn("D30", "Diarrhoea-D30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 30), indParam), "");
		dsd.addColumn("D31", "Diarrhoea-D31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 31), indParam), "");
	}
	
	private void getDysentery(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("DY1", "Dysentery-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 1), indParam),
		    "");
		dsd.addColumn("DY2", "Dysentery-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 2), indParam),
		    "");
		dsd.addColumn("DY3", "Dysentery-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 3), indParam),
		    "");
		dsd.addColumn("DY4", "Dysentery-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 4), indParam),
		    "");
		dsd.addColumn("DY5", "Dysentery-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 5), indParam),
		    "");
		dsd.addColumn("DY6", "Dysentery-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 6), indParam),
		    "");
		dsd.addColumn("DY7", "Dysentery-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 7), indParam),
		    "");
		dsd.addColumn("DY8", "Dysentery-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 8), indParam),
		    "");
		dsd.addColumn("DY9", "Dysentery-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 9), indParam),
		    "");
		dsd.addColumn("DY10", "Dysentery-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 10), indParam),
		    "");
		dsd.addColumn("DY11", "Dysentery-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 11), indParam),
		    "");
		dsd.addColumn("DY12", "Dysentery-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 12), indParam),
		    "");
		dsd.addColumn("DY13", "Dysentery-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 13), indParam),
		    "");
		dsd.addColumn("DY14", "Dysentery-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 14), indParam),
		    "");
		dsd.addColumn("DY15", "Dysentery-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 15), indParam),
		    "");
		dsd.addColumn("DY16", "Dysentery-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 16), indParam),
		    "");
		dsd.addColumn("DY17", "Dysentery-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 17), indParam),
		    "");
		dsd.addColumn("DY18", "Dysentery-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 18), indParam),
		    "");
		dsd.addColumn("DY19", "Dysentery-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 19), indParam),
		    "");
		dsd.addColumn("DY20", "Dysentery-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 20), indParam),
		    "");
		dsd.addColumn("DY21", "Dysentery-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 21), indParam),
		    "");
		dsd.addColumn("DY22", "Dysentery-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 22), indParam),
		    "");
		dsd.addColumn("DY23", "Dysentery-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 23), indParam),
		    "");
		dsd.addColumn("DY24", "Dysentery-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 24), indParam),
		    "");
		dsd.addColumn("DY25", "Dysentery-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 25), indParam),
		    "");
		dsd.addColumn("DY26", "Dysentery-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 26), indParam),
		    "");
		dsd.addColumn("DY27", "Dysentery-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 27), indParam),
		    "");
		dsd.addColumn("DY28", "Dysentery-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 28), indParam),
		    "");
		dsd.addColumn("DY29", "Dysentery-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 29), indParam),
		    "");
		dsd.addColumn("DY30", "Dysentery-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 30), indParam),
		    "");
		dsd.addColumn("DY31", "Dysentery-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 31), indParam),
		    "");
		
	}
	
	private void getCholera(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("CH1", "Cholera-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 1), indParam), "");
		dsd.addColumn("CH2", "Cholera-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 2), indParam), "");
		dsd.addColumn("CH3", "Cholera-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 3), indParam), "");
		dsd.addColumn("CH4", "Cholera-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 4), indParam), "");
		dsd.addColumn("CH5", "Cholera-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 5), indParam), "");
		dsd.addColumn("CH6", "Cholera-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 6), indParam), "");
		dsd.addColumn("CH7", "Cholera-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 7), indParam), "");
		dsd.addColumn("CH8", "Cholera-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 8), indParam), "");
		dsd.addColumn("CH9", "Cholera-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 9), indParam), "");
		dsd.addColumn("CH10", "Cholera-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 10), indParam), "");
		dsd.addColumn("CH11", "Cholera-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 11), indParam), "");
		dsd.addColumn("CH12", "Cholera-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 12), indParam), "");
		dsd.addColumn("CH13", "Cholera-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 13), indParam), "");
		dsd.addColumn("CH14", "Cholera-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 14), indParam), "");
		dsd.addColumn("CH15", "Cholera-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 15), indParam), "");
		dsd.addColumn("CH16", "Cholera-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 16), indParam), "");
		dsd.addColumn("CH17", "Cholera-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 17), indParam), "");
		dsd.addColumn("CH18", "Cholera-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 18), indParam), "");
		dsd.addColumn("CH19", "Cholera-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 19), indParam), "");
		dsd.addColumn("CH20", "Cholera-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 20), indParam), "");
		dsd.addColumn("CH21", "Cholera-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 21), indParam), "");
		dsd.addColumn("CH22", "Cholera-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 22), indParam), "");
		dsd.addColumn("CH23", "Cholera-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 23), indParam), "");
		dsd.addColumn("CH24", "Cholera-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 24), indParam), "");
		dsd.addColumn("CH25", "Cholera-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 25), indParam), "");
		dsd.addColumn("CH26", "Cholera-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 26), indParam), "");
		dsd.addColumn("CH27", "Cholera-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 27), indParam), "");
		dsd.addColumn("CH28", "Cholera-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 28), indParam), "");
		dsd.addColumn("CH29", "Cholera-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 29), indParam), "");
		dsd.addColumn("CH30", "Cholera-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 30), indParam), "");
		dsd.addColumn("CH31", "Cholera-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 31), indParam), "");
		
	}
	
	private void getMeningococcalMeningitis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("CH1", "MeningococcalMeningitis-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 1), indParam), "");
		dsd.addColumn("CH2", "MeningococcalMeningitis-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 2), indParam), "");
		dsd.addColumn("CH3", "MeningococcalMeningitis-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 3), indParam), "");
		dsd.addColumn("CH4", "MeningococcalMeningitis-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 4), indParam), "");
		dsd.addColumn("CH5", "MeningococcalMeningitis-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 5), indParam), "");
		dsd.addColumn("CH6", "MeningococcalMeningitis-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 6), indParam), "");
		dsd.addColumn("CH7", "MeningococcalMeningitis-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 7), indParam), "");
		dsd.addColumn("CH8", "MeningococcalMeningitis-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 8), indParam), "");
		dsd.addColumn("CH9", "MeningococcalMeningitis-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 9), indParam), "");
		dsd.addColumn(
		    "CH10",
		    "MeningococcalMeningitis-Day 10",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 10), indParam),
		    "");
		dsd.addColumn(
		    "CH11",
		    "MeningococcalMeningitis-Day 11",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 11), indParam),
		    "");
		dsd.addColumn(
		    "CH12",
		    "MeningococcalMeningitis-Day 12",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 12), indParam),
		    "");
		dsd.addColumn(
		    "CH13",
		    "MeningococcalMeningitis-Day 13",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 13), indParam),
		    "");
		dsd.addColumn(
		    "CH14",
		    "MeningococcalMeningitis-Day 14",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 14), indParam),
		    "");
		dsd.addColumn(
		    "CH15",
		    "MeningococcalMeningitis-Day 15",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 15), indParam),
		    "");
		dsd.addColumn(
		    "CH16",
		    "MeningococcalMeningitis-Day 16",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 16), indParam),
		    "");
		dsd.addColumn(
		    "CH17",
		    "MeningococcalMeningitis-Day 17",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 17), indParam),
		    "");
		dsd.addColumn(
		    "CH18",
		    "MeningococcalMeningitis-Day 18",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 18), indParam),
		    "");
		dsd.addColumn(
		    "CH19",
		    "MeningococcalMeningitis-Day 19",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 19), indParam),
		    "");
		dsd.addColumn(
		    "CH20",
		    "MeningococcalMeningitis-Day 20",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 20), indParam),
		    "");
		dsd.addColumn(
		    "CH21",
		    "MeningococcalMeningitis-Day 21",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 21), indParam),
		    "");
		dsd.addColumn(
		    "CH22",
		    "MeningococcalMeningitis-Day 22",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 22), indParam),
		    "");
		dsd.addColumn(
		    "CH23",
		    "MeningococcalMeningitis-Day 23",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 23), indParam),
		    "");
		dsd.addColumn(
		    "CH24",
		    "MeningococcalMeningitis-Day 24",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 24), indParam),
		    "");
		dsd.addColumn(
		    "CH25",
		    "MeningococcalMeningitis-Day 25",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 25), indParam),
		    "");
		dsd.addColumn(
		    "CH26",
		    "MeningococcalMeningitis-Day 26",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 26), indParam),
		    "");
		dsd.addColumn(
		    "CH27",
		    "MeningococcalMeningitis-Day 27",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 27), indParam),
		    "");
		dsd.addColumn(
		    "CH28",
		    "MeningococcalMeningitis-Day 28",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 28), indParam),
		    "");
		dsd.addColumn(
		    "CH29",
		    "MeningococcalMeningitis-Day 29",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 29), indParam),
		    "");
		dsd.addColumn(
		    "CH30",
		    "MeningococcalMeningitis-Day 30",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 30), indParam),
		    "");
		dsd.addColumn(
		    "CH31",
		    "MeningococcalMeningitis-Day 31",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 31), indParam),
		    "");
		
	}
	
	private void getOtherMenigitis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("OM1", "OtherMenigitis-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 1), indParam), "");
		dsd.addColumn("OM2", "OtherMenigitis-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 2), indParam), "");
		dsd.addColumn("OM3", "OtherMenigitis-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 3), indParam), "");
		dsd.addColumn("OM4", "OtherMenigitis-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 4), indParam), "");
		dsd.addColumn("OM5", "OtherMenigitis-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 5), indParam), "");
		dsd.addColumn("OM6", "OtherMenigitis-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 6), indParam), "");
		dsd.addColumn("OM7", "OtherMenigitis-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 7), indParam), "");
		dsd.addColumn("OM8", "OtherMenigitis-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 8), indParam), "");
		dsd.addColumn("OM9", "OtherMenigitis-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 9), indParam), "");
		dsd.addColumn("OM10", "OtherMenigitis-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 10), indParam), "");
		dsd.addColumn("OM11", "OtherMenigitis-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 11), indParam), "");
		dsd.addColumn("OM12", "OtherMenigitis-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 12), indParam), "");
		dsd.addColumn("OM13", "OtherMenigitis-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 13), indParam), "");
		dsd.addColumn("OM14", "OtherMenigitis-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 14), indParam), "");
		dsd.addColumn("OM15", "OtherMenigitis-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 15), indParam), "");
		dsd.addColumn("OM16", "OtherMenigitis-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 16), indParam), "");
		dsd.addColumn("OM17", "OtherMenigitis-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 17), indParam), "");
		dsd.addColumn("OM18", "OtherMenigitis-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 18), indParam), "");
		dsd.addColumn("OM19", "OtherMenigitis-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 19), indParam), "");
		dsd.addColumn("OM20", "OtherMenigitis-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 20), indParam), "");
		dsd.addColumn("OM21", "OtherMenigitis-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 21), indParam), "");
		dsd.addColumn("OM22", "OtherMenigitis-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 22), indParam), "");
		dsd.addColumn("OM23", "OtherMenigitis-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 23), indParam), "");
		dsd.addColumn("OM24", "OtherMenigitis-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 24), indParam), "");
		dsd.addColumn("OM25", "OtherMenigitis-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 25), indParam), "");
		dsd.addColumn("OM26", "OtherMenigitis-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 26), indParam), "");
		dsd.addColumn("OM27", "OtherMenigitis-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 27), indParam), "");
		dsd.addColumn("OM28", "OtherMenigitis-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 28), indParam), "");
		dsd.addColumn("OM29", "OtherMenigitis-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 29), indParam), "");
		dsd.addColumn("OM30", "OtherMenigitis-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 30), indParam), "");
		dsd.addColumn("OM31", "OtherMenigitis-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 31), indParam), "");
		
	}
	
	private void getPoliomyelitis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("P1", "Poliomyelitis-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 1), indParam), "");
		dsd.addColumn("P2", "Poliomyelitis-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 2), indParam), "");
		dsd.addColumn("P3", "Poliomyelitis-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 3), indParam), "");
		dsd.addColumn("P4", "Poliomyelitis-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 4), indParam), "");
		dsd.addColumn("P5", "Poliomyelitis-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 5), indParam), "");
		dsd.addColumn("P6", "Poliomyelitis-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 6), indParam), "");
		dsd.addColumn("P7", "Poliomyelitis-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 7), indParam), "");
		dsd.addColumn("P8", "Poliomyelitis-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 8), indParam), "");
		dsd.addColumn("P9", "Poliomyelitis-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 9), indParam), "");
		dsd.addColumn("P10", "Poliomyelitis-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 10), indParam), "");
		dsd.addColumn("P11", "Poliomyelitis-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 11), indParam), "");
		dsd.addColumn("P12", "Poliomyelitis-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 12), indParam), "");
		dsd.addColumn("P13", "Poliomyelitis-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 13), indParam), "");
		dsd.addColumn("P14", "Poliomyelitis-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 14), indParam), "");
		dsd.addColumn("P15", "Poliomyelitis-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 15), indParam), "");
		dsd.addColumn("P16", "Poliomyelitis-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 16), indParam), "");
		dsd.addColumn("P17", "Poliomyelitis-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 17), indParam), "");
		dsd.addColumn("P18", "Poliomyelitis-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 18), indParam), "");
		dsd.addColumn("P19", "Poliomyelitis-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 19), indParam), "");
		dsd.addColumn("P20", "Poliomyelitis-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 20), indParam), "");
		dsd.addColumn("P21", "Poliomyelitis-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 21), indParam), "");
		dsd.addColumn("P22", "Poliomyelitis-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 22), indParam), "");
		dsd.addColumn("P23", "Poliomyelitis-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 23), indParam), "");
		dsd.addColumn("P24", "Poliomyelitis-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 24), indParam), "");
		dsd.addColumn("P25", "Poliomyelitis-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 25), indParam), "");
		dsd.addColumn("P26", "Poliomyelitis-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 26), indParam), "");
		dsd.addColumn("P27", "Poliomyelitis-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 27), indParam), "");
		dsd.addColumn("P28", "Poliomyelitis-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 28), indParam), "");
		dsd.addColumn("P29", "Poliomyelitis-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 29), indParam), "");
		dsd.addColumn("P30", "Poliomyelitis-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 30), indParam), "");
		dsd.addColumn("P31", "Poliomyelitis-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 31), indParam), "");
		
	}
	
	private void getNeonatalTetanus(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("NT1", "NeonatalTetanus-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 1), indParam), "");
		dsd.addColumn("NT2", "NeonatalTetanus-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 2), indParam), "");
		dsd.addColumn("NT3", "NeonatalTetanus-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 3), indParam), "");
		dsd.addColumn("NT4", "NeonatalTetanus-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 4), indParam), "");
		dsd.addColumn("NT5", "NeonatalTetanus-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 5), indParam), "");
		dsd.addColumn("NT6", "NeonatalTetanus-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 6), indParam), "");
		dsd.addColumn("NT7", "NeonatalTetanus-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 7), indParam), "");
		dsd.addColumn("NT8", "NeonatalTetanus-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 8), indParam), "");
		dsd.addColumn("NT9", "NeonatalTetanus-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 9), indParam), "");
		dsd.addColumn("NT10", "NeonatalTetanus-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 10), indParam), "");
		dsd.addColumn("NT11", "NeonatalTetanus-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 11), indParam), "");
		dsd.addColumn("NT12", "NeonatalTetanus-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 12), indParam), "");
		dsd.addColumn("NT13", "NeonatalTetanus-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 13), indParam), "");
		dsd.addColumn("NT14", "NeonatalTetanus-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 14), indParam), "");
		dsd.addColumn("NT15", "NeonatalTetanus-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 15), indParam), "");
		dsd.addColumn("NT16", "NeonatalTetanus-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 16), indParam), "");
		dsd.addColumn("NT17", "NeonatalTetanus-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 17), indParam), "");
		dsd.addColumn("NT18", "NeonatalTetanus-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 18), indParam), "");
		dsd.addColumn("NT19", "NeonatalTetanus-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 19), indParam), "");
		dsd.addColumn("NT20", "NeonatalTetanus-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 20), indParam), "");
		dsd.addColumn("NT21", "NeonatalTetanus-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 21), indParam), "");
		dsd.addColumn("NT22", "NeonatalTetanus-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 22), indParam), "");
		dsd.addColumn("NT23", "NeonatalTetanus-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 23), indParam), "");
		dsd.addColumn("NT24", "NeonatalTetanus-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 24), indParam), "");
		dsd.addColumn("NT25", "NeonatalTetanus-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 25), indParam), "");
		dsd.addColumn("NT26", "NeonatalTetanus-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 26), indParam), "");
		dsd.addColumn("NT27", "NeonatalTetanus-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 27), indParam), "");
		dsd.addColumn("NT28", "NeonatalTetanus-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 28), indParam), "");
		dsd.addColumn("NT29", "NeonatalTetanus-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 29), indParam), "");
		dsd.addColumn("NT30", "NeonatalTetanus-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 30), indParam), "");
		dsd.addColumn("NT31", "NeonatalTetanus-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 31), indParam), "");
		
	}
	
	private void getChickenPox(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("CP1", "ChickenPox-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 1), indParam),
		    "");
		dsd.addColumn("CP2", "ChickenPox-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 2), indParam),
		    "");
		dsd.addColumn("CP3", "ChickenPox-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 3), indParam),
		    "");
		dsd.addColumn("CP4", "ChickenPox-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 4), indParam),
		    "");
		dsd.addColumn("CP5", "ChickenPox-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 5), indParam),
		    "");
		dsd.addColumn("CP6", "ChickenPox-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 6), indParam),
		    "");
		dsd.addColumn("CP7", "ChickenPox-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 7), indParam),
		    "");
		dsd.addColumn("CP8", "ChickenPox-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 8), indParam),
		    "");
		dsd.addColumn("CP9", "ChickenPox-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 9), indParam),
		    "");
		dsd.addColumn("CP10", "ChickenPox-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 10), indParam),
		    "");
		dsd.addColumn("CP11", "ChickenPox-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 11), indParam),
		    "");
		dsd.addColumn("CP12", "ChickenPox-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 12), indParam),
		    "");
		dsd.addColumn("CP13", "ChickenPox-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 13), indParam),
		    "");
		dsd.addColumn("CP14", "ChickenPox-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 14), indParam),
		    "");
		dsd.addColumn("CP15", "ChickenPox-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 15), indParam),
		    "");
		dsd.addColumn("CP16", "ChickenPox-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 16), indParam),
		    "");
		dsd.addColumn("CP17", "ChickenPox-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 17), indParam),
		    "");
		dsd.addColumn("CP18", "ChickenPox-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 18), indParam),
		    "");
		dsd.addColumn("CP19", "ChickenPox-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 19), indParam),
		    "");
		dsd.addColumn("CP20", "ChickenPox-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 20), indParam),
		    "");
		dsd.addColumn("CP21", "ChickenPox-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 21), indParam),
		    "");
		dsd.addColumn("CP22", "ChickenPox-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 22), indParam),
		    "");
		dsd.addColumn("CP23", "ChickenPox-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 23), indParam),
		    "");
		dsd.addColumn("CP24", "ChickenPox-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 24), indParam),
		    "");
		dsd.addColumn("CP25", "ChickenPox-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 25), indParam),
		    "");
		dsd.addColumn("CP26", "ChickenPox-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 26), indParam),
		    "");
		dsd.addColumn("CP27", "ChickenPox-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 27), indParam),
		    "");
		dsd.addColumn("CP28", "ChickenPox-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 28), indParam),
		    "");
		dsd.addColumn("CP29", "ChickenPox-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 29), indParam),
		    "");
		dsd.addColumn("CP30", "ChickenPox-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 30), indParam),
		    "");
		dsd.addColumn("CP31", "ChickenPox-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 31), indParam),
		    "");
		
	}
	
	private void getMeasles(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("MS1", "Measles-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 1), indParam), "");
		dsd.addColumn("MS2", "Measles-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 2), indParam), "");
		dsd.addColumn("MS3", "Measles-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 3), indParam), "");
		dsd.addColumn("MS4", "Measles-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 4), indParam), "");
		dsd.addColumn("MS5", "Measles-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 5), indParam), "");
		dsd.addColumn("MS6", "Measles-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 6), indParam), "");
		dsd.addColumn("MS7", "Measles-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 7), indParam), "");
		dsd.addColumn("MS8", "Measles-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 8), indParam), "");
		dsd.addColumn("MS9", "Measles-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 9), indParam), "");
		dsd.addColumn("MS10", "Measles-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 10), indParam), "");
		dsd.addColumn("MS11", "Measles-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 11), indParam), "");
		dsd.addColumn("MS12", "Measles-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 12), indParam), "");
		dsd.addColumn("MS13", "Measles-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 13), indParam), "");
		dsd.addColumn("MS14", "Measles-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 14), indParam), "");
		dsd.addColumn("MS15", "Measles-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 15), indParam), "");
		dsd.addColumn("MS16", "Measles-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 16), indParam), "");
		dsd.addColumn("MS17", "Measles-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 17), indParam), "");
		dsd.addColumn("MS18", "Measles-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 18), indParam), "");
		dsd.addColumn("MS19", "Measles-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 19), indParam), "");
		dsd.addColumn("MS20", "Measles-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 20), indParam), "");
		dsd.addColumn("MS21", "Measles-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 21), indParam), "");
		dsd.addColumn("MS22", "Measles-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 22), indParam), "");
		dsd.addColumn("MS23", "Measles-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 23), indParam), "");
		dsd.addColumn("MS24", "Measles-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 24), indParam), "");
		dsd.addColumn("MS25", "Measles-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 25), indParam), "");
		dsd.addColumn("MS26", "Measles-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 26), indParam), "");
		dsd.addColumn("MS27", "Measles-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 27), indParam), "");
		dsd.addColumn("MS28", "Measles-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 28), indParam), "");
		dsd.addColumn("MS29", "Measles-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 29), indParam), "");
		dsd.addColumn("MS30", "Measles-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 30), indParam), "");
		dsd.addColumn("MS31", "Measles-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 31), indParam), "");
		
	}
	
	private void getHepatitis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("HP1", "Hepatitis-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 1), indParam),
		    "");
		dsd.addColumn("HP2", "Hepatitis-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 2), indParam),
		    "");
		dsd.addColumn("HP3", "Hepatitis-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 3), indParam),
		    "");
		dsd.addColumn("HP4", "Hepatitis-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 4), indParam),
		    "");
		dsd.addColumn("HP5", "Hepatitis-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 5), indParam),
		    "");
		dsd.addColumn("HP6", "Hepatitis-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 6), indParam),
		    "");
		dsd.addColumn("HP7", "Hepatitis-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 7), indParam),
		    "");
		dsd.addColumn("HP8", "Hepatitis-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 8), indParam),
		    "");
		dsd.addColumn("HP9", "Hepatitis-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 9), indParam),
		    "");
		dsd.addColumn("HP10", "Hepatitis-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 10), indParam),
		    "");
		dsd.addColumn("HP11", "Hepatitis-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 11), indParam),
		    "");
		dsd.addColumn("HP12", "Hepatitis-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 12), indParam),
		    "");
		dsd.addColumn("HP13", "Hepatitis-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 13), indParam),
		    "");
		dsd.addColumn("HP14", "Hepatitis-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 14), indParam),
		    "");
		dsd.addColumn("HP15", "Hepatitis-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 15), indParam),
		    "");
		dsd.addColumn("HP16", "Hepatitis-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 16), indParam),
		    "");
		dsd.addColumn("HP17", "Hepatitis-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 17), indParam),
		    "");
		dsd.addColumn("HP18", "Hepatitis-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 18), indParam),
		    "");
		dsd.addColumn("HP19", "Hepatitis-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 19), indParam),
		    "");
		dsd.addColumn("HP20", "Hepatitis-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 20), indParam),
		    "");
		dsd.addColumn("HP21", "Hepatitis-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 21), indParam),
		    "");
		dsd.addColumn("HP22", "Hepatitis-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 22), indParam),
		    "");
		dsd.addColumn("HP23", "Hepatitis-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 23), indParam),
		    "");
		dsd.addColumn("HP24", "Hepatitis-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 24), indParam),
		    "");
		dsd.addColumn("HP25", "Hepatitis-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 25), indParam),
		    "");
		dsd.addColumn("HP26", "Hepatitis-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 26), indParam),
		    "");
		dsd.addColumn("HP27", "Hepatitis-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 27), indParam),
		    "");
		dsd.addColumn("HP28", "Hepatitis-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 28), indParam),
		    "");
		dsd.addColumn("HP29", "Hepatitis-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 29), indParam),
		    "");
		dsd.addColumn("HP30", "Hepatitis-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 30), indParam),
		    "");
		dsd.addColumn("HP31", "Hepatitis-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 31), indParam),
		    "");
		
	}
	
	private void getMumps(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("MP1", "Mumps-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 1), indParam), "");
		dsd.addColumn("MP2", "Mumps-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 2), indParam), "");
		dsd.addColumn("MP3", "Mumps-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 3), indParam), "");
		dsd.addColumn("MP4", "Mumps-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 4), indParam), "");
		dsd.addColumn("MP5", "Mumps-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 5), indParam), "");
		dsd.addColumn("MP6", "Mumps-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 6), indParam), "");
		dsd.addColumn("MP7", "Mumps-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 7), indParam), "");
		dsd.addColumn("MP8", "Mumps-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 8), indParam), "");
		dsd.addColumn("MP9", "Mumps-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 9), indParam), "");
		dsd.addColumn("MP10", "Mumps-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 10), indParam), "");
		dsd.addColumn("MP11", "Mumps-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 11), indParam), "");
		dsd.addColumn("MP12", "Mumps-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 12), indParam), "");
		dsd.addColumn("MP13", "Mumps-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 13), indParam), "");
		dsd.addColumn("MP14", "Mumps-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 14), indParam), "");
		dsd.addColumn("MP15", "Mumps-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 15), indParam), "");
		dsd.addColumn("MP16", "Mumps-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 16), indParam), "");
		dsd.addColumn("MP17", "Mumps-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 17), indParam), "");
		dsd.addColumn("MP18", "Mumps-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 18), indParam), "");
		dsd.addColumn("MP19", "Mumps-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 19), indParam), "");
		dsd.addColumn("MP20", "Mumps-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 20), indParam), "");
		dsd.addColumn("MP21", "Mumps-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 21), indParam), "");
		dsd.addColumn("MP22", "Mumps-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 22), indParam), "");
		dsd.addColumn("MP23", "Mumps-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 23), indParam), "");
		dsd.addColumn("MP24", "Mumps-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 24), indParam), "");
		dsd.addColumn("MP25", "Mumps-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 25), indParam), "");
		dsd.addColumn("MP26", "Mumps-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 26), indParam), "");
		dsd.addColumn("MP27", "Mumps-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 27), indParam), "");
		dsd.addColumn("MP28", "Mumps-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 28), indParam), "");
		dsd.addColumn("MP29", "Mumps-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 29), indParam), "");
		dsd.addColumn("MP30", "Mumps-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 30), indParam), "");
		dsd.addColumn("MP31", "Mumps-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 31), indParam), "");
		
	}
	
	private void getFevers(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("F1", "Fevers-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 1), indParam), "");
		dsd.addColumn("F2", "Fevers-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 2), indParam), "");
		dsd.addColumn("F3", "Fevers-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 3), indParam), "");
		dsd.addColumn("F4", "Fevers-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 4), indParam), "");
		dsd.addColumn("F5", "Fevers-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 5), indParam), "");
		dsd.addColumn("F6", "Fevers-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 6), indParam), "");
		dsd.addColumn("F7", "Fevers-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 7), indParam), "");
		dsd.addColumn("F8", "Fevers-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 8), indParam), "");
		dsd.addColumn("F9", "Fevers-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 9), indParam), "");
		dsd.addColumn("F10", "Fevers-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 10), indParam), "");
		dsd.addColumn("F11", "Fevers-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 11), indParam), "");
		dsd.addColumn("F12", "Fevers-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 12), indParam), "");
		dsd.addColumn("F13", "Fevers-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 13), indParam), "");
		dsd.addColumn("F14", "Fevers-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 14), indParam), "");
		dsd.addColumn("F15", "Fevers-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 15), indParam), "");
		dsd.addColumn("F16", "Fevers-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 16), indParam), "");
		dsd.addColumn("F17", "Fevers-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 17), indParam), "");
		dsd.addColumn("F18", "Fevers-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 18), indParam), "");
		dsd.addColumn("F19", "Fevers-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 19), indParam), "");
		dsd.addColumn("F20", "Fevers-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 20), indParam), "");
		dsd.addColumn("F21", "Fevers-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 21), indParam), "");
		dsd.addColumn("F22", "Fevers-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 22), indParam), "");
		dsd.addColumn("F23", "Fevers-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 23), indParam), "");
		dsd.addColumn("F24", "Fevers-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 24), indParam), "");
		dsd.addColumn("F25", "Fevers-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 25), indParam), "");
		dsd.addColumn("F26", "Fevers-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 26), indParam), "");
		dsd.addColumn("F27", "Fevers-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 27), indParam), "");
		dsd.addColumn("F28", "Fevers-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 28), indParam), "");
		dsd.addColumn("F29", "Fevers-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 29), indParam), "");
		dsd.addColumn("F30", "Fevers-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 30), indParam), "");
		dsd.addColumn("F31", "Fevers-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 31), indParam), "");
		
	}
	
	private void getSuspectedMalaria(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("SM1", "SuspectedMalaria-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 1), indParam), "");
		dsd.addColumn("SM2", "SuspectedMalaria-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 2), indParam), "");
		dsd.addColumn("SM3", "SuspectedMalaria-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 3), indParam), "");
		dsd.addColumn("SM4", "SuspectedMalaria-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 4), indParam), "");
		dsd.addColumn("SM5", "SuspectedMalaria-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 5), indParam), "");
		dsd.addColumn("SM6", "SuspectedMalaria-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 6), indParam), "");
		dsd.addColumn("SM7", "SuspectedMalaria-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 7), indParam), "");
		dsd.addColumn("SM8", "SuspectedMalaria-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 8), indParam), "");
		dsd.addColumn("SM9", "SuspectedMalaria-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 9), indParam), "");
		dsd.addColumn("SM10", "SuspectedMalaria-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 10), indParam), "");
		dsd.addColumn("SM11", "SuspectedMalaria-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 11), indParam), "");
		dsd.addColumn("SM12", "SuspectedMalaria-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 12), indParam), "");
		dsd.addColumn("SM13", "SuspectedMalaria-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 13), indParam), "");
		dsd.addColumn("SM14", "SuspectedMalaria-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 14), indParam), "");
		dsd.addColumn("SM15", "SuspectedMalaria-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 15), indParam), "");
		dsd.addColumn("SM16", "SuspectedMalaria-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 16), indParam), "");
		dsd.addColumn("SM17", "SuspectedMalaria-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 17), indParam), "");
		dsd.addColumn("SM18", "SuspectedMalaria-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 18), indParam), "");
		dsd.addColumn("SM19", "SuspectedMalaria-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 19), indParam), "");
		dsd.addColumn("SM20", "SuspectedMalaria-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 20), indParam), "");
		dsd.addColumn("SM21", "SuspectedMalaria-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 21), indParam), "");
		dsd.addColumn("SM22", "SuspectedMalaria-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 22), indParam), "");
		dsd.addColumn("SM23", "SuspectedMalaria-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 23), indParam), "");
		dsd.addColumn("SM24", "SuspectedMalaria-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 24), indParam), "");
		dsd.addColumn("SM25", "SuspectedMalaria-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 25), indParam), "");
		dsd.addColumn("SM26", "SuspectedMalaria-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 26), indParam), "");
		dsd.addColumn("SM27", "SuspectedMalaria-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 27), indParam), "");
		dsd.addColumn("SM28", "SuspectedMalaria-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 28), indParam), "");
		dsd.addColumn("SM29", "SuspectedMalaria-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 29), indParam), "");
		dsd.addColumn("SM30", "SuspectedMalaria-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 30), indParam), "");
		dsd.addColumn("SM31", "SuspectedMalaria-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 31), indParam), "");
		
	}
	
	private void getConfirmedMalaria(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("CM1", "ConfirmedMalaria-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 1), indParam), "");
		dsd.addColumn("CM2", "ConfirmedMalaria-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 2), indParam), "");
		dsd.addColumn("CM3", "ConfirmedMalaria-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 3), indParam), "");
		dsd.addColumn("CM4", "ConfirmedMalaria-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 4), indParam), "");
		dsd.addColumn("CM5", "ConfirmedMalaria-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 5), indParam), "");
		dsd.addColumn("CM6", "ConfirmedMalaria-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 6), indParam), "");
		dsd.addColumn("CM7", "ConfirmedMalaria-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 7), indParam), "");
		dsd.addColumn("CM8", "ConfirmedMalaria-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 8), indParam), "");
		dsd.addColumn("CM9", "ConfirmedMalaria-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 9), indParam), "");
		dsd.addColumn("CM10", "ConfirmedMalaria-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 10), indParam), "");
		dsd.addColumn("CM11", "ConfirmedMalaria-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 11), indParam), "");
		dsd.addColumn("CM12", "ConfirmedMalaria-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 12), indParam), "");
		dsd.addColumn("CM13", "ConfirmedMalaria-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 13), indParam), "");
		dsd.addColumn("CM14", "ConfirmedMalaria-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 14), indParam), "");
		dsd.addColumn("CM15", "ConfirmedMalaria-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 15), indParam), "");
		dsd.addColumn("CM16", "ConfirmedMalaria-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 16), indParam), "");
		dsd.addColumn("CM17", "ConfirmedMalaria-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 17), indParam), "");
		dsd.addColumn("CM18", "ConfirmedMalaria-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 18), indParam), "");
		dsd.addColumn("CM19", "ConfirmedMalaria-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 19), indParam), "");
		dsd.addColumn("CM20", "ConfirmedMalaria-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 20), indParam), "");
		dsd.addColumn("CM21", "ConfirmedMalaria-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 21), indParam), "");
		dsd.addColumn("CM22", "ConfirmedMalaria-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 22), indParam), "");
		dsd.addColumn("CM23", "ConfirmedMalaria-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 23), indParam), "");
		dsd.addColumn("CM24", "ConfirmedMalaria-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 24), indParam), "");
		dsd.addColumn("CM25", "ConfirmedMalaria-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 25), indParam), "");
		dsd.addColumn("CM26", "ConfirmedMalaria-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 26), indParam), "");
		dsd.addColumn("CM27", "ConfirmedMalaria-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 27), indParam), "");
		dsd.addColumn("CM28", "ConfirmedMalaria-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 28), indParam), "");
		dsd.addColumn("CM29", "ConfirmedMalaria-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 29), indParam), "");
		dsd.addColumn("CM30", "ConfirmedMalaria-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 30), indParam), "");
		dsd.addColumn("CM31", "ConfirmedMalaria-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 31), indParam), "");
		
	}
	
	private void getUrinaryTractInfection(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("UTI1", "UrinaryTractInfection-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 1), indParam), "");
		dsd.addColumn("UTI2", "UrinaryTractInfection-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 2), indParam), "");
		dsd.addColumn("UTI3", "UrinaryTractInfection-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 3), indParam), "");
		dsd.addColumn("UTI4", "UrinaryTractInfection-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 4), indParam), "");
		dsd.addColumn("UTI5", "UrinaryTractInfection-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 5), indParam), "");
		dsd.addColumn("UTI6", "UrinaryTractInfection-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 6), indParam), "");
		dsd.addColumn("UTI7", "UrinaryTractInfection-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 7), indParam), "");
		dsd.addColumn("UTI8", "UrinaryTractInfection-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 8), indParam), "");
		dsd.addColumn("UTI9", "UrinaryTractInfection-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 9), indParam), "");
		dsd.addColumn("UTI10", "UrinaryTractInfection-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 10), indParam), "");
		dsd.addColumn("UTI11", "UrinaryTractInfection-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 11), indParam), "");
		dsd.addColumn("UTI12", "UrinaryTractInfection-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 12), indParam), "");
		dsd.addColumn("UTI13", "UrinaryTractInfection-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 13), indParam), "");
		dsd.addColumn("UTI14", "UrinaryTractInfection-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 14), indParam), "");
		dsd.addColumn("UTI15", "UrinaryTractInfection-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 15), indParam), "");
		dsd.addColumn("UTI16", "UrinaryTractInfection-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 16), indParam), "");
		dsd.addColumn("UTI17", "UrinaryTractInfection-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 17), indParam), "");
		dsd.addColumn("UTI18", "UrinaryTractInfection-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 18), indParam), "");
		dsd.addColumn("UTI19", "UrinaryTractInfection-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 19), indParam), "");
		dsd.addColumn("UTI20", "UrinaryTractInfection-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 20), indParam), "");
		dsd.addColumn("UTI21", "UrinaryTractInfection-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 21), indParam), "");
		dsd.addColumn("UTI22", "UrinaryTractInfection-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 22), indParam), "");
		dsd.addColumn("UTI23", "UrinaryTractInfection-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 23), indParam), "");
		dsd.addColumn("UTI24", "UrinaryTractInfection-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 24), indParam), "");
		dsd.addColumn("UTI25", "UrinaryTractInfection-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 25), indParam), "");
		dsd.addColumn("UTI26", "UrinaryTractInfection-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 26), indParam), "");
		dsd.addColumn("UTI27", "UrinaryTractInfection-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 27), indParam), "");
		dsd.addColumn("UTI28", "UrinaryTractInfection-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 28), indParam), "");
		dsd.addColumn("UTI29", "UrinaryTractInfection-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 29), indParam), "");
		dsd.addColumn("UTI30", "UrinaryTractInfection-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 30), indParam), "");
		dsd.addColumn("UTI31", "UrinaryTractInfection-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 31), indParam), "");
		
	}
	
	private void getTyphoid(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("TY1", "Typhoid-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 1), indParam), "");
		dsd.addColumn("TY2", "Typhoid-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 2), indParam), "");
		dsd.addColumn("TY3", "Typhoid-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 3), indParam), "");
		dsd.addColumn("TY4", "Typhoid-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 4), indParam), "");
		dsd.addColumn("TY5", "Typhoid-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 5), indParam), "");
		dsd.addColumn("TY6", "Typhoid-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 6), indParam), "");
		dsd.addColumn("TY7", "Typhoid-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 7), indParam), "");
		dsd.addColumn("TY8", "Typhoid-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 8), indParam), "");
		dsd.addColumn("TY9", "Typhoid-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 9), indParam), "");
		dsd.addColumn("TY10", "Typhoid-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 10), indParam), "");
		dsd.addColumn("TY11", "Typhoid-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 11), indParam), "");
		dsd.addColumn("TY12", "Typhoid-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 12), indParam), "");
		dsd.addColumn("TY13", "Typhoid-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 13), indParam), "");
		dsd.addColumn("TY14", "Typhoid-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 14), indParam), "");
		dsd.addColumn("TY15", "Typhoid-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 15), indParam), "");
		dsd.addColumn("TY16", "Typhoid-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 16), indParam), "");
		dsd.addColumn("TY17", "Typhoid-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 17), indParam), "");
		dsd.addColumn("TY18", "Typhoid-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 18), indParam), "");
		dsd.addColumn("TY19", "Typhoid-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 19), indParam), "");
		dsd.addColumn("TY20", "Typhoid-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 20), indParam), "");
		dsd.addColumn("TY21", "Typhoid-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 21), indParam), "");
		dsd.addColumn("TY22", "Typhoid-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 22), indParam), "");
		dsd.addColumn("TY23", "Typhoid-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 23), indParam), "");
		dsd.addColumn("TY24", "Typhoid-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 24), indParam), "");
		dsd.addColumn("TY25", "Typhoid-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 25), indParam), "");
		dsd.addColumn("TY26", "Typhoid-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 26), indParam), "");
		dsd.addColumn("TY27", "Typhoid-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 27), indParam), "");
		dsd.addColumn("TY28", "Typhoid-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 28), indParam), "");
		dsd.addColumn("TY29", "Typhoid-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 29), indParam), "");
		dsd.addColumn("TY30", "Typhoid-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 30), indParam), "");
		dsd.addColumn("TY31", "Typhoid-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), 31), indParam), "");
		
	}
	
	private void getBilharzia(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("B1", "Bilharzia-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 1), indParam),
		    "");
		dsd.addColumn("B2", "Bilharzia-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 2), indParam),
		    "");
		dsd.addColumn("B3", "Bilharzia-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 3), indParam),
		    "");
		dsd.addColumn("B4", "Bilharzia-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 4), indParam),
		    "");
		dsd.addColumn("B5", "Bilharzia-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 5), indParam),
		    "");
		dsd.addColumn("B6", "Bilharzia-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 6), indParam),
		    "");
		dsd.addColumn("B7", "Bilharzia-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 7), indParam),
		    "");
		dsd.addColumn("B8", "Bilharzia-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 8), indParam),
		    "");
		dsd.addColumn("B9", "Bilharzia-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 9), indParam),
		    "");
		dsd.addColumn("B10", "Bilharzia-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 10), indParam),
		    "");
		dsd.addColumn("B11", "Bilharzia-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 11), indParam),
		    "");
		dsd.addColumn("B12", "Bilharzia-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 12), indParam),
		    "");
		dsd.addColumn("B13", "Bilharzia-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 13), indParam),
		    "");
		dsd.addColumn("B14", "Bilharzia-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 14), indParam),
		    "");
		dsd.addColumn("B15", "Bilharzia-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 15), indParam),
		    "");
		dsd.addColumn("B16", "Bilharzia-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 16), indParam),
		    "");
		dsd.addColumn("B17", "Bilharzia-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 17), indParam),
		    "");
		dsd.addColumn("B18", "Bilharzia-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 18), indParam),
		    "");
		dsd.addColumn("B19", "Bilharzia-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 19), indParam),
		    "");
		dsd.addColumn("B20", "Bilharzia-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 20), indParam),
		    "");
		dsd.addColumn("B21", "Bilharzia-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 21), indParam),
		    "");
		dsd.addColumn("B22", "Bilharzia-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 22), indParam),
		    "");
		dsd.addColumn("B23", "Bilharzia-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 23), indParam),
		    "");
		dsd.addColumn("B24", "Bilharzia-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 24), indParam),
		    "");
		dsd.addColumn("B25", "Bilharzia-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 25), indParam),
		    "");
		dsd.addColumn("B26", "Bilharzia-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 26), indParam),
		    "");
		dsd.addColumn("B27", "Bilharzia-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 27), indParam),
		    "");
		dsd.addColumn("B28", "Bilharzia-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 28), indParam),
		    "");
		dsd.addColumn("B29", "Bilharzia-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 29), indParam),
		    "");
		dsd.addColumn("B30", "Bilharzia-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 30), indParam),
		    "");
		dsd.addColumn("B31", "Bilharzia-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), 31), indParam),
		    "");
		
	}
	
	private void getInterstinalworms(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("IW1", "Interstinalworms-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 1), indParam), "");
		dsd.addColumn("IW2", "Interstinalworms-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 2), indParam), "");
		dsd.addColumn("IW3", "Interstinalworms-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 3), indParam), "");
		dsd.addColumn("IW4", "Interstinalworms-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 4), indParam), "");
		dsd.addColumn("IW5", "Interstinalworms-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 5), indParam), "");
		dsd.addColumn("IW6", "Interstinalworms-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 6), indParam), "");
		dsd.addColumn("IW7", "Interstinalworms-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 7), indParam), "");
		dsd.addColumn("IW8", "Interstinalworms-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 8), indParam), "");
		dsd.addColumn("IW9", "Interstinalworms-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 9), indParam), "");
		dsd.addColumn("IW10", "Interstinalworms-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 10), indParam), "");
		dsd.addColumn("IW11", "Interstinalworms-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 11), indParam), "");
		dsd.addColumn("IW12", "Interstinalworms-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 12), indParam), "");
		dsd.addColumn("IW13", "Interstinalworms-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 13), indParam), "");
		dsd.addColumn("IW14", "Interstinalworms-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 14), indParam), "");
		dsd.addColumn("IW15", "Interstinalworms-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 15), indParam), "");
		dsd.addColumn("IW16", "Interstinalworms-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 16), indParam), "");
		dsd.addColumn("IW17", "Interstinalworms-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 17), indParam), "");
		dsd.addColumn("IW18", "Interstinalworms-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 18), indParam), "");
		dsd.addColumn("IW19", "Interstinalworms-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 19), indParam), "");
		dsd.addColumn("IW20", "Interstinalworms-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 20), indParam), "");
		dsd.addColumn("IW21", "Interstinalworms-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 21), indParam), "");
		dsd.addColumn("IW22", "Interstinalworms-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 22), indParam), "");
		dsd.addColumn("IW23", "Interstinalworms-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 23), indParam), "");
		dsd.addColumn("IW24", "Interstinalworms-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 24), indParam), "");
		dsd.addColumn("IW25", "Interstinalworms-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 25), indParam), "");
		dsd.addColumn("IW26", "Interstinalworms-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 26), indParam), "");
		dsd.addColumn("IW27", "Interstinalworms-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 27), indParam), "");
		dsd.addColumn("IW28", "Interstinalworms-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 28), indParam), "");
		dsd.addColumn("IW29", "Interstinalworms-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 29), indParam), "");
		dsd.addColumn("IW30", "Interstinalworms-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 30), indParam), "");
		dsd.addColumn("IW31", "Interstinalworms-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), 31), indParam), "");
		
	}
	
	private void getMalnutrition(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn(
		    "MN1",
		    "Malnutrition-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 1), indParam),
		    "");
		dsd.addColumn(
		    "MN2",
		    "Malnutrition-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 2), indParam),
		    "");
		dsd.addColumn(
		    "MN3",
		    "Malnutrition-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 3), indParam),
		    "");
		dsd.addColumn(
		    "MN4",
		    "Malnutrition-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 4), indParam),
		    "");
		dsd.addColumn(
		    "MN5",
		    "Malnutrition-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 5), indParam),
		    "");
		dsd.addColumn(
		    "MN6",
		    "Malnutrition-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 6), indParam),
		    "");
		dsd.addColumn(
		    "MN7",
		    "Malnutrition-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 7), indParam),
		    "");
		dsd.addColumn(
		    "MN8",
		    "Malnutrition-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 8), indParam),
		    "");
		dsd.addColumn(
		    "MN9",
		    "Malnutrition-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 9), indParam),
		    "");
		dsd.addColumn("MN10", "Malnutrition-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 10), indParam), "");
		dsd.addColumn("MN11", "Malnutrition-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 11), indParam), "");
		dsd.addColumn("MN12", "Malnutrition-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 12), indParam), "");
		dsd.addColumn("MN13", "Malnutrition-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 13), indParam), "");
		dsd.addColumn("MN14", "Malnutrition-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 14), indParam), "");
		dsd.addColumn("MN15", "Malnutrition-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 15), indParam), "");
		dsd.addColumn("MN16", "Malnutrition-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 16), indParam), "");
		dsd.addColumn("MN17", "Malnutrition-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 17), indParam), "");
		dsd.addColumn("MN18", "Malnutrition-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 18), indParam), "");
		dsd.addColumn("MN19", "Malnutrition-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 19), indParam), "");
		dsd.addColumn("MN20", "Malnutrition-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 20), indParam), "");
		dsd.addColumn("MN21", "Malnutrition-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 21), indParam), "");
		dsd.addColumn("MN22", "Malnutrition-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 22), indParam), "");
		dsd.addColumn("MN23", "Malnutrition-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 23), indParam), "");
		dsd.addColumn("MN24", "Malnutrition-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 24), indParam), "");
		dsd.addColumn("MN25", "Malnutrition-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 25), indParam), "");
		dsd.addColumn("MN26", "Malnutrition-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 26), indParam), "");
		dsd.addColumn("MN27", "Malnutrition-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 27), indParam), "");
		dsd.addColumn("MN28", "Malnutrition-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 28), indParam), "");
		dsd.addColumn("MN29", "Malnutrition-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 29), indParam), "");
		dsd.addColumn("MN30", "Malnutrition-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 30), indParam), "");
		dsd.addColumn("MN31", "Malnutrition-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), 31), indParam), "");
		
	}
	
	private void getAnaemia(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("AN1", "Anaemia-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 1), indParam), "");
		dsd.addColumn("AN2", "Anaemia-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 2), indParam), "");
		dsd.addColumn("AN3", "Anaemia-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 3), indParam), "");
		dsd.addColumn("AN4", "Anaemia-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 4), indParam), "");
		dsd.addColumn("AN5", "Anaemia-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 5), indParam), "");
		dsd.addColumn("AN6", "Anaemia-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 6), indParam), "");
		dsd.addColumn("AN7", "Anaemia-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 7), indParam), "");
		dsd.addColumn("AN8", "Anaemia-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 8), indParam), "");
		dsd.addColumn("AN9", "Anaemia-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 9), indParam), "");
		dsd.addColumn("AN10", "Anaemia-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 10), indParam), "");
		dsd.addColumn("AN11", "Anaemia-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 11), indParam), "");
		dsd.addColumn("AN12", "Anaemia-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 12), indParam), "");
		dsd.addColumn("AN13", "Anaemia-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 13), indParam), "");
		dsd.addColumn("AN14", "Anaemia-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 14), indParam), "");
		dsd.addColumn("AN15", "Anaemia-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 15), indParam), "");
		dsd.addColumn("AN16", "Anaemia-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 16), indParam), "");
		dsd.addColumn("AN17", "Anaemia-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 17), indParam), "");
		dsd.addColumn("AN18", "Anaemia-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 18), indParam), "");
		dsd.addColumn("AN19", "Anaemia-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 19), indParam), "");
		dsd.addColumn("AN20", "Anaemia-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 20), indParam), "");
		dsd.addColumn("AN21", "Anaemia-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 21), indParam), "");
		dsd.addColumn("AN22", "Anaemia-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 22), indParam), "");
		dsd.addColumn("AN23", "Anaemia-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 23), indParam), "");
		dsd.addColumn("AN24", "Anaemia-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 24), indParam), "");
		dsd.addColumn("AN25", "Anaemia-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 25), indParam), "");
		dsd.addColumn("AN26", "Anaemia-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 26), indParam), "");
		dsd.addColumn("AN27", "Anaemia-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 27), indParam), "");
		dsd.addColumn("AN28", "Anaemia-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 28), indParam), "");
		dsd.addColumn("AN29", "Anaemia-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 29), indParam), "");
		dsd.addColumn("AN30", "Anaemia-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 30), indParam), "");
		dsd.addColumn("AN31", "Anaemia-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), 31), indParam), "");
		
	}
	
	private void getEyeInfections(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("EI1", "EyeInfections-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 1), indParam), "");
		dsd.addColumn("EI2", "EyeInfections-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 2), indParam), "");
		dsd.addColumn("EI3", "EyeInfections-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 3), indParam), "");
		dsd.addColumn("EI4", "EyeInfections-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 4), indParam), "");
		dsd.addColumn("EI5", "EyeInfections-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 5), indParam), "");
		dsd.addColumn("EI6", "EyeInfections-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 6), indParam), "");
		dsd.addColumn("EI7", "EyeInfections-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 7), indParam), "");
		dsd.addColumn("EI8", "EyeInfections-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 8), indParam), "");
		dsd.addColumn("EI9", "EyeInfections-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 9), indParam), "");
		dsd.addColumn("EI10", "EyeInfections-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 10), indParam), "");
		dsd.addColumn("EI11", "EyeInfections-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 11), indParam), "");
		dsd.addColumn("EI12", "EyeInfections-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 12), indParam), "");
		dsd.addColumn("EI13", "EyeInfections-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 13), indParam), "");
		dsd.addColumn("EI14", "EyeInfections-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 14), indParam), "");
		dsd.addColumn("EI15", "EyeInfections-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 15), indParam), "");
		dsd.addColumn("EI16", "EyeInfections-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 16), indParam), "");
		dsd.addColumn("EI17", "EyeInfections-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 17), indParam), "");
		dsd.addColumn("EI18", "EyeInfections-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 18), indParam), "");
		dsd.addColumn("EI19", "EyeInfections-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 19), indParam), "");
		dsd.addColumn("EI20", "EyeInfections-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 20), indParam), "");
		dsd.addColumn("EI21", "EyeInfections-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 21), indParam), "");
		dsd.addColumn("EI22", "EyeInfections-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 22), indParam), "");
		dsd.addColumn("EI23", "EyeInfections-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 23), indParam), "");
		dsd.addColumn("EI24", "EyeInfections-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 24), indParam), "");
		dsd.addColumn("EI25", "EyeInfections-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 25), indParam), "");
		dsd.addColumn("EI26", "EyeInfections-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 26), indParam), "");
		dsd.addColumn("EI27", "EyeInfections-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 27), indParam), "");
		dsd.addColumn("EI28", "EyeInfections-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 28), indParam), "");
		dsd.addColumn("EI29", "EyeInfections-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 29), indParam), "");
		dsd.addColumn("EI30", "EyeInfections-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 30), indParam), "");
		dsd.addColumn("EI31", "EyeInfections-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), 31), indParam), "");
		
	}
	
	private void getOtherEyeConditions(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("EC1", "OtherEyeConditions-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 1), indParam), "");
		dsd.addColumn("EC2", "OtherEyeConditions-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 2), indParam), "");
		dsd.addColumn("EC3", "OtherEyeConditions-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 3), indParam), "");
		dsd.addColumn("EC4", "OtherEyeConditions-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 4), indParam), "");
		dsd.addColumn("EC5", "OtherEyeConditions-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 5), indParam), "");
		dsd.addColumn("EC6", "OtherEyeConditions-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 6), indParam), "");
		dsd.addColumn("EC7", "OtherEyeConditions-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 7), indParam), "");
		dsd.addColumn("EC8", "OtherEyeConditions-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 8), indParam), "");
		dsd.addColumn("EC9", "OtherEyeConditions-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 9), indParam), "");
		dsd.addColumn("EC10", "OtherEyeConditions-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 10), indParam), "");
		dsd.addColumn("EC11", "OtherEyeConditions-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 11), indParam), "");
		dsd.addColumn("EC12", "OtherEyeConditions-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 12), indParam), "");
		dsd.addColumn("EC13", "OtherEyeConditions-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 13), indParam), "");
		dsd.addColumn("EC14", "OtherEyeConditions-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 14), indParam), "");
		dsd.addColumn("EC15", "OtherEyeConditions-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 15), indParam), "");
		dsd.addColumn("EC16", "OtherEyeConditions-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 16), indParam), "");
		dsd.addColumn("EC17", "OtherEyeConditions-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 17), indParam), "");
		dsd.addColumn("EC18", "OtherEyeConditions-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 18), indParam), "");
		dsd.addColumn("EC19", "OtherEyeConditions-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 19), indParam), "");
		dsd.addColumn("EC20", "OtherEyeConditions-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 20), indParam), "");
		dsd.addColumn("EC21", "OtherEyeConditions-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 21), indParam), "");
		dsd.addColumn("EC22", "OtherEyeConditions-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 22), indParam), "");
		dsd.addColumn("EC23", "OtherEyeConditions-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 23), indParam), "");
		dsd.addColumn("EC24", "OtherEyeConditions-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 24), indParam), "");
		dsd.addColumn("EC25", "OtherEyeConditions-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 25), indParam), "");
		dsd.addColumn("EC26", "OtherEyeConditions-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 26), indParam), "");
		dsd.addColumn("EC27", "OtherEyeConditions-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 27), indParam), "");
		dsd.addColumn("EC28", "OtherEyeConditions-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 28), indParam), "");
		dsd.addColumn("EC29", "OtherEyeConditions-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 29), indParam), "");
		dsd.addColumn("EC30", "OtherEyeConditions-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 30), indParam), "");
		dsd.addColumn("EC31", "OtherEyeConditions-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), 31), indParam), "");
		
	}
	
	private void getEarInfectionsConditions(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("EIC1", "EarInfectionsConditions-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 1), indParam), "");
		dsd.addColumn("EIC2", "EarInfectionsConditions-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 2), indParam), "");
		dsd.addColumn("EIC3", "EarInfectionsConditions-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 3), indParam), "");
		dsd.addColumn("EIC4", "EarInfectionsConditions-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 4), indParam), "");
		dsd.addColumn("EIC5", "EarInfectionsConditions-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 5), indParam), "");
		dsd.addColumn("EIC6", "EarInfectionsConditions-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 6), indParam), "");
		dsd.addColumn("EIC7", "EarInfectionsConditions-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 7), indParam), "");
		dsd.addColumn("EIC8", "EarInfectionsConditions-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 8), indParam), "");
		dsd.addColumn("EIC9", "EarInfectionsConditions-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 9), indParam), "");
		dsd.addColumn(
		    "EIC10",
		    "EarInfectionsConditions-Day 10",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 10), indParam),
		    "");
		dsd.addColumn(
		    "EIC11",
		    "EarInfectionsConditions-Day 11",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 11), indParam),
		    "");
		dsd.addColumn(
		    "EIC12",
		    "EarInfectionsConditions-Day 12",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 12), indParam),
		    "");
		dsd.addColumn(
		    "EIC13",
		    "EarInfectionsConditions-Day 13",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 13), indParam),
		    "");
		dsd.addColumn(
		    "EIC14",
		    "EarInfectionsConditions-Day 14",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 14), indParam),
		    "");
		dsd.addColumn(
		    "EIC15",
		    "EarInfectionsConditions-Day 15",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 15), indParam),
		    "");
		dsd.addColumn(
		    "EIC16",
		    "EarInfectionsConditions-Day 16",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 16), indParam),
		    "");
		dsd.addColumn(
		    "EIC17",
		    "EarInfectionsConditions-Day 17",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 17), indParam),
		    "");
		dsd.addColumn(
		    "EIC18",
		    "EarInfectionsConditions-Day 18",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 18), indParam),
		    "");
		dsd.addColumn(
		    "EIC19",
		    "EarInfectionsConditions-Day 19",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 19), indParam),
		    "");
		dsd.addColumn(
		    "EIC20",
		    "EarInfectionsConditions-Day 20",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 20), indParam),
		    "");
		dsd.addColumn(
		    "EIC21",
		    "EarInfectionsConditions-Day 21",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 21), indParam),
		    "");
		dsd.addColumn(
		    "EIC22",
		    "EarInfectionsConditions-Day 22",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 22), indParam),
		    "");
		dsd.addColumn(
		    "EIC23",
		    "EarInfectionsConditions-Day 23",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 23), indParam),
		    "");
		dsd.addColumn(
		    "EIC24",
		    "EarInfectionsConditions-Day 24",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 24), indParam),
		    "");
		dsd.addColumn(
		    "EIC25",
		    "EarInfectionsConditions-Day 25",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 25), indParam),
		    "");
		dsd.addColumn(
		    "EIC26",
		    "EarInfectionsConditions-Day 26",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 26), indParam),
		    "");
		dsd.addColumn(
		    "EIC27",
		    "EarInfectionsConditions-Day 27",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 27), indParam),
		    "");
		dsd.addColumn(
		    "EIC28",
		    "EarInfectionsConditions-Day 28",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 28), indParam),
		    "");
		dsd.addColumn(
		    "EIC29",
		    "EarInfectionsConditions-Day 29",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 29), indParam),
		    "");
		dsd.addColumn(
		    "EIC30",
		    "EarInfectionsConditions-Day 30",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 30), indParam),
		    "");
		dsd.addColumn(
		    "EIC31",
		    "EarInfectionsConditions-Day 31",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), 31), indParam),
		    "");
		
	}
	
	private void getUpperRespiratoryTractInfections(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("UR1", "UpperRespiratoryTractInfections-Day 1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 1),
		    indParam), "");
		dsd.addColumn("UR2", "UpperRespiratoryTractInfections-Day 2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 2),
		    indParam), "");
		dsd.addColumn("UR3", "UpperRespiratoryTractInfections-Day 3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 3),
		    indParam), "");
		dsd.addColumn("UR4", "UpperRespiratoryTractInfections-Day 4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 4),
		    indParam), "");
		dsd.addColumn("UR5", "UpperRespiratoryTractInfections-Day 5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 5),
		    indParam), "");
		dsd.addColumn("UR6", "UpperRespiratoryTractInfections-Day 6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 6),
		    indParam), "");
		dsd.addColumn("UR7", "UpperRespiratoryTractInfections-Day 7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 7),
		    indParam), "");
		dsd.addColumn("UR8", "UpperRespiratoryTractInfections-Day 8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 8),
		    indParam), "");
		dsd.addColumn("UR9", "UpperRespiratoryTractInfections-Day 9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 9),
		    indParam), "");
		dsd.addColumn("UR10", "UpperRespiratoryTractInfections-Day 10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 10),
		    indParam), "");
		dsd.addColumn("UR11", "UpperRespiratoryTractInfections-Day 11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 11),
		    indParam), "");
		dsd.addColumn("UR12", "UpperRespiratoryTractInfections-Day 12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 12),
		    indParam), "");
		dsd.addColumn("UR13", "UpperRespiratoryTractInfections-Day 13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 13),
		    indParam), "");
		dsd.addColumn("UR14", "UpperRespiratoryTractInfections-Day 14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 14),
		    indParam), "");
		dsd.addColumn("UR15", "UpperRespiratoryTractInfections-Day 15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 15),
		    indParam), "");
		dsd.addColumn("UR16", "UpperRespiratoryTractInfections-Day 16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 16),
		    indParam), "");
		dsd.addColumn("UR17", "UpperRespiratoryTractInfections-Day 17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 17),
		    indParam), "");
		dsd.addColumn("UR18", "UpperRespiratoryTractInfections-Day 18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 18),
		    indParam), "");
		dsd.addColumn("UR19", "UpperRespiratoryTractInfections-Day 19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 19),
		    indParam), "");
		dsd.addColumn("UR20", "UpperRespiratoryTractInfections-Day 20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 20),
		    indParam), "");
		dsd.addColumn("UR21", "UpperRespiratoryTractInfections-Day 21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 21),
		    indParam), "");
		dsd.addColumn("UR22", "UpperRespiratoryTractInfections-Day 22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 22),
		    indParam), "");
		dsd.addColumn("UR23", "UpperRespiratoryTractInfections-Day 23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 23),
		    indParam), "");
		dsd.addColumn("UR24", "UpperRespiratoryTractInfections-Day 24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 24),
		    indParam), "");
		dsd.addColumn("UR25", "UpperRespiratoryTractInfections-Day 25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 25),
		    indParam), "");
		dsd.addColumn("UR26", "UpperRespiratoryTractInfections-Day 26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 26),
		    indParam), "");
		dsd.addColumn("UR27", "UpperRespiratoryTractInfections-Day 27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 27),
		    indParam), "");
		dsd.addColumn("UR28", "UpperRespiratoryTractInfections-Day 28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 28),
		    indParam), "");
		dsd.addColumn("UR29", "UpperRespiratoryTractInfections-Day 29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 29),
		    indParam), "");
		dsd.addColumn("UR30", "UpperRespiratoryTractInfections-Day 30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 30),
		    indParam), "");
		dsd.addColumn("UR31", "UpperRespiratoryTractInfections-Day 31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), 31),
		    indParam), "");
		
	}
	
	private void getAsthma(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("AS1", "Asthma-Day 1",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 1), indParam), "");
		dsd.addColumn("AS2", "Asthma-Day 2",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 2), indParam), "");
		dsd.addColumn("AS3", "Asthma-Day 3",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 3), indParam), "");
		dsd.addColumn("AS4", "Asthma-Day 4",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 4), indParam), "");
		dsd.addColumn("AS5", "Asthma-Day 5",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 5), indParam), "");
		dsd.addColumn("AS6", "Asthma-Day 6",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 6), indParam), "");
		dsd.addColumn("AS7", "Asthma-Day 7",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 7), indParam), "");
		dsd.addColumn("AS8", "Asthma-Day 8",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 8), indParam), "");
		dsd.addColumn("AS9", "Asthma-Day 9",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 9), indParam), "");
		dsd.addColumn("AS10", "Asthma-Day 10",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 10), indParam), "");
		dsd.addColumn("AS11", "Asthma-Day 11",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 11), indParam), "");
		dsd.addColumn("AS12", "Asthma-Day 12",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 12), indParam), "");
		dsd.addColumn("AS13", "Asthma-Day 13",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 13), indParam), "");
		dsd.addColumn("AS14", "Asthma-Day 14",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 14), indParam), "");
		dsd.addColumn("AS15", "Asthma-Day 15",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 15), indParam), "");
		dsd.addColumn("AS16", "Asthma-Day 16",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 16), indParam), "");
		dsd.addColumn("AS17", "Asthma-Day 17",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 17), indParam), "");
		dsd.addColumn("AS18", "Asthma-Day 18",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 18), indParam), "");
		dsd.addColumn("AS19", "Asthma-Day 19",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 19), indParam), "");
		dsd.addColumn("AS20", "Asthma-Day 20",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 20), indParam), "");
		dsd.addColumn("AS21", "Asthma-Day 21",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 21), indParam), "");
		dsd.addColumn("AS22", "Asthma-Day 22",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 22), indParam), "");
		dsd.addColumn("AS23", "Asthma-Day 23",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 23), indParam), "");
		dsd.addColumn("AS24", "Asthma-Day 24",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 24), indParam), "");
		dsd.addColumn("AS25", "Asthma-Day 25",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 25), indParam), "");
		dsd.addColumn("AS26", "Asthma-Day 26",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 26), indParam), "");
		dsd.addColumn("AS27", "Asthma-Day 27",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 27), indParam), "");
		dsd.addColumn("AS28", "Asthma-Day 28",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 28), indParam), "");
		dsd.addColumn("AS29", "Asthma-Day 29",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 29), indParam), "");
		dsd.addColumn("AS30", "Asthma-Day 30",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 30), indParam), "");
		dsd.addColumn("AS31", "Asthma-Day 31",
		    ReportUtils.map(moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), 31), indParam), "");
		
	}
	
	/**
	 * Get moh 705 a dataset
	 * 
	 * @return @{@link org.openmrs.module.reporting.dataset.definition.DataSetDefinition}
	 */
	public DataSetDefinition getMoh705aDataset() {
		CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
		String indParam = "startDate=${startDate},endDate=${endDate}";
		//dsd.addDimension("days", ReportUtils.map(ehrAddonDimesion.encountersOfMonthPerDay(), "endDate=${endDate}"));
		dsd.setName("MOH705A");
		dsd.addParameters(getParameters());
		// populate datasets
		getDiarrhoea(dsd, indParam);
		getTuberculosis(dsd, indParam);
		getDysentery(dsd, indParam);
		getCholera(dsd, indParam);
		getMeningococcalMeningitis(dsd, indParam);
		getOtherMenigitis(dsd, indParam);
		getPoliomyelitis(dsd, indParam);
		getNeonatalTetanus(dsd, indParam);
		getChickenPox(dsd, indParam);
		getMeasles(dsd, indParam);
		getHepatitis(dsd, indParam);
		getMumps(dsd, indParam);
		getFevers(dsd, indParam);
		getSuspectedMalaria(dsd, indParam);
		getConfirmedMalaria(dsd, indParam);
		getUrinaryTractInfection(dsd, indParam);
		getTyphoid(dsd, indParam);
		getBilharzia(dsd, indParam);
		getInterstinalworms(dsd, indParam);
		getMalnutrition(dsd, indParam);
		getAnaemia(dsd, indParam);
		getEyeInfections(dsd, indParam);
		getOtherEyeConditions(dsd, indParam);
		getEarInfectionsConditions(dsd, indParam);
		getUpperRespiratoryTractInfections(dsd, indParam);
		getAsthma(dsd, indParam);
		
		return dsd;
		
	}
	
}
