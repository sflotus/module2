package case_study.repo.repo;

import case_study.model.Booking;
import case_study.repo.interface_repo.IBookingRepository;
import case_study.util.ReadAndWriteFileCSV;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository<Booking> {
    private static final String BOOKING_DATA = "case_study/data/booking.csv";


    @Override
    public List<Booking> getAll() {
        List<String> stringList = ReadAndWriteFileCSV.readfileCSV(BOOKING_DATA);
        List<Booking> bookingList = new ArrayList<>();
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
        stringList.add(booking.getInforToCSV());
        ReadAndWriteFileCSV.writeListStringToCSV(BOOKING_DATA, stringList, true);
    }

    @Override
    public void remove(int index) {
        List<String> stringList = new ArrayList<>();
        List<Booking> bookingList = getAll();
        for (int i = 0; i < bookingList.size(); i++) {
            if (i != index) {
                stringList.add(bookingList.get(i).getInforToCSV());
            }
        }
        ReadAndWriteFileCSV.writeListStringToCSV(BOOKING_DATA,stringList,false);
    }

    @Override
    public void diplayAll() {
    List<Booking> bookingList = getAll();
        for (Booking booking:bookingList) {
            System.out.println(booking);
        }
    }

    @Override
    public int searchByID(String idBooking) {
        List<Booking> bookingList = getAll();
        for (int i =0; i <bookingList.size();i++){
            if (bookingList.get(i).getIdBooking().equals(idBooking)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(List<Booking> bookingList) {
        List<String> stringList = new ArrayList<>();
        ReadAndWriteFileCSV.deleteDataFile(BOOKING_DATA);
        for (Booking booking:bookingList) {
            stringList.add(booking.getInforToCSV());
        }
        ReadAndWriteFileCSV.writeListStringToCSV(BOOKING_DATA,stringList,true);
    }
}
