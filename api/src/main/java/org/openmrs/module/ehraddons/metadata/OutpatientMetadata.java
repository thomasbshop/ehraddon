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
package org.openmrs.module.ehraddons.metadata;

import org.openmrs.Concept;
import org.openmrs.ConceptClass;
import org.openmrs.EncounterType;
import org.openmrs.Program;
import org.openmrs.api.context.Context;
import org.openmrs.module.ehraddons.EhrAddonsConstants;
import org.openmrs.module.ehraddons.metadata.EhrAddonsMetadata;
import org.springframework.stereotype.Component;

@Component("outpatientMetadata")
public class OutpatientMetadata extends ProgramsMetadata {
	
	// encounter types
	// encounter type 1
	public EncounterType getAdultsInitialEncounterType() {
		return getEncounterType(EhrAddonsConstants.ADULTINITIAL_OUTPATIENT);
	}
	
	// encounter type 2
	public EncounterType getAdultReturnEncounterType() {
		return getEncounterType(EhrAddonsConstants.ADULTRETURN_OUTPATIENT);
	}
	
	// encounter type 3
	public EncounterType getPedsInitialEncounterType() {
		return getEncounterType(EhrAddonsConstants.PEDSINITIAL_OUTPATIENT);
	}
	
	// encounter type 4
	public EncounterType getPedsReturnEncounterType() {
		return getEncounterType(EhrAddonsConstants.PEDSRETURN_OUTPATIENT);
	}
	
	// encounter type 5
	public EncounterType getRegInitialEncounterType() {
		return getEncounterType(EhrAddonsConstants.REGINITIAL_OUTPATIENT);
	}
	
	// encounter type 6
	public EncounterType getRegReturnEncounterType() {
		return getEncounterType(EhrAddonsConstants.REGREVISIT_OUTPATIENT);
	}
	
	// encounter type 9
	//    public EncounterType getOpdEncounterType() {
	//        return getEncounterType(EhrAddonsConstants.OPDENCOUNTER_OUTPATIENT);
	//    }
	//
	// encounter type 12
	//    public EncounterType getCheckInEncounterType() {
	//        return getEncounterType(EhrAddonsConstants.CHECKIN_ENCOUNTER);
	//    }
	//
	//    // encounter type 19
	//    public EncounterType getAncEncounterType() {
	//        return getEncounterType(EhrAddonsConstants.ANC_ENCOUNTER);
	//    }
	//
	// Concepts 5082
	public Concept getSpecialClinicConcept() {
		return getConcept(EhrAddonsConstants.SPECIAL_CLINIC);
	}
	
	//
	//    // Concepts 5119
	//    public Concept getENTClinicConcept() {
	//        return getConcept(EhrAddonsConstants.ENT_CLINIC);
	//    }
	//
	//    // Concepts 5118
	//    public Concept getEYEClinicConcept() {
	//        return getConcept(EhrAddonsConstants.EYE_CLINIC);
	//    }
	//
	//    // Concepts 5698
	//    public Concept getTbLeprosyClinicConcept() {
	//        return getConcept(EhrAddonsConstants.TB_LEPROSY_CLINIC);
	//    }
	//
	//    // Concepts 1073
	//    public Concept getSTIClinicConcept() {
	//        return getConcept(EhrAddonsConstants.STI_CLINIC);
	//    }
	//
	//    // Concepts 5700
	//    public Concept getPsycthricClinicConcept() {
	//        return getConcept(EhrAddonsConstants.PSYCHIATRIC_CLINIC);
	//    }
	//
	//    // Concepts 5121
	//    public Concept getOrthopedicClinicConcept() {
	//        return getConcept(EhrAddonsConstants.ORTHOPAEDIC_CLINIC);
	//    }
	//
	//    // Concepts 5120
	//    public Concept getMopcMedicalClinicConcept() {
	//        return getConcept(EhrAddonsConstants.MOPC_MEDICAL_CLINIC);
	//    }
	//
	//    // Concepts 5122
	//    public Concept getPopsPediatricClinicConcept() {
	//        return getConcept(EhrAddonsConstants.POPC_PAEDIATRICS_CLINIC);
	//    }
	//
	//    // Concepts 5699
	//    public Concept getCccClinicConcept() {
	//        return getConcept(EhrAddonsConstants.CCC_CLINIC);
	//    }
	//
	//    // Concepts 5701
	//    public Concept getMopsDmDiabeticClinicConcept() {
	//        return getConcept(EhrAddonsConstants.MOPC_DM_DIABETIC_CLINIC);
	//    }
	//
	//    // Concepts 5702
	//    public Concept getFnaClinicConcept() {
	//        return getConcept(EhrAddonsConstants.FNA_CLINIC);
	//    }
	//
	//    // Concepts 5703
	//    public Concept getGpcClinicConcept() {
	//        return getConcept(EhrAddonsConstants.GOPC_CLINIC);
	//    }
	//
	//    // Concepts 5704
	//    public Concept getMchClinicConcept() {
	//        return getConcept(EhrAddonsConstants.MCH_CLINIC);
	//    }
	//
	//    // Concepts 5705
	//    public Concept getMopsClinicConcept() {
	//        return getConcept(EhrAddonsConstants.MOPC_MEDICAL_CLINIC_2);
	//    }
	//
	//    // Concepts 5706
	//    public Concept getPallativeClinicConcept() {
	//        return getConcept(EhrAddonsConstants.PALLIATIVE_CARE_CLINIC);
	//    }
	//
	//    // Concepts 5707
	//    public Concept getSurgicalClinicConcept() {
	//        return getConcept(EhrAddonsConstants.SURGICAL_CLINIC);
	//    }
	//
	//    // Concepts 5708
	//    public Concept getChestAndSkinClinicConcept() {
	//        return getConcept(EhrAddonsConstants.CHEST_AND_SKIN_CLINIC);
	//    }
	//
	//    // Concepts 5696
	//    public Concept getDentalClinicConcept() {
	//        return getConcept(EhrAddonsConstants.DENTAL_CLINIC);
	//    }
	//
	//    // Concepts 100126248
	//    public Concept getFamilyPlanningClinicConcept() {
	//        return getConcept(EhrAddonsConstants.FAMILY_PLANNING_CLINIC);
	//    }
	//
	//    // 3999
	public Concept getTriageConcept() {
		return getConcept(EhrAddonsConstants.TRIAGE);
	}
	
