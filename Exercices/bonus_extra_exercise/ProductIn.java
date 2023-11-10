package Exercices.bonus_extra_exercise;

public class ProductIn extends  Product{
    private long extraIn;

    public ProductIn() {
    }

    public ProductIn(long extraIn) {
        this.extraIn = extraIn;
    }

    public ProductIn(int id, String name, TypeProduct type, long price, long extraIn) {
        super(id, name, type, price);
        this.extraIn = extraIn;
    }

    public long getExtraIn() {
        return extraIn;
    }

    public void setExtraIn(long extraIn) {
        this.extraIn = extraIn;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("nhap Extra in");
        long extraIn = Long.parseLong(scanner.nextLine());
        setExtraIn(extraIn);
    }

    @Override
    public String toString() {
        return super.toString() + "||" +"Extra In : " + extraIn;
    }

    @Override
    public Long priceForSale() {
        return super.getPrice() +this.extraIn;
    }
}
