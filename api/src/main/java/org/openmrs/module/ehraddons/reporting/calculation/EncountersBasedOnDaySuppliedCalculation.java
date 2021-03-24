package org.openmrs.module.ehraddons.reporting.calculation;

import org.openmrs.Visit;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.calculation.result.ListResult;
import org.openmrs.module.kenyacore.calculation.AbstractPatientCalculation;
import org.openmrs.module.kenyacore.calculation.BooleanResult;
import org.openmrs.module.kenyacore.calculation.CalculationUtils;
import org.openmrs.module.kenyacore.report.data.patient.definition.VisitsForPatientDataDefinition;
import org.openmrs.module.reporting.common.TimeQualifier;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class EncountersBasedOnDaySuppliedCalculation extends AbstractPatientCalculation {
	
	@Override
	public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> parameterValues,
	        PatientCalculationContext context) {
		CalculationResultMap resultMap = new CalculationResultMap();
		Integer day = (Integer) parameterValues.get("day");
		
		Calendar amonthAgo = Calendar.getInstance();
		amonthAgo.setTime(context.getNow());
		amonthAgo.add(Calendar.MONTH, -1);
		
		VisitsForPatientDataDefinition visitsDef = new VisitsForPatientDataDefinition();
		visitsDef.setWhich(TimeQualifier.ANY);
		visitsDef.setStartedOnOrAfter(amonthAgo.getTime());
		visitsDef.setStartedOnOrBefore(context.getNow());
		
		CalculationResultMap visitData = CalculationUtils.evaluateWithReporting(visitsDef, cohort, parameterValues, null,
		    context);
		for (Integer pId : cohort) {
			boolean found = false;
			ListResult listResult = (ListResult) visitData.get(pId);
			List<Visit> visitList = CalculationUtils.extractResultValues(listResult);
			for (Visit visit : visitList) {
				if (day != null
				        && formatDate(visit.getStartDatetime()).equals(
				            formatDate(getDateBasedOnValue(context.getNow(), day)))) {
					found = true;
					break;
				}
			}
			resultMap.put(pId, new BooleanResult(found, this));
		}
		return resultMap;
	}
	
	private Date getDateBasedOnValue(Date date, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(year, month, day);
		
		return calendar1.getTime();
	}
	
	private String formatDate(Date date) {
		
		Format formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		return formatter.format(date);
	}
}
