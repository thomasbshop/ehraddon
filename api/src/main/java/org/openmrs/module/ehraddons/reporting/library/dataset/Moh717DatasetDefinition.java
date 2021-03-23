package org.openmrs.module.ehraddons.reporting.library.dataset;

import java.util.Arrays;
import java.util.List;

import org.openmrs.module.ehraddons.reporting.cohort.definition.CustomConfigurationsDataDefinition;
import org.openmrs.module.ehraddons.reporting.library.cohorts.Moh717CohortDefination;
import org.openmrs.module.ehraddons.reporting.library.dimesions.AgeDimensionCohortInterface;
import org.openmrs.module.ehraddons.reporting.library.dimesions.EhrCommonDimension;
import org.openmrs.module.ehraddons.reporting.library.indicator.EhrGeneralIndicator;
import org.openmrs.module.ehraddons.reporting.library.indicator.SpecialClinicIndicators;
import org.openmrs.module.ehraddons.reporting.utils.EhrAddonUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Moh717DatasetDefinition extends EhrAddOnBaseDataSet {
	
	private SpecialClinicIndicators specialClinicIndicators;
	
	@Autowired
	private EhrCommonDimension ehrCommonDimension;
	
	@Autowired
	private EhrGeneralIndicator ehrGeneralIndicator;
	
	@Autowired
	private Moh717CohortDefination moh717CohortDefination;
	
	@Autowired
	@Qualifier("commonAgeDimensionCohort")
	private AgeDimensionCohortInterface ageDimensionCohort;
	
	public DataSetDefinition constructCustomDataset() {
		CustomConfigurationsDataDefinition df = new CustomConfigurationsDataDefinition();
		df.setName("Custom fields ");
		return df;
	}
	
	@Autowired
	public Moh717DatasetDefinition(SpecialClinicIndicators specialClinicIndicators) {
		this.specialClinicIndicators = specialClinicIndicators;
	}
	
	public DataSetDefinition constructMoh717Dataset() {
		
		CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
		String mappings = "startDate=${startDate},endDate=${endDate}";
		String obsMappings = "onOrAfter=${startDate},onOrBefore=${endDate}";
		dsd.setName("MOH 717 Data Set");
		dsd.addParameters(getParameters());
		// Tie dimensions to this data definition
		dsd.addDimension("gender", EhrAddonUtils.map(ehrCommonDimension.gender(), ""));
		dsd.addDimension("age", EhrAddonUtils.map(ehrCommonDimension.age(ageDimensionCohort), "effectiveDate=${endDate}"));
		dsd.addDimension("state", EhrAddonUtils.map(ehrCommonDimension.state(), "endDate=${endDate}"));
		//casualty
		addRow(
		    dsd,
		    "CA",
		    "Casuality CLINIC",
		    EhrAddonUtils.map(
		        ehrGeneralIndicator.getIndicator("Casuality CLINIC",
		            EhrAddonUtils.map(moh717CohortDefination.getPatientsQueuedAsCasuality(), mappings)), mappings),
		    getSpecialClinicsCategories());
		return dsd;
	}
	
	private List<EhrAddOnColumnParameters> getAdultChildrenColumns() {
		// Male
		EhrAddOnColumnParameters over5YearsMaleN = new EhrAddOnColumnParameters("over5YMN", "Over 5 Years Male - NEW",
		        "gender=M|age=5+|state=NEW", "01");
		EhrAddOnColumnParameters over5YearsMaleR = new EhrAddOnColumnParameters("over5YMR", "Over 5 Years Male - REVISIT",
		        "gender=M|age=5+|state=RVT", "02");
		EhrAddOnColumnParameters under5YearsMaleN = new EhrAddOnColumnParameters("under5YMN", "Under 5 Years Male - NEW",
		        "gender=M|age=<5|state=NEW", "03");
		EhrAddOnColumnParameters under5YearsMaleR = new EhrAddOnColumnParameters("under5YMR",
		        "Under 5 Years Male - REVISIT", "gender=M|age=<5|state=RVT", "04");
		EhrAddOnColumnParameters totalMale = new EhrAddOnColumnParameters("totalM", "Total Male", "gender=M", "05");
		// Female
		EhrAddOnColumnParameters over5YearsFemaleN = new EhrAddOnColumnParameters("over5YFN", "Over 5 Years Female - NEW",
		        "gender=F|age=5+|state=NEW", "06");
		EhrAddOnColumnParameters over5YearsFemaleR = new EhrAddOnColumnParameters("over5YFR",
		        "Over 5 Years Female - REVISIT", "gender=F|age=5+|state=RVT", "07");
		EhrAddOnColumnParameters under5YearsFemaleN = new EhrAddOnColumnParameters("under5YFN",
		        "Under 5 Years Female - NEW", "gender=F|age=<5|state=NEW", "08");
		EhrAddOnColumnParameters under5YearsFemaleR = new EhrAddOnColumnParameters("under5YFR",
		        "Under 5 Years Female - REVISIT", "gender=F|age=<5|state=RVT", "09");
		EhrAddOnColumnParameters over60YearsNew = new EhrAddOnBaseDataSet.EhrAddOnColumnParameters("over60new",
		        "Over 60 Years - NEW", "age=>60|state=NEW", "11");
		EhrAddOnColumnParameters over60YearsReattendance = new EhrAddOnColumnParameters("over60reatt",
		        "Over 60 Years - REVISIT", "age=>60|state=RVT", "12");
		EhrAddOnColumnParameters totalFemale = new EhrAddOnColumnParameters("totalF", "Total Female", "gender=F", "10");
		return Arrays.asList(over5YearsMaleN, over5YearsMaleR, under5YearsMaleN, under5YearsMaleR, totalMale,
		    over5YearsFemaleN, over5YearsFemaleR, under5YearsFemaleN, under5YearsFemaleR, over60YearsNew,
		    over60YearsReattendance, totalFemale);
	}
	
	private List<EhrAddOnColumnParameters> getSpecialClinicsCategories() {
		EhrAddOnColumnParameters NEW_CASES = new EhrAddOnColumnParameters("new_cases", "NEW", "state=NEW", "01");
		EhrAddOnColumnParameters REVISIT_CASES = new EhrAddOnColumnParameters("revisit_cases", "REVISIT", "state=RVT", "02");
		EhrAddOnColumnParameters TOTAL_CASES = new EhrAddOnColumnParameters("total_cases", "Total", "", "03");
		return Arrays.asList(NEW_CASES, REVISIT_CASES, TOTAL_CASES);
	}
	
	/*	private List<EhrAddOnColumnParameters> getMchClientsCategories() {
			EhrAddOnColumnParameters NEW_CASES = new EhrAddOnColumnParameters("new_cases", "NEW", "state=NEW", "01");
			EhrAddOnColumnParameters REVISIT_CASES = new EhrAddOnColumnParameters("revisit_cases", "REVISIT", "state=RVT", "02");
			EhrAddOnColumnParameters TOTAL_CASES = new EhrAddOnColumnParameters("total_cases", "Total", "", "03");
			return Arrays.asList(NEW_CASES, REVISIT_CASES, TOTAL_CASES);
		}*/
}
