package case_study.repo.repo;

import case_study.model.Booking;
import case_study.repo.interface_repo.IBookingRepository;
import case_study.util.ReadAndWriteFileCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository<Booking> {
    private static final String BOOKING_DATA = "case_study/data/booking.csv";


    @Override
    public Set<Booking> getAll() {
        List<String> stringList = ReadAndWriteFileCSV.readfileCSV(BOOKING_DATA);
        Set<Booking> bookingList = new TreeSet<>();
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            Booking booking = new Booking(array[0], array[1], array[2], array[3], array[4]);
            bookingList.add(booking);
        }
        return bookingList;

    }

    @Override
    public void add(Booking booking) {
        List<String> stringList = new ArrayList<>();
        Set<Booking> bookingSet = getAll();
        bookingSet.add(booking);
        for (Booking b : bookingSet) {
            stringList.add(b.getInforToCSV());
        }
        ReadAndWriteFileCSV.writeListStringToCSV(BOOKING_DATA, stringList, false);
    }
    @Override
    public void update(Set<Booking> bookingList) {
        List<String> stringList = new ArrayList<>();
//        ReadAndWriteFileCSV.deleteDataFile(BOOKING_DATA);
        for (Booking booking:bookingList) {
            stringList.add(booking.getInforToCSV());
        }
        ReadAndWriteFileCSV.writeListStringToCSV(BOOKING_DATA, stringList, false);
    }
}
