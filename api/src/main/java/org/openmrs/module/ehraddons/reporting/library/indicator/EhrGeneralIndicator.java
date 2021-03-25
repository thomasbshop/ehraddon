package org.openmrs.module.ehraddons.reporting.library.indicator;

import java.util.List;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.stereotype.Component;

@Component
public class EhrGeneralIndicator extends BaseIndicators {
	
	/**
	 * Methods that takes a cohort definition and return and indicator definition for reuse
	 * 
	 * @return CohortIndicator
	 */
	public CohortIndicator getIndicator(String name, Mapped<CohortDefinition> cd) {
		return newCohortIndicator(name, cd);
	}
	
	/**
	 * Method to be used for the calculation of the indicators to be used on data quality report
	 * 
	 * @return CohortIndicator
	 */
	public CohortIndicator getIndicator(String name, Mapped<CohortDefinition> cd, List<Parameter> parameters) {
		CohortIndicator cI = getIndicator(name, cd);
		cI.addParameters(parameters);
		return cI;
	}
}
