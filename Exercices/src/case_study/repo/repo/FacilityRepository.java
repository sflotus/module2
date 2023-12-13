package case_study.repo.repo;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repo.interface_repo.IFacilityRepository;
import case_study.util.ReadAndWriteFileCSV;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository<Facility> {
    private final String FACILITY_DATA = "case_study/data/facility/facility.csv";

    @Override
    public List<Facility> getAll() {
        List<String> stringList = ReadAndWriteFileCSV.readfileCSV(FACILITY_DATA);
        List<Facility> facilityList = new ArrayList<>();
        String[] array;

        for (String string : stringList) {
            array = string.split(",");
            if (array[0].contains("SVVL")) {
                Facility facility = new Villa(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6], Double.parseDouble(array[7]), Integer.parseInt(array[8]));
                facilityList.add(facility);
            } else if ((array[0].contains("SVHO"))) {
                Facility facility = new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6], Integer.parseInt(array[7]));
                facilityList.add(facility);
            } else
                facilityList.add(new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6]));
        }
        return facilityList;
    }

    @Override
    public void add(Facility facility) {
        List<String> stringList = new ArrayList<>();
        stringList.add(facility.getInforToCSV());
        ReadAndWriteFileCSV.writeListStringToCSV(FACILITY_DATA, stringList, true);
    }

    @Override
    public void remove(int index) {
        List<String> stringList = new ArrayList<>();
        List<Facility> facilityList = getAll();
        for (int i = 0; i < facilityList.size(); i++) {
            if (i != index) {
                stringList.add(facilityList.get(i).getInforToCSV());
            }
        }
        ReadAndWriteFileCSV.writeListStringToCSV(FACILITY_DATA, stringList, false);

    }


    @Override
    public int searchByID(String id) {
        List<Facility> facilityList = getAll();
        for (int i = 0; i < facilityList.size(); i++) {
            if (facilityList.get(i).getIdServices().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(List<Facility> facilityList) {
        List<String> stringList = new ArrayList<>();
//        ReadAndWriteFileCSV.deleteDataFile(FACILITY_DATA);
        for (Facility facility : facilityList
        ) {
            stringList.add(facility.getInforToCSV());
        }
        ReadAndWriteFileCSV.writeListStringToCSV(FACILITY_DATA, stringList, false);
    }

}
