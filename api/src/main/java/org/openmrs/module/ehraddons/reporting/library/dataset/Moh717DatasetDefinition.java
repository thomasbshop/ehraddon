package org.openmrs.module.ehraddons.reporting.library.dataset;

import java.util.Arrays;
import java.util.List;
import org.openmrs.module.ehraddons.metadata.OutpatientMetadata;
import org.openmrs.module.ehraddons.reporting.cohort.definition.CustomConfigurationsDataDefinition;
import org.openmrs.module.ehraddons.reporting.library.cohorts.CommonLibrary;
import org.openmrs.module.ehraddons.reporting.library.cohorts.Moh717CohortDefination;
import org.openmrs.module.ehraddons.reporting.library.dimesions.AgeDimensionCohortInterface;
import org.openmrs.module.ehraddons.reporting.library.dimesions.EhrCommonDimension;
import org.openmrs.module.ehraddons.reporting.library.indicator.EhrGeneralIndicator;
import org.openmrs.module.ehraddons.reporting.utils.EhrAddonUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Moh717DatasetDefinition extends BaseDataSet {
	
	private EhrCommonDimension ehrCommonDimension;
	
	private EhrGeneralIndicator ehrGeneralIndicator;
	
	private Moh717CohortDefination moh717CohortDefination;
	
	private OutpatientMetadata outpatientMetadata;
	
	private CommonLibrary commonLibrary;
	
	@Autowired
	public Moh717DatasetDefinition(EhrCommonDimension ehrCommonDimension, EhrGeneralIndicator ehrGeneralIndicator,
	    Moh717CohortDefination moh717CohortDefination, OutpatientMetadata outpatientMetadata, CommonLibrary commonLibrary) {
		this.ehrCommonDimension = ehrCommonDimension;
		this.ehrGeneralIndicator = ehrGeneralIndicator;
		this.moh717CohortDefination = moh717CohortDefination;
		this.outpatientMetadata = outpatientMetadata;
		this.commonLibrary = commonLibrary;
	}
	
	// @Autowired
	// private EhrCommonDimension ehrCommonDimension;
	
	// @Autowired
	// private EhrGeneralIndicator ehrGeneralIndicator;
	
	// @Autowired
	// private Moh717CohortDefination moh717CohortDefination;
	
	// @Autowired
	// private OutpatientMetadata outpatientMetadata;
	
	// @Autowired
	// private CommonLibrary commonLibrary;
	
	//	@Autowired
	//	@Qualifier("commonAgeDimensionCohort")
	//	private AgeDimensionCohortInterface ageDimensionCohort;
	
	public DataSetDefinition constructCustomDataset() {
		CustomConfigurationsDataDefinition df = new CustomConfigurationsDataDefinition();
		df.setName("Custom fields ");
		return df;
	}
	
	public DataSetDefinition constructMoh717Dataset() {
		
		CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
		String mappings = "startDate=${startDate},endDate=${endDate}";
		String obsMappings = "onOrAfter=${startDate},onOrBefore=${endDate}";
		dsd.setName("MOH 717 Data Set");
		//		dsd.addParameters(getParameters());
		//		// Tie dimensions to this data definition
		//		//				dsd.addDimension("gender", EhrAddonUtils.map(ehrCommonDimension.gender(), ""));
		//		//				dsd.addDimension("age",
		//		//				                EhrAddonUtils.map(ehrCommonDimension.age(ageDimensionCohort), "effectiveDate=${endDate}"));
		//		dsd.addDimension("state", EhrAddonUtils.map(ehrCommonDimension.state(), "endDate=${endDate}"));
		//		// add your dataset here, construct it here
		//
		//		// other special clinics
		//		addRow(dsd, "Other", "Other CLINIC", EhrAddonUtils.map(
		//		    ehrGeneralIndicator.getIndicator("Other CLINIC",
		//		        EhrAddonUtils.map(commonLibrary.hasObs(outpatientMetadata.getSpecialClinicConcept()), obsMappings)),
		//		    mappings), getSpecialClinicsCategories());
		//
		return dsd;
	}
	
	private List<ColumnParameters> getSpecialClinicsCategories() {
		ColumnParameters NEW_CASES = new ColumnParameters("new_cases", "NEW", "state=NEW", "01");
		ColumnParameters REVISIT_CASES = new ColumnParameters("revisit_cases", "REVISIT", "state=RVT", "02");
		ColumnParameters TOTAL_CASES = new ColumnParameters("total_cases", "Total", "", "03");
		return Arrays.asList(NEW_CASES, REVISIT_CASES, TOTAL_CASES);
	}
}