	//
	//    // 003
	public Concept getOpdWardConcept() {
		return getConcept(EhrAddonsConstants.OPD_WARD);
	}
	
	//
	//    // 5114
	public Concept getCasualityOpdConcept() {
		return getConcept(EhrAddonsConstants.CASUALTY_OPD);
	}
	
	// 4000
	public Concept getCasualityTriageConcept() {
		return getConcept(EhrAddonsConstants.CASUALTY_TRIAGE);
	}
	
	//
	//    // 5709
	//    public Concept getDentalOpdConcept() {
	//        return getConcept(EhrAddonsConstants.DENTAL_OPD);
	//    }
	//
	//    // 2304
	//    public Concept getProvisionalDiagnosis() {
	//        return getConcept(EhrAddonsConstants.PROVISIONAL_DIAGNOSIS);
	//    }
	//
	//    // 5109
	//    public Concept getFinalDiagnosis() {
	//        return getConcept(EhrAddonsConstants.FINAL_DIAGNOSIS);
	//    }
	//
	//    // 3950
	//    public Concept getRegistrationFeeConcept() {
	//        return getConcept(EhrAddonsConstants.REGISTRATION_FEE);
	//    }
	//
	// 009
	public Concept getNewPatientConcept() {
		return getConcept(EhrAddonsConstants.NEW_PATIENT);
	}
	
