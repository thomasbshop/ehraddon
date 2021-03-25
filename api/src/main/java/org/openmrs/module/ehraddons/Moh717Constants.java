package org.openmrs.module.ehraddons;

public class Moh717Constants {
	
	//available encounter_types to be mapped
	public static final String ADULTINITIAL_OUTPATIENT = "63721d9e-f28f-11ea-acf1-1ba6050a20d6"; // 1 	Outpatient Adult Initial Visit
	
	public static final String ADULTRETURN_OUTPATIENT = "6cc4098e-f28f-11ea-ac2c-335ca43b58da"; // 2 Outpatient Adult Return Visit
	
	public static final String PEDSINITIAL_OUTPATIENT = "7c14fbbe-f28f-11ea-ba41-df4a13e6c5d6"; // 3 Outpatient Pediatric Initial Visit
	
	public static final String PEDSRETURN_OUTPATIENT = "856c6f8a-f28f-11ea-ab67-3f6de890685e"; // 4 Outpatient Pediatric Return Visit
	
	public static final String REGINITIAL_OUTPATIENT = "8efa1534-f28f-11ea-b25f-af56118cf21b"; // 5 Outpatient Adult Initial Visit
	
	public static final String REGREVISIT_OUTPATIENT = "98d42234-f28f-11ea-b609-bbd062a0383b"; // 6 Outpatient Adult Return Visit
	
	public static final String OPDENCOUNTER_OUTPATIENT = "ba45c278-f290-11ea-9666-1b3e6e848887"; // 9 Encounter for OPD
	
	public static final String CHECKIN_ENCOUNTER = "ce33a16e-f291-11ea-90fb-2fc2d783a570"; // 12 Indicates the patient has done the required paperwork and check-in to begin a visit to the clinic/hospital.
	
	public static final String ANC_ENCOUNTER = "ae378f6e-f292-11ea-8ef8-0bb1ae4b7f42"; // 19 ANC encounter type
	
	// program
	public static final String ANC_Program = "e8751e5c-fbda-11ea-9bba-ff7e8cea17d3";
	
	public static final String PNC_Program = "23edfbca-fbdb-11ea-a675-17377ca3079e";
	
	public static final String CWC_Program = "645d7e4c-fbdb-11ea-911a-5fe00fc87a47"; //Maternal and Child Welfare Center
	
	// Concepts
	//    public static final String ENT_CLINIC = "";
	//    public static final String TB_LEPROSY_CLINIC = "";
	public static final String EYE_CLINIC = "a91acb56-4bdb-4b48-b9ef-1962efda55b4"; //165384
	
	public static final String STI_CLINIC = "160546AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 160546 Sexually transmitted infection program/clinic
	
	public static final String CCC_CLINIC = "162050AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 	Comprehensive care center
	
	public static final String PSYCHIATRIC_CLINIC = "59218b74-e6fc-4928-a62d-08bcef9e1510"; //id-165385 PSYCHIATRIC CLINIC
	
	public static final String TRIAGE = "f26a9c62-4047-4381-9a4e-46e2cddbe663"; //Id 165387
	
	public static final String OPD_WARD = "70285bed-156b-47ed-9704-493f10149e84"; //Id 165379
	
	public static final String CASUALTY_OPD = "b5cf9357-7d96-41e2-8393-113925d41179"; //Id 	165381
	
	public static final String CASUALTY_TRIAGE = "bd2764c6-3348-407a-a85a-f1ef6ceba766"; //Id 165415
	
	public static final String NEW_PATIENT = "164144AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
	
	public static final String REVISIT = "206688b1-421b-431e-9a02-14c4273c238d";
	
	//    public static final String ORTHOPAEDIC_CLINIC = ""; //
	//    Occupational Therapy Clinic
	//    Physiotherapy Clinic
	//    Medical Clinics
	//    public static final String SURGICAL_CLINIC = ""; // 5707
	//    public static final String POPC_PAEDIATRICS_CLINIC = "";
	//    Nutrition Clinic
	//    Oncology Clinic
	//    Renal Clinic
	public static final String SPECIAL_CLINIC = "f5c89e8c-c79e-4e20-9048-b7ef8f30b272"; //id-165386
	
	//    public static final String DENTAL_CLINIC = "";
	
	public enum OccurenceStates {
		NEW, REVISIT
	}
}
