package case_study.model.facility;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String id, String name, double usingArea, double price, int maxNumPeople, String rentalType, String freeService) {
        super(id, name, usingArea, price, maxNumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                " freeService= " + freeService;
    }

    @Override
    public String getInforToCSV() {
        return super.getInforToCSV() + "," + freeService;
    }
}