	//
	// 945
	public Concept getRevisitConcept() {
		return getConcept(EhrAddonsConstants.REVISIT);
	}
	//
	//    // Get all diarrhoea concepts
	//    public Concept getAcuteDiarrhoea() {
	//        return getConcept(EhrAddonsConstants.ACUTE_DIARRHEA);
	//    }
	//
	//    // 4029
	//    public Concept getDiarrheaUnspecified() {
	//        return getConcept(EhrAddonsConstants.DIARRHEA_UNSPECIFIED);
	//    }
	//    // 4421
	//    public Concept getFunctionalDiarrhoea() {
	//        return getConcept(EhrAddonsConstants.FUNCTIONAL_DIARRHOEA);
	//    }
	//    // 4421
	//    public Concept getChronicDiarrhoea() {
	//        return getConcept(EhrAddonsConstants.CHRONIC_DIARRHOEA);
	//    }
	//    // 1678
	//    public Concept getDiarrhoeaAndGastroenteritisOfPresumesInfectionOrigin() {
	//        return getConcept(
	//                EhrAddonsConstants.DIARRHOEA_AND_GASTROENTERITIS_OF_PRESUMED_INFECTIOUS_ORIGIN);
	//    }
	//    // 138868
	//    public Concept getHemorrhagicDiarrhea() {
	//        return getConcept(EhrAddonsConstants.Hemorrhagic_Diarrhea);
	//    }
	//    // 148023
	//    public Concept getBacterialGastroenteritis() {
	//        return getConcept(EhrAddonsConstants.Bacterial_Gastroenteritis);
	//    }
	//
	//    // Get Dysentery Concepts
	//    // 2450
	//    public Concept getDysentery() {
	//        return getConcept(EhrAddonsConstants.DYSENTERY);
	//    }
	//
	//    // 1003
	//    public Concept getAmoebicDysentery() {
	//        return getConcept(EhrAddonsConstants.AMOEBIC_DYSENTERY);
	//    }
	//
	//    // 1668
	//    public Concept getShigellaDysentery() {
	//        return getConcept(EhrAddonsConstants.SHIGELLA_DYSENTERY);
	//    }
	//
	//    // 3667
	//    public Concept getBacillaryDysentery() {
	//        return getConcept(EhrAddonsConstants.BACILLARY_DYSENTERY);
	//    }
	//
	//    // Meningococal concepts
	//    // 100001518
	//    public Concept getMeningococcalMenengaitis() {
	//        return getConcept(EhrAddonsConstants.MENINGOCOCCAL_MENINGITIS);
	//    }
	//
	//    // 1714
	//    public Concept getMeningococcalInfections() {
	//        return getConcept(EhrAddonsConstants.MENINGOCOCCAL_INFECTIONS);
	//    }
	//
	//    // 1019
	//    public Concept getMeningococcalNos() {
	//        return getConcept(EhrAddonsConstants.MENINGITIS_NOS);
	//    }
	//
	//    // Other meningitis concepts
	//
	//    public Concept getBacterialMeningitisConcept() {
	//        return getConcept(EhrAddonsConstants.BACTERIAL_MENINGITIS);
	//    }
	//
	//    public Concept getCryptococcalMeningitisConcept() {
	//        return getConcept(EhrAddonsConstants.CRYPTOCOCCAL_MENINGITIS);
	//    }
	//
	//    public Concept getViralMeningitisConcept() {
	//        return getConcept(EhrAddonsConstants.VIRAL_MENINGITIS);
	//    }
	//
	//    // Tetanus concepts
	//    // 1521
	//    public Concept getTetanus() {
	//        return getConcept(EhrAddonsConstants.TETANUS);
	//    }
	//
	//    // 1519
	//    public Concept getTetanusNeonatorumTetanus() {
	//        return getConcept(EhrAddonsConstants.TETANUS_NEONATORUM);
	//    }
	//
	//    // 1195
	//    public Concept getAcutePoliomyelitisConcept() {
	//        return getConcept(EhrAddonsConstants.ACUTE_POLIOMYELITIS);
	//    }
	//
	//    // 1146
	//    public Concept getChickenPoxConcept() {
	//        return getConcept(EhrAddonsConstants.CHICKEN_POX);
	//    }
	//
	//    // 1020
	//    public Concept getMeaslesConcept() {
	//        return getConcept(EhrAddonsConstants.MEASLES);
	//    }
	//
	//    // 4458
	//    public Concept getMeaslesWithoutComplicationConcept() {
	//        return getConcept(EhrAddonsConstants.MEASLES_WITHOUT_COMPLICATION);
	//    }
	//
	//    // 1744
	//    public Concept getGermanMeaslesConcept() {
	//        return getConcept(EhrAddonsConstants.GERMAN_MEASLES);
	//    }
	//
	//    public Concept getHepatitisNosConcept() {
	//        return getConcept(EhrAddonsConstants.HEPATITIS_NOS);
	//    }
	//
	//    public Concept getHepatitisAConcept() {
	//        return getConcept(EhrAddonsConstants.HEPATITIS_A);
	//    }
	//
	//    // 1006
	//    public Concept getHepatitisBConcept() {
	//        return getConcept(EhrAddonsConstants.HEPATITIS_B);
	//    }
	//
	//    // 1007
	//    public Concept getHepatitisCConcept() {
	//        return getConcept(EhrAddonsConstants.HEPATITIS_C);
	//    }
	//
	//    public Concept getHepatitisEConcept() {
	//        return getConcept(EhrAddonsConstants.HEPATITIS_E);
	//    }
	//
	//    public Concept getViralHepatitisAConcept() {
	//        return getConcept(EhrAddonsConstants.VIRAL_HEPATITIS_A);
	//    }
	//
	//    public Concept getViralHepatitisBConcept() {
	//        return getConcept(EhrAddonsConstants.VIRAL_HEPATITIS_B);
	//    }
	//
	//    public Concept getViralHepatitisEConcept() {
	//        return getConcept(EhrAddonsConstants.VIRAL_HEPATITIS_D);
	//    }
	//
	//    public Concept getViralHepatitisDConcept() {
	//        return getConcept(EhrAddonsConstants.VIRAL_HEPATITIS_E);
	//    }
	//
	//    public Concept getLiverInfectionWithHepatitisAConcept() {
	//        return getConcept(EhrAddonsConstants.LIVER_INFECTION_WITH_HEPATITIS_A);
	//    }
	//
	//    public Concept getMumpsConcept() {
	//        return getConcept(EhrAddonsConstants.MUMPS);
	//    }
	//
	//    public Concept getRespiratoryDistressHaemorrhagicFeversConcept() {
	//        return getConcept(EhrAddonsConstants.RESPIRATORY_DISTRESS_HAEMORRHAGIC_FEVERS);
	//    }
	//
	//    public Concept getFeverConcept() {
	//        return getConcept(EhrAddonsConstants.FEVER);
	//    }
	//
	//    public Concept getFeverOfUnknownOriginConcept() {
	//        return getConcept(EhrAddonsConstants.FEVER_OF_UNKNOWN_ORIGIN);
	//    }
	//
	//    public Concept getClinicalMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.CLINICAL_MALARIA);
	//    }
	//
	//    public Concept getMalariaInPregnancyConcept() {
	//        return getConcept(EhrAddonsConstants.MALARIA_IN_PREGNANCY);
	//    }
	//
	//    public Concept getMalariaDueToSimianPlasmodiaConcept() {
	//        return getConcept(EhrAddonsConstants.MALARIA_DUE_TO_SIMIAN_PLASMODIA);
	//    }
	//
	//    public Concept getOtherCongenitalMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_CONGENITAL_MALARIA);
	//    }
	//
	//  /*public Concept getMalariaConcept() {
	//    return getConcept(EhrAddonsConstants.MALARIA);
	//  }
	//
	//  public Concept getMalariaConfirmedConcept() {
	//    return getConcept(EhrAddonsConstants.Malaria_confirmed);
	//  }*/
	//
	//    public Concept getOtherSpecifiedMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_SPECIFIED_MALARIA);
	//    }
	//
	//    public Concept getPlasmodiumMalariaeMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.PLASMODIUM_MALARIAE_MALARIA);
	//    }
	//
	//    public Concept getUnspecifiedMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.UNSPECIFIED_MALARIA);
	//    }
	//
	//    public Concept getConfirmedMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.CONFIRMED_MALARIA);
	//    }
	//
	//    public Concept getPFCMUMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.PLASMODIUM_FALCIPARUM_MALARIA_UNSPECIFIED);
	//    }
	//
	//    public Concept getOMNEMalaria_ClassifiedConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_MALARIA_NOT_ELSEWHERE_CLASSIFIED);
	//    }
	//
	//    public Concept getCongenitalFalcrumMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.CONGENITAL_FALCIPARUM_MALARIA);
	//    }
	//
	//    public Concept getPlasmodiumFalcrumMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.PLASMODIUM_FALCIPARUM_MALARIA);
	//    }
	//
	//    public Concept getPlasmodiumVivaxMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.PLASMODIUM_VIVAX_MALARIA);
	//    }
	//
	//    public Concept getMalaria_confirmed_with_minor_digestive_symptomsConcept() {
	//        return getConcept(EhrAddonsConstants.Malaria_confirmed_with_minor_digestive_symptoms);
	//    }
	//
	//    public Concept getPresumptiveMalariaWithPregnancyConcept() {
	//        return getConcept(EhrAddonsConstants.Presumptive_Malaria_With_Pregnancy);
	//    }
	//
	//    public Concept getConfirmedMalariaWithPregnancyConcept() {
	//        return getConcept(EhrAddonsConstants.Confirmed_Malaria_With_Pregnancy);
	//    }
	//
	//    public Concept getPresumptive_malaria_with_minor_digestive_symptoms_pregnantConcept() {
	//        return getConcept(
	//                EhrAddonsConstants.Presumptive_malaria_with_minor_digestive_symptoms_pregnant);
	//    }
	//
	//    public Concept getConfirmed_malaria_with_minor_digestive_symptoms_pregnantConcept() {
	//        return getConcept(EhrAddonsConstants.Confirmed_malaria_with_minor_digestive_symptoms_pregnant);
	//    }
	//
	//    public Concept getSevereMalariaConcept() {
	//        return getConcept(EhrAddonsConstants.SEVERE_MALARIA);
	//    }
	//
	//    public Concept getUrinaryTractInfecionConcept() {
	//        return getConcept(EhrAddonsConstants.URINARY_TRACT_INFECTION);
	//    }
	//
	//    public Concept getUrinaryTractInfecionInPregnancyConcept() {
	//        return getConcept(EhrAddonsConstants.URINARY_TRACT_INFECTION_IN_PREGNANCY);
	//    }
	//
	//    public Concept getUrinaryTractInfecionInPregnancyNotSpecifiedConcept() {
	//        return getConcept(EhrAddonsConstants.URINARY_TRACT_INFECTION_IN_PREGNANCY_NOT_SPECIFIED);
	//    }
	//
	//    public Concept getInfectionOfOtherStomaOfUrinayTractConcept() {
	//        return getConcept(EhrAddonsConstants.INFECTION_OF_OTHER_STOMA_OF_URINARY_TRACT);
	//    }
	//
	//    public Concept getInfectionOfOtherPartsOfUrinayTractConceptInPregnancyConcept() {
	//        return getConcept(EhrAddonsConstants.INFECTIONS_OF_OTHER_PARTS_OF_URINARY_TRACT_IN_PREGNANCY);
	//    }
	//
	//    public Concept getTyphoidFeverConcept() {
	//        return getConcept(EhrAddonsConstants.TYPHOID_FEVER);
	//    }
	//
	//    public Concept getBilhaziaConcept() {
	//        return getConcept(EhrAddonsConstants.BILHARZIA);
	//    }
	//
	//    public Concept getOtherSchitosomiasisConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_SCHISTOSOMIASIS);
	//    }
	//
	//    public Concept getIntestnalWormsConcept() {
	//        return getConcept(EhrAddonsConstants.INTESTINAL_WORMS);
	//    }
	//
	//    public Concept getMalnutritionConcept() {
	//        return getConcept(EhrAddonsConstants.MALNUTRITION);
	//    }
	//
	//    public Concept getProteinEnergyMalnutritionConcept() {
	//        return getConcept(EhrAddonsConstants.PROTEIN_ENERGY_MALNUTRITION);
	//    }
	//
	//    public Concept getAnaemiaUnspecifiedConcept() {
	//        return getConcept(EhrAddonsConstants.ANAEMIA_UNSPECIFIED);
	//    }
	//
	//    public Concept getHaemolyticAnaemiaConcept() {
	//        return getConcept(EhrAddonsConstants.HAEMOLYTIC_ANAEMIA);
	//    }
	//
	//    public Concept getBloodLossAnaemiaConcept() {
	//        return getConcept(EhrAddonsConstants.BLOOD_LOSS_ANAEMIA);
	//    }
	//
	//    public Concept getSickleCellAnaemiaConcept() {
	//        return getConcept(EhrAddonsConstants.SICKLE_CELL_ANAEMIA);
	//    }
	//
	//    public Concept getAsthenopiaConcept() {
	//        return getConcept(EhrAddonsConstants.ASTHENOPIA);
	//    }
	//
	//    public Concept getPinkEyeConcept() {
	//        return getConcept(EhrAddonsConstants.PINK_EYE);
	//    }
	//
	//    public Concept getDryEyeSyndromeConcept() {
	//        return getConcept(EhrAddonsConstants.DRY_EYE_SYNDROME);
	//    }
	//
	//    public Concept getInjuryOfEyeConcept() {
	//        return getConcept(EhrAddonsConstants.INJURY_OF_EYE);
	//    }
	//
	//    public Concept getLowVisionBothEyeConcept() {
	//        return getConcept(EhrAddonsConstants.LOW_VISION_BOTH_EYES);
	//    }
	//
	//    public Concept getOpenWoundEyelidAndPerocularAreaConcept() {
	//        return getConcept(EhrAddonsConstants.OPEN_WOUND_OF_EYELID_AND_PERIOCULAR_AREA);
	//    }
	//
	//    public Concept getHydrocortisoneConcept() {
	//        return getConcept(EhrAddonsConstants.HYDROCORTISONE);
	//    }
	//
	//    public Concept getRetrobulbarNeuritisLeftEyeConcept() {
	//        return getConcept(EhrAddonsConstants.RETROBULBAR_NEURITIS_LEFT_EYE);
	//    }
	//
	//    public Concept getAcuteAtopicConjuctivitisRightEyeConcept() {
	//        return getConcept(EhrAddonsConstants.ACUTE_ATOPIC_CONJUCTIVITIS_RIGHT_EYE);
	//    }
	//
	//    public Concept getEarInfectionsConcept() {
	//        return getConcept(EhrAddonsConstants.EAR_INFECTIONS);
	//    }
	//
	//    public Concept getDischargeOfEarConcept() {
	//        return getConcept(EhrAddonsConstants.DISCHARGE_OF_EAR);
	//    }
	//
	//    // TO Do pending more ear inections
	//    public Concept getUpperRespiratoryTractInfectionConcept() {
	//        return getConcept(EhrAddonsConstants.UPPER_RESPIRATORY_TRACT_INFECTION);
	//    }
	//
	//    public Concept getUpperRespiratoryTractInfectionHyperSensitivityReactionSiteUnspecifiedConcept() {
	//        return getConcept(
	//                EhrAddonsConstants.UPPER_RESPIRATORY_TRACT_HYPERSENSITIVITY_REACTION_SITE_UNSPECIFIED);
	//    }
	//
	//    public Concept getDiseasesOfUpperRespiratoryTractUnspecifiedConcept() {
	//        return getConcept(EhrAddonsConstants.DISEASES_OF_UPPER_RESPIRATORY_TRACT_UNSPECIFIED);
	//    }
	//
	//    public Concept getOtherDiseasesOfUpperRespiratoryTractConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_DISEASES_OF_UPPER_RESPIRATORY_TRACT);
	//    }
	//
	//    public Concept getOtherSpecifiedDiseasesOfUpperRespiratoryTractConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_SPECIFIED_DISEASES_OF_UPPER_RESPIRATORY_TRACT);
	//    }
	//
	//    public Concept getAsthmaNosConcept() {
	//        return getConcept(EhrAddonsConstants.ASTHMA_NOS);
	//    }
	//
	//    public Concept getAstheNopiaConcept() {
	//        return getConcept(EhrAddonsConstants.ASTHENOPIA);
	//    }
	//
	//    public Concept getAsthmaUnspecifiedConcept() {
	//        return getConcept(EhrAddonsConstants.ASTHMA_UNSPECIFIED);
	//    }
	//
	//    // 1712
	//    public Concept getObstericalTetanus() {
	//        return getConcept(EhrAddonsConstants.OBSTETRICAL_TETANUS);
	//    }
	//
	//    public Concept getTuberculosisConcept() {
	//        return getConcept(EhrAddonsConstants.TUBERCULOSIS);
	//    }
	//
	//    // TUBERCULOSIS_OF_OTHER_ORGANS
	//    public Concept getTBOtherOrgansConcept() {
	//        return getConcept(EhrAddonsConstants.TUBERCULOSIS_OF_OTHER_ORGANS);
	//    }
	//
	//    // TUBERCULOSIS_IN_PREGNANCY
	//    public Concept getTBInPregnancyConcept() {
	//        return getConcept(EhrAddonsConstants.TUBERCULOSIS_IN_PREGNANCY);
	//    }
	//
	//    // TUBERCULOSIS_AFFECTING_CENTRAL_NERVOUS_SYSTEM
	//    public Concept getTBAffectingCentralNervousSystemConcept() {
	//        return getConcept(EhrAddonsConstants.TUBERCULOSIS_AFFECTING_CENTRAL_NERVOUS_SYSTEM);
	//    }
	//
	//    // TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM
	//    public Concept getTBOfTheGenitourinarySystemConcept() {
	//        return getConcept(EhrAddonsConstants.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM);
	//    }
	//
	//    // MILIARY_TUBERCULOSIS
	//    public Concept getMiliaryTBConcept() {
	//        return getConcept(EhrAddonsConstants.MILIARY_TUBERCULOSIS);
	//    }
	//
	//    // PULMONARY_TUBERCULOSIS
	//    public Concept getPulmonaryTBConcept() {
	//        return getConcept(EhrAddonsConstants.PULMONARY_TUBERCULOSIS);
	//    }
	//
	//    // SEQUELAE_OF_TUBERCULOSIS
	//    public Concept getSequelaeOfTBConcept() {
	//        return getConcept(EhrAddonsConstants.SEQUELAE_OF_TUBERCULOSIS);
	//    }
	//
	//    // RESPIRATORY_TUBERCULOSIS
	//    public Concept getRespiratoryTBConcept() {
	//        return getConcept(EhrAddonsConstants.RESPIRATORY_TUBERCULOSIS);
	//    }
	//
	//    // RESPIRATORY_TUBERCULOSIS_UNSPECIFIED
	//    public Concept getRespiratoryTBUnsuspectedConcept() {
	//        return getConcept(EhrAddonsConstants.RESPIRATORY_TUBERCULOSIS_UNSPECIFIED);
	//    }
	//
	//    // TUBERCULOSIS_HISTOLOGICALLY_CONFIRMED
	//    public Concept getTBHistologicallyConfirmedConcept() {
	//        return getConcept(EhrAddonsConstants.TUBERCULOSIS_HISTOLOGICALLY_CONFIRMED);
	//    }
	//
	//    // RESPIRATORY_TUBERCULOSIS_NOT_CONFIRMED_BACTERIOLOGICALLY_AND_HISTOLOGICALLY
	//    public Concept getRespiratoryTBNotConfirmedBacteriologicallyAndHistologicallyConcept() {
	//        return getConcept(
	//                EhrAddonsConstants
	//                        .RESPIRATORY_TUBERCULOSIS_NOT_CONFIRMED_BACTERIOLOGICALLY_AND_HISTOLOGICALLY);
	//    }
	//
	//    // EXTRAPULMONARY_TUBERCULOSIS
	//    public Concept getExtrapulmonaryTBConcept() {
	//        return getConcept(EhrAddonsConstants.EXTRAPULMONARY_TUBERCULOSIS);
	//    }
	//
	//    // ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED
	//    public Concept getAcuteMiliaryTBUspecifiedConcept() {
	//        return getConcept(EhrAddonsConstants.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED);
	//    }
	//
	//    // OTHER_RESPIRATORY_TUBERCULOSIS
	//    public Concept getOtherRespiratoryTBConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_RESPIRATORY_TUBERCULOSIS);
	//    }
	//
	//    // MULTI_DRUG_RESISTANT_TUBERCULOSIS
	//    public Concept getMultiDrugResistantTBConcept() {
	//        return getConcept(EhrAddonsConstants.MULTI_DRUG_RESISTANT_TUBERCULOSIS);
	//    }
	//
	//    // SPUTUM_POSITIVE_PULMONARY_TUBERCULOSIS
	//    public Concept getSputumPositivePulmonaryTB() {
	//        return getConcept(EhrAddonsConstants.SPUTUM_POSITIVE_PULMONARY_TUBERCULOSIS);
	//    }
	//
	//    // SPUTUM_NEGATIVE_PULMONARY_TUBERCULOSIS
	//    public Concept getSputumNegativeTBConcept() {
	//        return getConcept(EhrAddonsConstants.SPUTUM_NEGATIVE_PULMONARY_TUBERCULOSIS);
	//    }
	//
	//    // CONTACT_WITH_AND_SUSPECTED_EXPOSURE_TO_TUBERCULOSIS
	//    public Concept getContactWithAndExposureToTB() {
	//        return getConcept(EhrAddonsConstants.CONTACT_WITH_AND_SUSPECTED_EXPOSURE_TO_TUBERCULOSIS);
	//    }
	//
	//    // ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS
	//    public Concept getEncounterForScreeningForRespiratoryTB() {
	//        return getConcept(EhrAddonsConstants.ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS);
	//    }
	//
	//    public Concept getTonsillitisConcept() {
	//        return getConcept(EhrAddonsConstants.TONSILLITIS);
	//    }
	//
	//    public Concept getCholeraConcept() {
	//        return getConcept(EhrAddonsConstants.CHOLERA);
	//    }
	//
	//    public Concept getPneumoniaConcept() {
	//        return getConcept(EhrAddonsConstants.PNEUMONIA);
	//    }
	//
	//    public Concept getOtherDiseaseOfRespiratorySystemConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_DISEASE_OF_RESPIRATORY_SYSTEM);
	//    }
	//
	//    public Concept getMentalDisorderSConcept() {
	//        return getConcept(EhrAddonsConstants.MENTAL_DISORDERS);
	//    }
	//
	//    public Concept getDentalDisorderSConcept() {
	//        return getConcept(EhrAddonsConstants.DENTAL_DISORDERS);
	//    }
	//
	//    public Concept getJiggersInfestationConcept() {
	//        return getConcept(EhrAddonsConstants.JIGGERS_INFESTATION);
	//    }
	//
	//    public Concept getDiseaseOfTheSkinConcept() {
	//        return getConcept(EhrAddonsConstants.DISEASE_OF_THE_SKIN);
	//    }
	//
	//    public Concept getChromosomalAbnormalitiesConcept() {
	//        return getConcept(EhrAddonsConstants.CHROMOSOMAL_ABNORMALITIES);
	//    }
	//
	//    public Concept getCongenitalAnomaliesConcept() {
	//        return getConcept(EhrAddonsConstants.CONGENITAL_ANOMALIES);
	//    }
	//
	//    public Concept getPoisoningConcept() {
	//        return getConcept(EhrAddonsConstants.POISONING);
	//    }
	//
	//    public Concept getRoadTrafficInjuriesConcept() {
	//        return getConcept(EhrAddonsConstants.ROAD_TRAFFIC_INJURIES);
	//    }
	//
	//    public Concept getOtherInjuriesConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_INJURIES);
	//    }
	//
	//    public Concept getSexualAssaultConcept() {
	//        return getConcept(EhrAddonsConstants.SEXUAL_ASSAULT);
	//    }
	//
	//    public Concept getBurnsConcept() {
	//        return getConcept(EhrAddonsConstants.BURNS);
	//    }
	//
	//    public Concept getSnakeBitesConcept() {
	//        return getConcept(EhrAddonsConstants.SNAKE_BITES);
	//    }
	//
	//    public Concept getDogBitesConcept() {
	//        return getConcept(EhrAddonsConstants.DOG_BITES);
	//    }
	//
	//    public Concept getOtherBitesConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_BITES);
	//    }
	//
	//    public Concept getOtherDiabetesConcept() {
	//        return getConcept(EhrAddonsConstants.DIABETES);
	//    }
	//
	//    public Concept getEpilepsyConcept() {
	//        return getConcept(EhrAddonsConstants.EPILEPSY);
	//    }
	//
	//    public Concept getOtherConvulsiveDisordersConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_CONVULSIVE_DISORDERS);
	//    }
	//
	//    public Concept getNewlyDiagnosedHivConcept() {
	//        return getConcept(EhrAddonsConstants.NEWLY_DIAGNOSED_HIV);
	//    }
	//
	//    public Concept getBrucellosisConcept() {
	//        return getConcept(EhrAddonsConstants.BRUCELLOSIS);
	//    }
	//
	//    public Concept getRicketsConcept() {
	//        return getConcept(EhrAddonsConstants.RICKETS);
	//    }
	//
	//    public Concept getCardiovascularConditionConcept() {
	//        return getConcept(EhrAddonsConstants.CARDIVASCULAR_CONDITIONS);
	//    }
	//
	//    public Concept getViolenceRelatedInjuriesConcept() {
	//        return getConcept(EhrAddonsConstants.VIOLENCE_RELATED_INJURIES);
	//    }
	//
	//    public Concept getCerebralPalsyConcept() {
	//        return getConcept(EhrAddonsConstants.CEREBRAL_PALSY);
	//    }
	//
	//    public Concept getAutismConcept() {
	//        return getConcept(EhrAddonsConstants.AUTISM);
	//    }
	//
	//    public Concept getOtherCentralNarvousSytemConditionConcept() {
	//        return getConcept(EhrAddonsConstants.OTHER_CENTRAL_NERVOUS_SYSTEM_CONDITIONS);
	//    }
	//
	//    public Concept getTryponosomiasisConcept() {
	//        return getConcept(EhrAddonsConstants.TRYPONOSOMIASIS);
	//    }
	//
	//    public Concept getKalazarConcept() {
	//        return getConcept(EhrAddonsConstants.KALAZAR);
	//    }
	//
	//    public Concept getDracunculosisConcept() {
	//        return getConcept(EhrAddonsConstants.DRACUNCULOSIS);
	//    }
	//
	//    public Concept getYellowFeverConcept() {
	//        return getConcept(EhrAddonsConstants.YELLOW_FEVER);
	//    }
	//
	//    public Concept getViralHaemorrhagicFeverConcept() {
	//        return getConcept(EhrAddonsConstants.VIRAL_HAEMORRHAGIC_FEVER);
	//    }
	//
	//    public Concept getPlagueConcept() {
	//        return getConcept(EhrAddonsConstants.PLAGUE);
	//    }
	//
	//    public Concept getDeathtsDueToRoadTrafficInjuriesConcept() {
	//        return getConcept(EhrAddonsConstants.DEATHS_DUE_TO_ROAD_TRAFFIC_INJURIES);
	//    }
	//
	//    public Concept getSexuallyTransmittedInfectionsConcept() {
	//        return getConcept(EhrAddonsConstants.SEXUALLY_TRANSMITTED_INFECTIONS);
	//    }
	//
	//    public Concept getGonorrhoeaConcept() {
	//        return getConcept(EhrAddonsConstants.GONORROHEA);
	//    }
	//
	//    public Concept getHpvConcept() {
	//        return getConcept(EhrAddonsConstants.HPV);
	//    }
	//
	//    public Concept getGenitalHerpesConcept() {
	//        return getConcept(EhrAddonsConstants.GENITAL_HERPES);
	//    }
	//
	//    public Concept getChlamydiaConcept() {
	//        return getConcept(EhrAddonsConstants.CHLAMYDIA);
	//    }
	//
	//    public Concept getHivConcept() {
	//        return getConcept(EhrAddonsConstants.HIV);
	//    }
	//
	//    public Concept getTrichomoniasisInfectionConcept() {
	//        return getConcept(EhrAddonsConstants.TRICHOMONIASIS_INFECTION);
	//    }
	//
	//    public Concept getHerpesSimplexConcept() {
	//        return getConcept(EhrAddonsConstants.HERPES_SIMPLEX);
	//    }
	//
	//    public Concept getHerpesZosterConcept() {
	//        return getConcept(EhrAddonsConstants.HERPES_ZOSTER);
	//    }
	//
	//    public Concept getHerpesZosterOphthalmicusConcept() {
	//        return getConcept(EhrAddonsConstants.HERPES_ZOSTER_OPHTHALMICUS);
	//    }
	//
	//    public Concept getHerpesviralInfectionUnspecifiedConcept() {
	//        return getConcept(EhrAddonsConstants.HERPESVIRAL_INFECTION_UNSPECIFIED);
	//    }
	//
	//    public Concept getAnogenitalHerpesSimplexVirusInfectionConcept() {
	//        return getConcept(EhrAddonsConstants.ANOGENITAL_HERPES_SIMPLEX_VIRUS_INFECTION);
	//    }
	//
	//    public Concept getChacroidConcept() {
	//        return getConcept(EhrAddonsConstants.CHANCROID);
	//    }
	//
	//    public Concept getCompleteAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.COMPLETE_ABORTION);
	//    }
	//
	//    public Concept getIncompleteAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.INCOMPLETE_ABORTION);
	//    }
	//
	//    public Concept getIncompleteSpontaneousAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.INCOMPLETE_SPONTANEOUS_ABORTION_WITHOUT_COMPLICATION);
	//    }
	//
	//    public Concept getInevitableAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.INEVITABLE_ABORTION);
	//    }
	//
	//    public Concept getMedicalAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.MEDICAL_ABORTION);
	//    }
	//
	//    public Concept getMissedAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.MISSED_ABORTION);
	//    }
	//
	//    public Concept getRecurentAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.RECURRENT_ABORTION);
	//    }
	//
	//    public Concept getSepticAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.SEPTIC_ABORTION);
	//    }
	//
	//    public Concept getThreatenedAbortionConcept() {
	//        return getConcept(EhrAddonsConstants.THREATENED_ABORTION);
	//    }
	//
	//    public Concept getUnspecifiedSpontaneousAbortionWithOtherComplicationsConcept() {
	//        return getConcept(EhrAddonsConstants.UNSPECIFIED_SPONTANEOUS_ABORTION_WITH_OTHER_COMPLICATIONS);
	//    }
	//
	//    // HYPERTENSION
	//
	//    public Concept getHypertensionConcept() {
	//        return getConcept(EhrAddonsConstants.HYPERTENSION);
	//    }
	//
	//    public Concept getPrimaryHypertensionConcept() {
	//        return getConcept(EhrAddonsConstants.PRIMARY_HYPERTENSION);
	//    }
	//
	//    public Concept getRenovascularHypertensionConcept() {
	//        return getConcept(EhrAddonsConstants.RENOVASCULAR_HYPERTENSION);
	//    }
	//
	//    public Concept getMalignantHypertensionConcept() {
	//        return getConcept(EhrAddonsConstants.MALIGNANT_HYPERTENSION);
	//    }
	//
	//    public Concept getIdiopathicHypertensionConcept() {
	//        return getConcept(EhrAddonsConstants.IDIOPATHIC_HYPERTENSION);
	//    }
	//
	//    public Concept getPregnancyInducedHypertensionConcept() {
	//        return getConcept(EhrAddonsConstants.PREGNANCY_INDUCED_HYPERTENSION);
	//    }
	//
	//    public Concept getBenignIntracranialHypertensionConcept() {
	//        return getConcept(EhrAddonsConstants.BENIGN_INTRACRANIAL_HYPERTENSION);
	//    }
	//    // 4309
	//    public Concept getElevateBPWithoutDiagnosisOfHypertensionConcept() {
	//        return getConcept(
	//                EhrAddonsConstants.ELEVATED_BLOOD_PRESSURE_READING_WITHOUT_DIAGNOSIS_OF_HYPERTENSION);
	//    }
	//
	//    public Concept getDiseaseOfPuerperiumAndChildBirthConcept() {
	//        return getConcept(EhrAddonsConstants.DISEASE_OF_PUERPERUM_AND_CHILD_BIRTH);
	//    }
	//
	//  /* public Concept getMuscularDystrophyConcept() {
	//      return getConcept(EhrAddonsConstants.MUSCULAR_DYSTROPHY);
	//  }*/
	//
	//    public Concept getUterovesicalFistula() {
	//        return getConcept(EhrAddonsConstants.UTEROVESICAL_FISTULA);
	//    }
	//
	//    public Concept getArthritisConcept() {
	//        return getConcept(EhrAddonsConstants.ARTHRITIS);
	//    }
	//
	//    public Concept getOverweightConcept() {
	//        return getConcept(EhrAddonsConstants.OVERWEIGHT_BMI_125);
	//    }
	//
	//    public Concept getMuscularDystrophyConcept() {
	//        return getConcept(EhrAddonsConstants.MUSCULAR_DYSTROPHY);
	//    }
	//
	//    public Concept getVesicovaginalFistulaConcept() {
	//        return getConcept(EhrAddonsConstants.VESICOVAGINAL_FISTULA);
	//    }
	//
	//    public Concept getNeoplamsConcept() {
	//        return getConcept(EhrAddonsConstants.NEOPLAMS);
	//    }
	//
	//    public Concept getPhysicalDisabilityConcept() {
	//        return getConcept(EhrAddonsConstants.PHYSICAL_DISABILITY);
	//    }
	//
	//    /**
	//     * Get patient referred from concept
	//     *
	//     * @return Concept
	//     */
	//    public Concept getPatientReferredFrom() {
	//        return getConcept(EhrAddonsConstants.PATIENT_REFERRED_FROM);
	//    }
	//
	//    /**
	//     * Get patient referred externally concept
	//     *
	//     * @return Concept
	//     */
	//    public Concept getPatientReferredExternally() {
	//        return getConcept(EhrAddonsConstants.EXTERNAL_REFERRAL);
	//    }
	//
	//    /**
	//     * programs ANC program
	//     *
	//     * @return Program
	//     */
	//    public Program getAncProgram() {
	//        return getProgram(EhrAddonsConstants.ANC_Program);
	//    }
	//
	//    /**
	//     * programs PNC program
	//     *
	//     * @return Program
	//     */
	//    public Program getPncProgram() {
	//        return getProgram(EhrAddonsConstants.PNC_Program);
	//    }
	//
	//    /**
	//     * programs CWC program
	//     *
	//     * @return Program
	//     */
	//    public Program getCwcProgram() {
	//        return getProgram(EhrAddonsConstants.CWC_Program);
	//    }
	//
	//    /**
	//     * Diagnosis class ID 4
	//     *
	//     * @return ConceptClass
	//     */
	//    public ConceptClass getDiagnosisConceptClass() {
	//        return Context.getConceptService().getConceptClassByUuid(EhrAddonsConstants.DIAGNOSIS_CLASS);
	//    }
	//
	//    /**
	//     * Finding class ID 5
	//     *
	//     * @return ConceptClass
	//     */
	//    public ConceptClass getFindingConceptClass() {
	//        return Context.getConceptService().getConceptClassByUuid(EhrAddonsConstants.FINDING_CLASS);
	//    }
	//
	//    /**
	//     * Finding class ID 12
	//     *
	//     * @return ConceptClass
	//     */
	//    public ConceptClass getSymptomsConceptClass() {
	//        return Context.getConceptService().getConceptClassByUuid(EhrAddonsConstants.SYMPTOMS_CLASS);
	//    }
	//
	//    /**
	//     * Finding/Symptoms class ID 13
	//     *
	//     * @return ConceptClass
	//     */
	//    public ConceptClass getSymptomsFindingsConceptClass() {
	//        return Context.getConceptService()
	//                .getConceptClassByUuid(EhrAddonsConstants.SYMPTOMS_FINDING_CLASS);
	//    }
	//
	//    // Lab investigations concept
	//    public Concept getBiochemistry() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.BIOCHEMISTRY);
	//    }
	//
	//    public Concept getCytology() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.CYTOLOGY);
	//    }
	//
	//    public Concept getHaematology() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.HAEMATOLOGY);
	//    }
	//
	//    public Concept getSerology() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.SEROLOGY);
	//    }
	//
	//    public Concept getUrineExamination() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.URINE_EXAMINATION);
	//    }
	//
	//    public Concept getParastology() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.PARASITOLOGY);
	//    }
	//
	//    public Concept getBloodTransfussion() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.BLOOD_TRANSFUSION);
	//    }
	//
	//    public Concept getMicrobilogy() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.MICROBIOLOGY);
	//    }
	//
	//    public Concept getCccLab() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.CCC_LAB);
	//    }
	//
	//    public Concept getInvestigations() {
	//        return Context.getConceptService().getConcept(EhrAddonsConstants.INVESTIGATION);
	//    }
}
