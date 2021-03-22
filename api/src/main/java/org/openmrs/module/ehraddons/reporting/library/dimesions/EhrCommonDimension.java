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
package org.openmrs.module.ehraddons.reporting.library.dimesions;

import java.util.Date;
import org.openmrs.module.ehraddons.reporting.library.cohorts.CommonLibrary;
import org.openmrs.module.ehraddons.reporting.library.cohorts.GenderCohortDefinition;
import org.openmrs.module.ehraddons.reporting.library.cohorts.Moh717CohortDefination;
import org.openmrs.module.ehraddons.reporting.utils.EhrReportConstants;
import org.openmrs.module.ehraddons.reporting.utils.EhrAddonUtils;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.indicator.dimension.CohortDefinitionDimension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EhrCommonDimension {
	
	@Autowired
	private GenderCohortDefinition genderCohortQueries;
	
	@Autowired
	private Moh717CohortDefination moh717CohortDefination;
	
	@Autowired
	private CommonLibrary commonLibrary;
	
	/**
	 * Gender dimension
	 * 
	 * @return the {@link org.openmrs.module.reporting.indicator.dimension.CohortDimension}
	 */
	public CohortDefinitionDimension gender() {
		CohortDefinitionDimension dim = new CohortDefinitionDimension();
		dim.setName("gender");
		dim.addCohortDefinition("M", EhrAddonUtils.map(genderCohortQueries.maleCohort(), ""));
		dim.addCohortDefinition("F", EhrAddonUtils.map(genderCohortQueries.femaleCohort(), ""));
		return dim;
	}
	
	/**
	 * Age range dimension for <5 Years and >5 years
	 * 
	 * @return {@link org.openmrs.module.reporting.indicator.dimension.CohortDimension}
	 */
	public CohortDefinitionDimension age(AgeDimensionCohortInterface ageDimensionCohort) {
		CohortDefinitionDimension dim = new CohortDefinitionDimension();
		dim.setParameters(ageDimensionCohort.getParameters());
		dim.setName("age dimension");
		
		dim.addCohortDefinition("<5", ageDimensionCohort.createXtoYAgeCohort("Children under 5 years", 0, 4));
		dim.addCohortDefinition("5+", ageDimensionCohort.createXtoYAgeCohort("Over 5 years", 5, 200));
		dim.addCohortDefinition(">60", ageDimensionCohort.createXtoYAgeCohort("Over 60 years", 60, 200));
		return dim;
	}
	
	/**
	 * State of patient, whether new or revisit
	 * 
	 * @return {@link org.openmrs.module.reporting.indicator.dimension.CohortDimension}
	 */
	public CohortDefinitionDimension state() {
		CohortDefinitionDimension dim = new CohortDefinitionDimension();
		dim.setName("Patient State");
		dim.addParameter(new Parameter("endDate", "End Date", Date.class));
		dim.addCohortDefinition("NEW", EhrAddonUtils.map(
		    moh717CohortDefination.getRevisitPatientStates(EhrReportConstants.OccurenceStates.NEW), "onOrBefore=${endDate}"));
		dim.addCohortDefinition("RVT", EhrAddonUtils.map(
		    moh717CohortDefination.getRevisitPatientStates(EhrReportConstants.OccurenceStates.REVISIT),
		    "onOrBefore=${endDate}"));
		return dim;
	}
	
	/**
	 * Patients with encounters on a given date
	 * 
	 * @return @{@link org.openmrs.module.reporting.indicator.dimension.CohortDimension}
	 */
	public CohortDefinitionDimension encountersOfMonthPerDay() {
		CohortDefinitionDimension dim = new CohortDefinitionDimension();
		dim.setName("Patient with encounters on date of day");
		dim.addParameter(new Parameter("startDate", "Start Date", Date.class));
		dim.addParameter(new Parameter("endDate", "End Date", Date.class));
		dim.addCohortDefinition("1", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(1),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("2", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(2),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("3", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(3),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("4", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(4),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("5", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(5),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("6", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(6),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("7", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(7),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("8", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(8),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("9", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(9),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("10", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(10),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("11", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(11),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("12", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(12),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("13", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(13),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("14", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(14),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("15", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(15),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("16", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(16),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("17", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(17),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("18", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(18),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("19", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(19),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("20", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(20),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("21", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(21),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("22", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(22),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("23", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(23),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("24", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(24),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("25", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(25),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("26", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(26),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("27", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(27),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("28", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(28),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("29", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(29),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("30", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(30),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		dim.addCohortDefinition("31", EhrAddonUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(31),
		    "onOrAfter=${startDate},onOrBefore=${endDate}"));
		
		return dim;
	}
}
