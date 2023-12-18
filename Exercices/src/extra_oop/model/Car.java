package extra_oop.model;

public class Car extends Vehicle {
    private int quantitySeating;
    private String typeCar;

    public Car(String registrationPlate, String manufacturerName, int yearOfManufacture, String owner, int quantitySeating, String typeCar) {
        super(registrationPlate, manufacturerName, yearOfManufacture, owner);
        this.quantitySeating = quantitySeating;
        this.typeCar = typeCar;
    }

    public int getQuantitySeating() {
        return quantitySeating;
    }

    public void setQuantitySeating(int quantitySeating) {
        this.quantitySeating = quantitySeating;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "quantitySeating='" + quantitySeating + '\'' +
                ", typeCar='" + typeCar + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.quantitySeating + "," + this.typeCar;
    }
}
