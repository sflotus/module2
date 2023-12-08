package case_study.services.services;

import case_study.repo.IRepository;
import case_study.repo.interface_repo.IBookingRepository;
import case_study.repo.repo.BookingRepository;
import case_study.services.interface_services.IBookingService;

public class BookingService implements IBookingService {
  private IBookingRepository bookingServices = new BookingRepository();

  @Override
  public void diplayAll() {

  }

  @Override
  public void add() {

  }
}
