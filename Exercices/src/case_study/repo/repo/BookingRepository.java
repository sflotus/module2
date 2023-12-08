package case_study.repo.repo;

import case_study.model.Booking;
import case_study.repo.interface_repo.IBookingRepository;

import java.util.List;

public class BookingRepository implements IBookingRepository<Booking> {
    private static final String BOOKING_DATA="src/case_study/data/booking.csv";


    @Override
    public List<Booking> getAll() {
        return null;
    }

    @Override
    public void add(Booking booking) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void diplayAll() {

    }

    @Override
    public int searchByID(String id) {
        return 0;
    }

    @Override
    public void edit(Booking booking) {

    }
}
