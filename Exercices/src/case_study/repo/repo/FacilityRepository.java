package case_study.repo.repo;

import case_study.model.facility.Facility;
import case_study.repo.interface_repo.IFacilityRepository;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository<Facility> {
    private static final String FACILITY_DATA="src/case_study/data/facility/facility.csv";
    @Override
    public List<Facility> getAll() {
        return null;
    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void diplayAll() {

    }

    @Override
    public int searchByID(String id) {
        return 0;
    }

    @Override
    public void update(List<Facility> t) {

    }

}
