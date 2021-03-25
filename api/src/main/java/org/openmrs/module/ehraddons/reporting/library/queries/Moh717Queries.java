package org.openmrs.module.ehraddons.reporting.library.queries;

public class Moh717Queries {
	
	/**
	 * Special clinic query
	 * 
	 * @return String
	 */
	public static String getSpecialClinicPatients(int enc1, int enc2, int enc3, int enc4, int enc12, int enc19,
	        int conceptsQsn, int conceptAns) {
		String sql = " SELECT p.patient_id FROM patient p INNER JOIN encounter e ON p.patient_id=e.patient_id INNER JOIN obs o "
		        + " ON e.encounter_id=o.encounter_id WHERE e.encounter_type IN(%d, %d, %d, %d, %d, %d) AND "
		        + " o.concept_id IN(%d) AND o.value_coded IN(%d) AND e.encounter_datetime BETWEEN :startDate AND :endDate ";
		return String.format(sql, enc1, enc2, enc3, enc4, enc12, enc19, conceptsQsn, conceptAns);
	}
	
	/**
	 * Casulaity query
	 * 
	 * @return String
	 */
	public static String getPatientsGeneralQuery(int conceptQn1, int conceptQn2, int conceptAns1, int conceptAns2) {
		String sql = " SELECT p.patient_id FROM patient p INNER JOIN encounter e ON p.patient_id=e.patient_id INNER JOIN obs o "
		        + " ON e.encounter_id=o.encounter_id WHERE  o.concept_id IN(%d, %d) AND o.value_coded IN(%d, %d) AND e.encounter_datetime BETWEEN :startDate AND :endDate ";
		return String.format(sql, conceptQn1, conceptQn2, conceptAns1, conceptAns2);
	}
}
