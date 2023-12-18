package extra_oop.model;

public abstract class Vehicle {
    private String registrationPlate;
    private String manufacturerName;
    private int yearOfManufacture;
    private String owner;

    public Vehicle(String registrationPlate, String manufacturerName, int yearOfManufacture, String owner) {
        this.registrationPlate = registrationPlate;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public Vehicle() {
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "seaOfControl='" + registrationPlate + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", Owner='" + owner + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return this.registrationPlate + "," + this.manufacturerName + "," + this.yearOfManufacture + "," + this.owner;
    }
}
