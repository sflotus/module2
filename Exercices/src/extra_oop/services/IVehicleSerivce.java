package extra_oop.services;

public interface IVehicleSerivce<T> {
    void displayAll();

    void addNew();

    void editVehicleByRegistrationPlate();

    int searchByRegistrationPlate();
}
