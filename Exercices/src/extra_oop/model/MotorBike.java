package extra_oop.model;

public class MotorBike extends Vehicle {
    private double enginePower;

    public MotorBike(String registrationPlate, String manufacturerName, int yearOfManufacture, String owner, double enginePower) {
        super(registrationPlate, manufacturerName, yearOfManufacture, owner);
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "MotorBike{" + super.toString() +
                "enginePower='" + enginePower + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.enginePower;
    }
}
