package org.openmrs.module.ehraddons.diagnosis.lists;

import org.openmrs.module.ehraddons.EhrAddonsConstants;

import java.util.Arrays;
import java.util.List;

import static org.openmrs.module.ehraddons.EhrAddonsConstants.getConcept;

public class DiagnosisLists {
	
	public static List<Integer> getDiarrheaDiagnosisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRONIC_DIARRHOEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_DIARRHEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FUNCTIONAL_DIARRHOEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Hemorrhagic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Bacterial_Gastroenteritis).getConceptId());
	}
	
	public static List<Integer> getTuberculosisDiagnosisList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getDysenteryList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getCholeraList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getMeningococcalMeningitisList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getOtherMenigitisList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getPoliomyelitisList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getNeonatalTetanusList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getChickenPoxList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getMeaslesList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getHepatitisList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getMumpsList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getFeversList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getSuspectedMalariaList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getConfirmedMalariaList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getUrinaryTractInfectionList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getTyphoidList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getBilharziaList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getInterstinalwormsList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getMalnutritionList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getAnaemiaList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getEyeInfectionsList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getOtherEyeConditionsList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getEarInfectionsConditionsList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getUpperRespiratoryTractInfectionsList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getAsthmaList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    //		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS)
		    //		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
}
