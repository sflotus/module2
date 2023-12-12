package case_study.repo.interface_repo;


import case_study.model.Booking;

import java.util.List;
import java.util.Set;

public interface IBookingRepository<T> {
    Set<Booking> getAll();

    void add(T t);

    void update(Set<T> t);
}
