package Exercices.case_study.services.services;

import Exercices.case_study.repo.interface_repo.IFacilityRepository;
import Exercices.case_study.repo.repo.FacilityRepository;
import Exercices.case_study.services.interface_services.IFacilityService;

public class FacilityService implements IFacilityService {
    private IFacilityRepository facilityRepository = new FacilityRepository();
}
