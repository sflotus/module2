package Exercices.case_study.model.facility;

public class Room extends Facility{
    private String roomStandard;
    private double poolArea;
    private  int quantityFloor;

    public Room() {
    }

    public Room(int id, String name, double usingArea, double price, int maxNumPeople, String rentalType, String roomStandard, double poolArea, int quantityFloor) {
        super(id, name, usingArea, price, maxNumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.quantityFloor = quantityFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getQuantityFloor() {
        return quantityFloor;
    }

    public void setQuantityFloor(int quantityFloor) {
        this.quantityFloor = quantityFloor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "roomStandard= " + roomStandard  +
                ", poolArea= " + poolArea +
                ", quantityFloor= " + quantityFloor ;
    }
}
