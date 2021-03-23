package org.openmrs.module.ehraddons.metadata;


import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Concept;
import org.openmrs.EncounterType;
import org.openmrs.Form;
import org.openmrs.Location;
import org.openmrs.PatientIdentifierType;
import org.openmrs.PersonAttributeType;
import org.openmrs.RelationshipType;
import org.openmrs.api.context.Context;
import org.openmrs.module.reporting.common.ObjectUtil;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.openmrs.*;
//import org.openmrs.api.context.Context;
import org.openmrs.module.ehraddons.EhrAddonsConstants;
//import org.openmrs.module.reporting.common.ObjectUtil;
import org.springframework.stereotype.Component;

//import java.util.ArrayList;
//import java.util.List;

@Component
public class EhrAddonsMetadata {
	
	/**
	 * Diagnosis class ID 4
	 * 
	 * @return ConceptClass
	 */
	public ConceptClass getDiagnosisConceptClass() {
		return Context.getConceptService().getConceptClassByUuid(EhrAddonsConstants._EhrAddOnConceptClasses.DIAGNOSIS_CLASS);
	}

	protected static final Log log = LogFactory.getLog(EhrAddonsMetadata.class);

	/** @return the PatientIdentifier that matches the passed uuid, name, or primary key id */
	public static PatientIdentifierType getPatientIdentifierType(String lookup) {
		PatientIdentifierType pit = Context.getPatientService().getPatientIdentifierTypeByUuid(lookup);
		if (pit == null) {
			pit = Context.getPatientService().getPatientIdentifierTypeByName(lookup);
		}
		if (pit == null) {
			try {
				pit = Context.getPatientService().getPatientIdentifierType(Integer.parseInt(lookup));
			}
			catch (Exception e) {}
		}
		if (pit == null) {
			throw new MetadataLookupException("Unable to find Patient Identifier using key: " + lookup);
		}
		return pit;
	}

	/**
	 * @return the Concept that matches the passed uuid, name, source:code mapping, or primary key
	 *         id
	 */
	public static Concept getConcept(String lookup) {
		Concept c = Context.getConceptService().getConceptByUuid(lookup);
		if (c == null) {
			c = Context.getConceptService().getConceptByName(lookup);
		}
		if (c == null) {
			try {
				String[] split = lookup.split("\\:");
				if (split.length == 2) {
					c = Context.getConceptService().getConceptByMapping(split[1], split[0]);
				}
			}
			catch (Exception e) {}
		}
		if (c == null) {
			try {
				c = Context.getConceptService().getConcept(Integer.parseInt(lookup));
			}
			catch (Exception e) {}
		}
		if (c == null) {
			throw new ConfigurableMetadataLookupException("Unable to find Concept using key: " + lookup);
		}
		return c;
	}

	/**
	 * @return the List of Concepts that matches the passed comma-separated list of concept lookups
	 * @see EhrAddonsMetadata#getConcept(String)
	 */
	public static List<Concept> getConceptList(String lookup) {
		List<Concept> l = new ArrayList<Concept>();
		if (ObjectUtil.notNull(lookup)) {
			String[] split = lookup.split(",");
			for (String s : split) {
				l.add(EhrAddonsMetadata.getConcept(s));
			}
		}
		return l;
	}

	/**
	 * @return the List of Concepts that matches the passed any separated list of concept lookups
	 * @see EhrAddonsMetadata#getConcept(String)
	 */
	public static List<Concept> getConceptList(String lookup, String separator) {
		List<Concept> l = new ArrayList<Concept>();
		if (ObjectUtil.notNull(lookup)) {
			if (ObjectUtil.notNull(separator)) {
				String[] split = lookup.split(separator);
				for (String s : split) {
					l.add(EhrAddonsMetadata.getConcept(s));
				}
			} else {
				l.add(EhrAddonsMetadata.getConcept(lookup));
			}
		}
		return l;
	}

	/** @return the Form that matches the passed uuid, name, or primary key id */
	public static Form getForm(String lookup) {
		Form form = Context.getFormService().getFormByUuid(lookup);
		if (form == null) {
			form = Context.getFormService().getForm(lookup);
		}
		if (form == null) {
			try {
				form = Context.getFormService().getForm(Integer.parseInt(lookup));
			}
			catch (Exception e) {}
		}
		if (form == null) {
			throw new MetadataLookupException("Unable to find Form using key: " + lookup);
		}
		return form;
	}

