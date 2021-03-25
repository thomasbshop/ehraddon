package org.openmrs.module.ehraddons.metadata;

import org.openmrs.Concept;
import org.openmrs.EncounterType;
import org.openmrs.module.ehraddons.Moh717Constants;
import org.springframework.stereotype.Component;

@Component("outpatientMetadata")
public class OutpatientMetadata extends ProgramsMetadata {
	
	// encounter types
	// encounter type 1
	public EncounterType getAdultsInitialEncounterType() {
		return getEncounterType(Moh717Constants.ADULTINITIAL_OUTPATIENT);
	}
	
	// encounter type 2
	public EncounterType getAdultReturnEncounterType() {
		return getEncounterType(Moh717Constants.ADULTRETURN_OUTPATIENT);
	}
	
	// encounter type 3
	public EncounterType getPedsInitialEncounterType() {
		return getEncounterType(Moh717Constants.PEDSINITIAL_OUTPATIENT);
	}
	
	// encounter type 4
	public EncounterType getPedsReturnEncounterType() {
		return getEncounterType(Moh717Constants.PEDSRETURN_OUTPATIENT);
	}
	
	// encounter type 5
	public EncounterType getRegInitialEncounterType() {
		return getEncounterType(Moh717Constants.REGINITIAL_OUTPATIENT);
	}
	
	// encounter type 6
	public EncounterType getRegReturnEncounterType() {
		return getEncounterType(Moh717Constants.REGREVISIT_OUTPATIENT);
	}
	
	// Concepts 5082
	public Concept getSpecialClinicConcept() {
		return getConcept(Moh717Constants.SPECIAL_CLINIC);
	}
	
	//    // 3999
	public Concept getTriageConcept() {
		return getConcept(Moh717Constants.TRIAGE);
	}
	
	//
	//    // 003
	public Concept getOpdWardConcept() {
		return getConcept(Moh717Constants.OPD_WARD);
	}
	
	//
	//    // 5114
	public Concept getCasualityOpdConcept() {
		return getConcept(Moh717Constants.CASUALTY_OPD);
	}
	
	// 4000
	public Concept getCasualityTriageConcept() {
		return getConcept(Moh717Constants.CASUALTY_TRIAGE);
	}
	
	//
	// 009
	public Concept getNewPatientConcept() {
		return getConcept(Moh717Constants.NEW_PATIENT);
	}
	
	//
	// 945
	public Concept getRevisitConcept() {
		return getConcept(Moh717Constants.REVISIT);
	}
}
