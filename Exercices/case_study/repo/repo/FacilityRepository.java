package Exercices.case_study.repo.repo;

import Exercices.case_study.model.facility.Facility;
import Exercices.case_study.repo.interface_repo.IFacilityRepository;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository<Facility> {
    private List<Facility> facilityList = new ArrayList<>();
}
