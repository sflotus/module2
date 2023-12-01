package Exercices.case_study.model.facility;

public class House extends Facility{
    private String roomStandard;
    private  int quantityFloor;

    public House() {
    }

    public House(int id, String name, double usingArea, double price, int maxNumPeople, String rentalType, String roomStandard, int quantityFloor) {
        super(id, name, usingArea, price, maxNumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.quantityFloor = quantityFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getQuantityFloor() {
        return quantityFloor;
    }

    public void setQuantityFloor(int quantityFloor) {
        this.quantityFloor = quantityFloor;
    }

    @Override
    public String toString() {
        return super.toString()+
                " roomStandard= " + roomStandard +
                ", quantityFloor=" + quantityFloor;
    }
}
