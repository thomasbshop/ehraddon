package org.openmrs.module.ehraddons.reporting.calculation;

import static org.openmrs.module.ehraddons.reporting.utils.EhrCalculationUtils.monthsSince;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openmrs.Encounter;
import org.openmrs.EncounterType;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.calculation.result.ListResult;
import org.openmrs.module.ehraddons.metadata.OutpatientMetadata;
import org.openmrs.module.ehraddons.reporting.utils.EhrCalculationUtils;
import org.openmrs.module.reporting.common.TimeQualifier;
import org.springframework.stereotype.Component;

@Component
public class NewPatientOccurenceCalculation extends AbstractPatientCalculation {
	
	@Override
	public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> parameterValues,
	        PatientCalculationContext context) {
		EhrCalculationService ehrCalculationService = Context.getRegisteredComponents(EhrCalculationService.class).get(0);
		// External dependencies
		OutpatientMetadata outpatientMetadata = Context.getRegisteredComponents(OutpatientMetadata.class).get(0);
		// EncounterType regReturn = outpatientMetadata.getRegReturnEncounterType();
		EncounterType regInitial = outpatientMetadata.getRegInitialEncounterType();
		CalculationResultMap resultMap = new CalculationResultMap();
		// get those patients already having revisits and have been active
		
		RevisitPatientOccurenceCalculation revisitCalculation = Context.getRegisteredComponents(
		    RevisitPatientOccurenceCalculation.class).get(0);
		Set<Integer> revisitAndActive = patientsThatPass(calculate(revisitCalculation, cohort, context));
		
		CalculationResultMap allEncounters = ehrCalculationService.allEncounters(Arrays.asList(regInitial), cohort, null,
		    context.getNow(), TimeQualifier.ANY, context);
		CalculationResultMap lastEncounter = ehrCalculationService.allEncounters(null, cohort, null, context.getNow(),
		    TimeQualifier.LAST, context);
		
		for (Integer pId : cohort) {
			boolean isCandidate = false;
			ListResult listResult = (ListResult) allEncounters.get(pId);
			List<Encounter> encounterList = EhrCalculationUtils.extractResultValues(listResult);
			Encounter lastEncounters = EhrCalculationUtils.resultForPatient(lastEncounter, pId);
			if (encounterList.size() > 0
			        && !(revisitAndActive.contains(pId))
			        || (lastEncounters != null && lastEncounters.getEncounterDatetime() != null && monthsSince(
			            lastEncounters.getEncounterDatetime(), context.getNow()) > 12)) {
				isCandidate = true;
			}
			
			resultMap.put(pId, new BooleanResult(isCandidate, this));
		}
		return resultMap;
	}
}
