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
//import org.openmrs.module.ehraddons.reporting.library.dataset.BaseDataSet.EhrAddOnColumnParameters;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Moh717Dataset extends EhrAddOnBaseDataSet {
	
	@Autowired
	private EhrGeneralIndicator ehrGeneralIndicator;
	
	@Autowired
	private Moh717CohortDefination moh717CohortDefination;
	
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
		dsd.addParameters(getParameters());
		// Tie dimensions to this data definition
		/*dsd.addDimension("gender", EhrAddonUtils.map(ehrCommonDimension.gender(), ""));
		dsd.addDimension("age", EhrAddonUtils.map(ehrCommonDimension.age(ageDimensionCohort), "effectiveDate=${endDate}"));
		dsd.addDimension("state", EhrAddonUtils.map(ehrCommonDimension.state(), "endDate=${endDate}"));
		// add your dataset here, construct it here
		//        addRow(
		//                dsd,
		//                "A",
		//                "OUTPATIENT SERVICES",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "OUTPATIENT SERVICES",
		//                                EhrAddonUtils.map(moh717CohortDefination.getOutPatients(), mappings)),
		//                        mappings),
		//                getAdultChildrenColumns());
		// Casuality
		/*  ohortIndicatorDataSetDefinition cohortDsd, String baseName, String baseLabel,
		          Mapped< CohortIndicator > indicator, List<EhrAddOnColumnParameters> columns
		*/addRow(
		    dsd,
		    "CA",
		    "Casuality CLINIC",
		    EhrAddonUtils.map(
		        ehrGeneralIndicator.getIndicator("Casuality CLINIC",
		            EhrAddonUtils.map(moh717CohortDefination.getPatientsQueuedAsCasuality(), mappings)), mappings),
		    getSpecialClinicsCategories());
		// Special clinic
		// ENT Clinic - Concept_id 5119
		//        addRow(
		//                dsd,
		//                "ENT",
		//                "ENT CLINIC",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "ENT CLINIC",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getSpecialClinicPatients(
		//                                                outpatientMetadata.getENTClinicConcept().getConceptId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// EYE Clinic - Concept_id 5118
		//        addRow(
		//                dsd,
		//                "EYE",
		//                "EYE CLINIC",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "EYE CLINIC",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getSpecialClinicPatients(
		//                                                outpatientMetadata.getEYEClinicConcept().getConceptId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// TB and  Leprosy Clinic
		//        addRow(
		//                dsd,
		//                "TBLP",
		//                "TB and Leprosy CLINIC",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "TB and Leprosy CLINIC",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getSpecialClinicPatients(
		//                                                outpatientMetadata.getTbLeprosyClinicConcept().getConceptId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// STI
		//        addRow(
		//                dsd,
		//                "STI",
		//                "STI CLINIC",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "STI CLINIC",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getSpecialClinicPatients(
		//                                                outpatientMetadata.getSTIClinicConcept().getConceptId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// CCC
		//        addRow(
		//                dsd,
		//                "CCC",
		//                "CCC CLINIC",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "CCC CLINIC",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getSpecialClinicPatients(
		//                                                outpatientMetadata.getCccClinicConcept().getConceptId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// Psy
		//        addRow(
		//                dsd,
		//                "Psy",
		//                "Psychiatry CLINIC",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "Psychiatry CLINIC",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getSpecialClinicPatients(
		//                                                outpatientMetadata.getPsycthricClinicConcept().getConceptId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// Orthopedic clinic
		//        addRow(
		//                dsd,
		//                "Ort",
		//                "Orthopedic CLINIC",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "Orthopedic CLINIC",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getSpecialClinicPatients(
		//                                                outpatientMetadata.getOrthopedicClinicConcept().getConceptId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// other special clinics
		//        addRow(
		//                dsd,
		//                "Oher",
		//                "Other CLINIC",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "Other CLINIC",
		//                                EhrAddonUtils.map(
		//                                        commonLibrary.hasObs(
		//                                                outpatientMetadata.getSpecialClinicConcept(),
		//                                                outpatientMetadata.getMopcMedicalClinicConcept(),
		//                                                outpatientMetadata.getPopsPediatricClinicConcept(),
		//                                                outpatientMetadata.getCccClinicConcept(),
		//                                                outpatientMetadata.getMopsDmDiabeticClinicConcept(),
		//                                                outpatientMetadata.getFnaClinicConcept(),
		//                                                outpatientMetadata.getGpcClinicConcept(),
		//                                                outpatientMetadata.getMchClinicConcept(),
		//                                                outpatientMetadata.getMopsClinicConcept(),
		//                                                outpatientMetadata.getPallativeClinicConcept(),
		//                                                outpatientMetadata.getSurgicalClinicConcept(),
		//                                                outpatientMetadata.getChestAndSkinClinicConcept(),
		//                                                outpatientMetadata.getDentalClinicConcept(),
		//                                                outpatientMetadata.getFamilyPlanningClinicConcept()),
		//                                        obsMappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// Family planning methods
		//        addRow(
		//                dsd,
		//                "FP",
		//                "Family Planning Services",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "Family Planning Services",
		//                                EhrAddonUtils.map(moh717CohortDefination.getFpBaseCohortPatients(), mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		
		// MCH
		//        addRow(
		//                dsd,
		//                "ANC",
		//                "ANC Program",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "ANC Program",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getMchBaseCohortPatients(
		//                                                outpatientMetadata.getAncProgram().getProgramId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		
		//        addRow(
		//                dsd,
		//                "PNC",
		//                "PNC Program",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "PNC Program",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getMchBaseCohortPatients(
		//                                                outpatientMetadata.getPncProgram().getProgramId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		
		//        addRow(
		//                dsd,
		//                "CWC",
		//                "CWC Program",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "CWC Program",
		//                                EhrAddonUtils.map(
		//                                        moh717CohortDefination.getMchBaseCohortPatients(
		//                                                outpatientMetadata.getCwcProgram().getProgramId()),
		//                                        mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
		// Dental clinic
		//        addRow(
		//                dsd,
		//                "DT",
		//                "Dental Clinic",
		//                EhrAddonUtils.map(
		//                        ehrGeneralIndicator.getIndicator(
		//                                "Dental Clinic",
		//                                EhrAddonUtils.map(moh717CohortDefination.getTotalDentalVisits(), mappings)),
		//                        mappings),
		//                getSpecialClinicsCategories());
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
	
	private List<EhrAddOnColumnParameters> getMchClientsCategories() {
		EhrAddOnColumnParameters NEW_CASES = new EhrAddOnColumnParameters("new_cases", "NEW", "state=NEW", "01");
		EhrAddOnColumnParameters REVISIT_CASES = new EhrAddOnColumnParameters("revisit_cases", "REVISIT", "state=RVT", "02");
		EhrAddOnColumnParameters TOTAL_CASES = new EhrAddOnColumnParameters("total_cases", "Total", "", "03");
		return Arrays.asList(NEW_CASES, REVISIT_CASES, TOTAL_CASES);
	}
}
