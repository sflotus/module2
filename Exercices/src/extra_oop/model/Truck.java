package extra_oop.model;

public class Truck extends Vehicle {
    private double truckPayLoad;

    public Truck(String registrationPlate, String manufacturerName, int yearOfManufacture, String owner, double truckPayLoad) {
        super(registrationPlate, manufacturerName, yearOfManufacture, owner);
        this.truckPayLoad = truckPayLoad;
    }

    public double getTruckPayLoad() {
        return truckPayLoad;
    }

    public void setTruckPayLoad(double truckPayLoad) {
        this.truckPayLoad = truckPayLoad;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "truckPayLoad='" + truckPayLoad + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.truckPayLoad;
    }
}
