package Exercices.case_study.repo.repo;

import Exercices.case_study.model.Booking;
import Exercices.case_study.repo.interface_repo.IBookingRepository;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository<Booking> {
    private ArrayList<Booking> bookingList = new ArrayList<>();


    @Override
    public ArrayList<Booking> getAll() {
        return bookingList;
    }

    @Override
    public void add(Booking booking) {
        bookingList.add(booking);
    }

    @Override
    public void remove(int index) {
        bookingList.remove(index);
    }

    @Override
    public void diplayAll() {
        for (Booking b:bookingList
             ) {
            System.out.println(b);
        }
    }

}
