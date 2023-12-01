package Exercices.case_study.repo.repo;

import Exercices.case_study.model.Booking;
import Exercices.case_study.repo.interface_repo.IBookingRepository;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository<Booking> {
    private List<Booking> bookingList = new ArrayList<>();
}
