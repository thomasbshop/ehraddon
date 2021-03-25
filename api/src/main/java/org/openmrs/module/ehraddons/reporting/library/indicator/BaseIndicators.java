package org.openmrs.module.ehraddons.reporting.library.indicator;

import java.util.Date;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.indicator.CohortIndicator;

// Generic Indicators Class for functions shared across all indicators
public abstract class BaseIndicators {
	
	protected CohortIndicator newCohortIndicator(String name, Mapped<CohortDefinition> cohort) {
		CohortIndicator i = new CohortIndicator(name);
		i.setCohortDefinition(cohort);
		i.addParameter(new Parameter("startDate", "Start date", Date.class));
		i.addParameter(new Parameter("endDate", "End date", Date.class));
		return i;
	}
}
