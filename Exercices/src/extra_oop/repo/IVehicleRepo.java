package extra_oop.repo;

import extra_oop.model.Vehicle;

import java.util.List;

public interface IVehicleRepo<T> {
    List<T> getAll();

    void creat(Vehicle vehicle);

    void update(List<T> t);

    void delete(int index);
}
