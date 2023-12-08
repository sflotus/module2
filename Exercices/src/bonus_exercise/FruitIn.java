package bonus_exercise;

import java.util.Scanner;

public class FruitIn extends Fruit {
    private double extraIn;

    public FruitIn() {
    }

    public FruitIn(double extrain) {
        this.extraIn = extrain;
    }

    public FruitIn(int id, String name, double price, double extrain) {
        super(id, name, price);
        this.extraIn = extrain;
    }

    public double getExtrain() {
        return extraIn;
    }

    public void setExtraIn(double extrain) {
        this.extraIn = extrain;
    }
    @Override
    public String toString() {
        return super.toString() +"\n"+
                "Extra In : " + getExtrain()+"\n" +
                "Price For Sale: " + priceForSale();

    }

    @Override
    public Double priceForSale() {
         return this.getExtrain() + super.getPrice();
    }
}
