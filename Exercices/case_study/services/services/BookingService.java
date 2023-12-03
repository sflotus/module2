package Exercices.case_study.services.services;

import Exercices.case_study.repo.IRepository;
import Exercices.case_study.repo.interface_repo.IBookingRepository;
import Exercices.case_study.repo.repo.BookingRepository;
import Exercices.case_study.services.interface_services.IBookingService;

public class BookingService implements IBookingService {
  private IBookingRepository bookingServices = new BookingRepository();

  @Override
  public void diplayAll() {

  }

  @Override
  public void add() {

  }
}
