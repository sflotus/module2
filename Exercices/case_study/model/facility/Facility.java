package Exercices.case_study.model.facility;

public abstract class Facility {
    private  String id;
    private String name;
    private  double usingArea;
    private double price;
    private int maxNumPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String id, String name, double usingArea, double price, int maxNumPeople, String rentalType) {
        this.id = id;
        this.name = name;
        this.usingArea = usingArea;
        this.price = price;
        this.maxNumPeople = maxNumPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxNumPeople() {
        return maxNumPeople;
    }

    public void setMaxNumPeople(int maxNumPeople) {
        this.maxNumPeople = maxNumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return name +
                ": id=" + id +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", maxNumPeople=" + maxNumPeople +
                ", rentalType='" + rentalType ;
    }
}
