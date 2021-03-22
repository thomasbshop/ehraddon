/*
 * The contents of this file are subject to the OpenMRS Public License Version
 * 1.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 *
 * Copyright (C) OpenMRS, LLC. All Rights Reserved.
 */
package org.openmrs.module.ehraddons.reporting.calculation;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.openmrs.Concept;
import org.openmrs.EncounterType;
import org.openmrs.Location;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.ehraddons.reporting.utils.EhrCalculationUtils;
import org.openmrs.module.reporting.common.TimeQualifier;
import org.openmrs.module.reporting.data.patient.definition.EncountersForPatientDataDefinition;
import org.openmrs.module.reporting.data.person.definition.ObsForPersonDataDefinition;
import org.springframework.stereotype.Service;

@Service
public class EhrCalculationService {
	
	/**
	 * Evaluates all encounters of a given type of each patient
	 * 
	 * @param encounterTypes
	 * @param cohort
	 * @param onOrAfter
	 * @param context
	 * @return all encounters for the patients
	 */
	public CalculationResultMap allEncounters(List<EncounterType> encounterTypes, Collection<Integer> cohort,
	        Date onOrAfter, Date onOrBefore, TimeQualifier timeQualifier, PatientCalculationContext context) {
		EncountersForPatientDataDefinition def = new EncountersForPatientDataDefinition();
		def.setWhich(timeQualifier);
		if (onOrAfter != null) {
			def.setOnOrAfter(onOrAfter);
		}
		def.setOnOrBefore(onOrBefore);
		if (encounterTypes != null) {
			def.setName("all encounters ");
			def.setTypes(encounterTypes);
		} else {
			def.setName("all encounters of any type");
		}
		return EhrCalculationUtils.evaluateWithReporting(def, cohort, null, null, context);
	}
	
	/**
	 * Evaluates the last obs of a given type of each patient
	 * 
	 * @param concept the obs' concept
	 * @param cohort the patient ids
	 * @param context the calculation context
	 * @return the obss in a calculation result map
	 */
	public CalculationResultMap lastObs(Concept concept, Collection<Integer> cohort, PatientCalculationContext context) {
		ObsForPersonDataDefinition def = new ObsForPersonDataDefinition("last obs", TimeQualifier.LAST, concept,
		        context.getNow(), null);
		return EhrCalculationUtils.evaluateWithReporting(def, cohort, null, null, context);
	}
	
	/**
	 * Evaluate for obs based on the time modifier
	 * 
	 * @param concept
	 * @param encounterTypes
	 * @param cohort
	 * @param locationList
	 * @param timeQualifier
	 * @param startDate
	 * @param context
	 * @return
	 */
	public CalculationResultMap getObs(Concept concept, List<EncounterType> encounterTypes, Collection<Integer> cohort,
	        List<Location> locationList, TimeQualifier timeQualifier, Date startDate, Date endDate,
	        PatientCalculationContext context) {
		ObsForPersonDataDefinition def = new ObsForPersonDataDefinition();
		def.setName(timeQualifier.name() + "obs");
		def.setWhich(timeQualifier);
		def.setQuestion(concept);
		if (encounterTypes != null) {
			def.setEncounterTypeList(encounterTypes);
		}
		if (startDate != null) {
			def.setOnOrAfter(startDate);
		}
		if (endDate != null) {
			def.setOnOrBefore(endDate);
		}
		if (!locationList.isEmpty()) {
			def.setLocationList(locationList);
		}
		return EhrCalculationUtils.evaluateWithReporting(def, cohort, null, null, context);
	}
}
