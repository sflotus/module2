package Exercices.case_study.repo.repo;

import Exercices.case_study.model.facility.Facility;
import Exercices.case_study.repo.interface_repo.IFacilityRepository;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository<Facility> {
    private ArrayList<Facility> facilityList = new ArrayList<>();


    @Override
    public ArrayList<Facility> getAll() {
        return facilityList;
    }

    @Override
    public void add(Facility facility) {
        facilityList.add(facility);
    }

    @Override
    public void remove(int index) {
        facilityList.remove(index);
    }

    @Override
    public void diplayAll() {
        for(Facility f:facilityList){
            System.out.println(f);
        }
    }

    @Override
    public int searchByID(String id) {
        for(int i =0;i<facilityList.size();i++){
            if ( facilityList.get(i).getIdServices().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