	/**
	 * @return the List of Forms that matches the passed comma-separated list of Form lookups
	 * @see EhrAddonsMetadata#getForm(String)
	 */
	public static List<Form> getFormList(String lookup) {
		List<Form> l = new ArrayList<Form>();
		if (ObjectUtil.notNull(lookup)) {
			String[] split = lookup.split(",");
			for (String s : split) {
				l.add(EhrAddonsMetadata.getForm(s));
			}
		}
		return l;
	}

	/**
	 * @return the List of Forms that matches the passed any separated list of Form lookups
	 * @see EhrAddonsMetadata#getForm(String)
	 */
	public static List<Form> getFormList(String lookup, String separator) {
		List<Form> l = new ArrayList<Form>();
		if (ObjectUtil.notNull(lookup)) {
			if (ObjectUtil.notNull(separator)) {
				String[] split = lookup.split(separator);
				for (String s : split) {
					l.add(EhrAddonsMetadata.getForm(s));
				}
			} else {
				l.add(EhrAddonsMetadata.getForm(lookup));
			}
		}
		return l;
	}

	/** @return the EncounterType that matches the passed uuid, name, or primary key id */
	public static EncounterType getEncounterType(String lookup) {
		EncounterType et = Context.getEncounterService().getEncounterTypeByUuid(lookup);
		if (et == null) {
			et = Context.getEncounterService().getEncounterType(lookup);
		}
		if (et == null) {
			try {
				et = Context.getEncounterService().getEncounterType(Integer.parseInt(lookup));
			}
			catch (Exception e) {}
		}
		if (et == null) {
			throw new ConfigurableMetadataLookupException("Unable to find EncounterType using key: " + lookup);
		}

		return et;
	}

	/**
	 * @return the List of EncounterTypes that matches the passed comma-separated list of Encounter
	 *         lookups
	 * @see EhrAddonsMetadata#getEncounterType(String)
	 */
	public static List<EncounterType> getEncounterTypeList(String lookup) {
		List<EncounterType> l = new ArrayList<EncounterType>();
		if (ObjectUtil.notNull(lookup)) {
			String[] split = lookup.split(",");
			for (String s : split) {
				l.add(EhrAddonsMetadata.getEncounterType(s));
			}
		}
		return l;
	}

	/**
	 * @return the List of EncounterTypes that matches the passed any separated list of Encounter
	 *         lookups
	 * @see EhrAddonsMetadata#getEncounterType(String)
	 */
	public static List<EncounterType> getEncounterTypeList(String lookup, String separator) {
		List<EncounterType> l = new ArrayList<EncounterType>();
		if (ObjectUtil.notNull(lookup)) {
			if (ObjectUtil.notNull(separator)) {
				String[] split = lookup.split(separator);
				for (String s : split) {
					l.add(EhrAddonsMetadata.getEncounterType(s));
				}
			} else {
				l.add(EhrAddonsMetadata.getEncounterType(lookup));
			}
		}
		return l;
	}

	/** @return the RelationshipType that matches the passed uuid, name, or primary key id */
	public static RelationshipType getRelationshipType(String lookup) {
		RelationshipType rt = Context.getPersonService().getRelationshipTypeByUuid(lookup);
		if (rt == null) {
			rt = Context.getPersonService().getRelationshipTypeByName(lookup);
		}
		if (rt == null) {
			try {
				rt = Context.getPersonService().getRelationshipType(Integer.parseInt(lookup));
			}
			catch (Exception e) {}
		}
		if (rt == null) {
			throw new MetadataLookupException("Unable to find RelationshipType using key: " + lookup);
		}
		return rt;
	}

	/** @return the Location that matches the passed uuid, name, or primary key id */
	public static Location getLocation(String lookup) {
		Location et = Context.getLocationService().getLocationByUuid(lookup);
		if (et == null) {
			et = Context.getLocationService().getLocation(lookup);
		}
		if (et == null) {
			try {
				et = Context.getLocationService().getLocation(Integer.parseInt(lookup));
			}
			catch (Exception e) {}
		}
		if (et == null) {
			throw new MetadataLookupException("Unable to find Location using key: " + lookup);
		}

		return et;
	}

	/** @return the PersonAttributeType that matches the passed uuid, name, or primary key id */
	public static PersonAttributeType getPersonAttributeType(String lookup) {
		PersonAttributeType et = Context.getPersonService().getPersonAttributeTypeByUuid(lookup);
		if (et == null) {
			et = Context.getPersonService().getPersonAttributeTypeByName(lookup);
		}
		if (et == null) {
			try {
				et = Context.getPersonService().getPersonAttributeType(Integer.parseInt(lookup));
			}
			catch (Exception e) {}
		}
		if (et == null) {
			throw new MetadataLookupException("Unable to find PersonAttributeType using key: " + lookup);
		}

		return et;
	}
}
