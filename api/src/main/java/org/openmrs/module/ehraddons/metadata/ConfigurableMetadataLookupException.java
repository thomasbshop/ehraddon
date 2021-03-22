package org.openmrs.module.ehraddons.metadata;

import org.openmrs.module.ehraddons.metadata.MetadataLookupException;

/**
 * Should be thrown when there is an error during lookup of metadata that can be configured via
 * global properties.
 */
public class ConfigurableMetadataLookupException extends MetadataLookupException {
	
	public ConfigurableMetadataLookupException(String message) {
		super(message);
	}
}
