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
}
