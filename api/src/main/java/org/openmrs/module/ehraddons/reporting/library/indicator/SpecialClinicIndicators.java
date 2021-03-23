package org.openmrs.module.ehraddons.reporting.library.indicator;

import org.openmrs.module.ehraddons.reporting.library.cohorts.special_clinic.SpecialClinicCohortQueries;
import org.openmrs.module.ehraddons.reporting.utils.EhrAddonUtils;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpecialClinicIndicators {
	
	@Autowired
	private SpecialClinicCohortQueries queries;
	
	@Autowired
	private EhrGeneralIndicator ehrGeneralIndicator;
	
	public CohortIndicator getSpecialClinic(int ans) {
		return ehrGeneralIndicator.getIndicator("Special clinic indicator",
		    EhrAddonUtils.map(queries.getAllSpecialClinicPatients(ans), "startDate=${startDate},endDate=${endDate}"));
	}
	
	public CohortIndicator getTotalRevisits() {
		return ehrGeneralIndicator.getIndicator("Total Revisits indicator",
		    EhrAddonUtils.map(queries.getAllVisitsRevisit(), "startDate=${startDate},endDate=${endDate}"));
	}
	
	public CohortIndicator getTotalNewVisits() {
		return ehrGeneralIndicator.getIndicator("Total new visits indicator",
		    EhrAddonUtils.map(queries.getNewPatientsOnly(), "startDate=${startDate},endDate=${endDate}"));
	}
}
