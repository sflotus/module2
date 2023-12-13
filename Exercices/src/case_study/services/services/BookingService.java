package case_study.services.services;

import case_study.model.Booking;
import case_study.model.facility.Facility;
import case_study.model.person.Customer;
import case_study.repo.interface_repo.IBookingRepository;
import case_study.repo.repo.BookingRepository;
import case_study.repo.repo.CustomerRepository;
import case_study.repo.repo.FacilityRepository;
import case_study.services.interface_services.IBookingService;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class BookingService implements IBookingService {
  private final String REGEX_DATE = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
  private final String REGEX_ID_BOOKING = "[B][K][-]*(\\d{4})";
  Scanner scanner = new Scanner(System.in);
  private IBookingRepository bookingRepository = new BookingRepository();

  @Override
  public void diplayAll() {
    Set<Booking> bookingList = bookingRepository.getAll();
    for (Booking booking : bookingList) {
      System.out.println(booking);
    }
  }

  @Override
  public void add() {
    System.out.println("Input ID Booking");
    String idBooking = inputValueWithRegex(REGEX_ID_BOOKING, "Invalid Id, right format is CT-YYYY Y from 0 to 9");
    System.out.println("Choose ID customer");
    String idCustomer = inputIdCustomer();
    System.out.println("Choose ID service");
    String idService = inputIdService();
    System.out.println("Input Date Start");
    String dateStart = inputValueWithRegex(REGEX_DATE, "Invalid date, right format is yyyy-mm-dd");
    System.out.println("Input Date End");
    String dateEnd = inputValueWithRegex(REGEX_DATE, "Invalid date, right format is yyyy-mm-dd");
    Booking booking = new Booking(idBooking, idService, idCustomer, dateStart, dateEnd);
    bookingRepository.add(booking);

    System.out.println("--------Add New Booking Successful-------");
  }

  @Override
  public void editByID() {

  }

  private String inputIdCustomer() {
    CustomerRepository customerRepository = new CustomerRepository();
    List<Customer> customerList = customerRepository.getAll();
    System.out.println("List Id Customer");
    int i = 0;
    for (Customer customer : customerList) {
      System.out.println((i + 1) + ": " + customer.getId() + " -" + customer.getName());
      i++;
    }
    System.out.println("Input number to choose Id customer");
    int index;
    boolean flag;
    String value = null;
    do {
      flag = false;
      try {
        index = Integer.parseInt(scanner.nextLine());
        value = customerList.get(index - 1).getId();
      } catch (Exception e) {
        System.out.println("Invalid Number, try again");
        flag = true;
      }

    } while (flag);
    System.out.println("Add Id Customer: " + value + " Successful");
    return value;
  }

  private String inputIdService() {
    FacilityRepository facilityRepository = new FacilityRepository();
    List<Facility> facilityList = facilityRepository.getAll();
    System.out.println("List Id Service");
    int i = 0;
    for (Facility facility : facilityList) {
      System.out.println((i + 1) + ": " + facility.getIdServices() + " - " + facility.getNameServices());
      i++;
    }
    System.out.println("Input number to choose Id Facility to booking");
    int index;
    boolean flag;
    String value = null;
    do {
      flag = false;
      try {
        index = Integer.parseInt(scanner.nextLine());
        value = facilityList.get(index).getIdServices();
      } catch (Exception e) {
        System.out.println("Invalid Number, try again");
      }

    } while (flag);
    System.out.println("Add Id Services: " + value + " Successful");
    return value;
  }

  private String inputValueWithRegex(String REGEX, String errorMessage) {
    String value;
    boolean flag;
    do {
      flag = false;
      value = scanner.nextLine();
      if (!Pattern.matches(REGEX, value)) {
        System.out.println(errorMessage);
        flag = true;
      }
    } while (flag);
    return value;
  }
}
