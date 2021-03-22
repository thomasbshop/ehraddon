/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.ehraddons.reporting.library.cohorts;

import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.springframework.stereotype.Component;

@Component
public class GenderCohortDefinition {
	
	/**
	 * Patients who are female
	 * 
	 * @return the cohort definition
	 */
	public CohortDefinition femaleCohort() {
		org.openmrs.module.reporting.cohort.definition.GenderCohortDefinition cohort = new org.openmrs.module.reporting.cohort.definition.GenderCohortDefinition();
		cohort.setName("femaleCohort");
		cohort.setFemaleIncluded(true);
		cohort.setMaleIncluded(false);
		return cohort;
	}
	
	/**
	 * Patients who are male
	 * 
	 * @return the cohort definition
	 */
	public CohortDefinition maleCohort() {
		org.openmrs.module.reporting.cohort.definition.GenderCohortDefinition cohort = new org.openmrs.module.reporting.cohort.definition.GenderCohortDefinition();
		cohort.setName("maleCohort");
		cohort.setMaleIncluded(true);
		cohort.setFemaleIncluded(false);
		return cohort;
	}
}
