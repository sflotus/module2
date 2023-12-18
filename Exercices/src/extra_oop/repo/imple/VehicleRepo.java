package extra_oop.repo.imple;

import extra_oop.model.Car;
import extra_oop.model.MotorBike;
import extra_oop.model.Truck;
import extra_oop.model.Vehicle;
import extra_oop.repo.IVehicleRepo;
import extra_oop.util.ReadAndWriteFileCSV;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepo implements IVehicleRepo<Vehicle> {
    public static String VEHICLE_DATA = "extra_oop/data/vehicle.csv";

    @Override
    public List<Vehicle> getAll() {
        List<String> stringList = ReadAndWriteFileCSV.readFileCSV(VEHICLE_DATA);
        List<Vehicle> vehicleList = new ArrayList<>();
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            if (array[0].contains("TR")) {
                vehicleList.add(new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4])));
            } else if (array[0].contains("CA")) {
                vehicleList.add(new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]));
            } else {
                vehicleList.add(new MotorBike(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4])));
            }
        }
        return vehicleList;
    }

    @Override
    public void creat(Vehicle vehicle) {
        List<String> stringList = new ArrayList<>();
        stringList.add(vehicle.getInfoToCSV());
        ReadAndWriteFileCSV.writeListStringToCSV(VEHICLE_DATA, stringList, true);
    }

    @Override
    public void update(List<Vehicle> vehicleList) {
        List<String> stringList = new ArrayList<>();
        for (Vehicle vehicle : vehicleList) {
            stringList.add(vehicle.getInfoToCSV());
        }
        ReadAndWriteFileCSV.writeListStringToCSV(VEHICLE_DATA, stringList, false);
    }

    @Override
    public void delete(int index) {
        List<String> stringList = new ArrayList<>();
        List<Vehicle> vehicleList = getAll();
        for (int i = 0; i < vehicleList.size(); i++) {
            if (i != index) {
                stringList.add(vehicleList.get(i).getInfoToCSV());
            }
        }
        ReadAndWriteFileCSV.writeListStringToCSV(VEHICLE_DATA, stringList, false);
    }
}
