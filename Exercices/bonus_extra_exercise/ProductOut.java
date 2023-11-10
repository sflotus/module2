package Exercices.bonus_extra_exercise;

public class ProductOut extends Product{
    private long extraOut;

    public ProductOut() {
    }

    public ProductOut(long extraOut) {
        this.extraOut = extraOut;
    }

    public ProductOut(int id, String name, TypeProduct type, long price, long extraOut) {
        super(id, name, type, price);
        this.extraOut = extraOut;
    }

    public long getExtraOut() {
        return extraOut;
    }

    public void setExtraOut(long extraOut) {
        this.extraOut = extraOut;
    }


    @Override
    public void input() {
        super.input();
        System.out.println("nhap Extra out");
        long extraOut = Long.parseLong(scanner.nextLine());
        setExtraOut(extraOut);
    }

    @Override
    public String toString() {
        return super.toString() + "||" +" Extra Out : " + extraOut;
    }

    @Override
    public Long priceForSale() {
        return super.getPrice() +(this.extraOut*10/100) + this.extraOut;
    }
}
