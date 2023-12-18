package extra_oop.services.imple;

import extra_oop.model.Car;
import extra_oop.model.MotorBike;
import extra_oop.model.Truck;
import extra_oop.model.Vehicle;
import extra_oop.repo.imple.VehicleRepo;
import extra_oop.services.IVehicleSerivce;

import java.util.List;
import java.util.Scanner;

public class VehicleService implements IVehicleSerivce<Vehicle> {
    VehicleRepo vehicleRepo = new VehicleRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        List<Vehicle> vehicleList = vehicleRepo.getAll();
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }

    }

    @Override
    public void addNew() {
        System.out.println("Please choose Vehicle");
        System.out.println("1. Add new Truck");
        System.out.println("2. Add new Car");
        System.out.println("3. Add new MotorBike");
        System.out.println("Other. Return to Menu");
        System.out.println("Input Number:");
        boolean flag = true;
        do {
            try {
                int valueChoose = Integer.parseInt(scanner.nextLine());
                switch (valueChoose) {
                    case 1:
                        vehicleRepo.creat(addNewTruck());
                        System.out.println("Add new truck successful");
                        break;
                    case 2:
                        vehicleRepo.creat(addNewCar());
                        System.out.println("Add new car successful");
                        break;
                    case 3:
                        vehicleRepo.creat(addNewMotorBike());
                        System.out.println("Add new motorbike successful");
                        break;
                    default:
                        flag = false;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Please input number");
            }
        }
        while (flag);

    }

    @Override
    public void editVehicleByRegistrationPlate() {

    }

    @Override
    public int searchByRegistrationPlate() {
        return 0;
    }

    private Car addNewCar() {
        System.out.println("Input Registration Plate");
        String registrationPlate = scanner.nextLine();
        System.out.println("Input Manufacturer Name");
        String manufacturerName = scanner.nextLine();
        System.out.println("Input year Of Manufacture");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Input owner");
        String owner = scanner.nextLine();
        System.out.println("Input quantity Seating");
        int quantitySeating = Integer.parseInt(scanner.nextLine());
        System.out.println("Input type Car");
        String typeCar = scanner.nextLine();
        return new Car(registrationPlate, manufacturerName, yearOfManufacture, owner, quantitySeating, typeCar);
    }

    private Truck addNewTruck() {
        System.out.println("Input Registration Plate");
        String registrationPlate = scanner.nextLine();
        System.out.println("Input Manufacturer Name");
        String manufacturerName = scanner.nextLine();
        System.out.println("Input year Of Manufacture");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Input owner");
        String owner = scanner.nextLine();
        System.out.println("Input Truck Payload");
        double truckPayLoad = Double.parseDouble(scanner.nextLine());
        return new Truck(registrationPlate, manufacturerName, yearOfManufacture, owner, truckPayLoad);
    }

    private MotorBike addNewMotorBike() {
        System.out.println("Input Registration Plate");
        String registrationPlate = scanner.nextLine();
        System.out.println("Input Manufacturer Name");
        String manufacturerName = scanner.nextLine();
        System.out.println("Input year Of Manufacture");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Input owner");
        String owner = scanner.nextLine();
        System.out.println("Input Truck Payload");
        double enginePower = Double.parseDouble(scanner.nextLine());
        return new MotorBike(registrationPlate, manufacturerName, yearOfManufacture, owner, enginePower);
    }
}
