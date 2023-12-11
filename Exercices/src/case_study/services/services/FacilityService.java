package case_study.services.services;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.model.person.Customer;
import case_study.repo.interface_repo.IFacilityRepository;
import case_study.repo.repo.FacilityRepository;
import case_study.services.FuramaExeption;
import case_study.services.interface_services.IFacilityService;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FacilityService implements IFacilityService {
    private final static String REGEX_VILLA = "[S][V][V][L][-]*(\\d{4})";
    private final static String REGEX_HOUSE = "[S][V][H][O][-]*(\\d{4})";
    private final static String REGEX_ROOM = "[S][V][R][O][-]*(\\d{4})";
    private final static String REGEX_NAMES_SERVICES = "^[A-Z][a-z ]*$";

    Scanner scanner = new Scanner(System.in);
    private IFacilityRepository facilityRepository = new FacilityRepository();


    public void diplayAll() {
        List<Facility> facilityList = facilityRepository.getAll();
        for (Facility f : facilityList) {
            System.out.println(f);
        }
    }


    public void add() {
        boolean flag = true;
        do {
            System.out.println("Please choose type facility to add:");
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("Other. Back to Menu");
            int value = inputValueInt();
            switch (value) {
                case 1:
                    facilityRepository.add(addNewVilla());
                    break;
                case 2:
                    facilityRepository.add(addNewHouse());
                    break;
                case 3:
                    facilityRepository.add(addNewRoom());
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    @Override
    public void editByID() {

    }

    @Override
    public void diplayFacilityMaintenance() {

    }


    private Facility addNewVilla() {
        boolean flag;
        System.out.println("Input Villa's ID Service ");
        String idService = null;
        do {
            flag = false;
            try {
                idService = inputId(REGEX_VILLA);
                if (checkExistFacilityId(idService)) {
                    System.out.println("Error, Id has Exits, Try again");
                    flag = true;
                }
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println(" Input Villa's Name Service ");
        String nameSerivce = null;
        do {
            flag = false;
            try {
                nameSerivce = inputName(REGEX_NAMES_SERVICES);
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input Villa's using area");
        double usingArea;
        do {
            flag = false;
            usingArea=inputValueDouble();
            if (!(usingArea >30)){
                System.out.println("Error, Using area must > 30, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input Villa's price for rent");
        double priceForRent;
        do {
            flag = false;
            priceForRent=inputValueDouble();
            if (!(priceForRent >0)){
                System.out.println("Error, Price for rent  must > 0, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input max Number People");
        int maxNumPeople;
        do {
            flag = false;
            maxNumPeople=inputValueInt();
            if (maxNumPeople<=0||maxNumPeople>=20){
                System.out.println("Error, Maximum number is between 0 and 20, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input rentalType");
        String rentalType = scanner.nextLine();
        System.out.println("Input Villa's room standard");
        String roomStandard = scanner.nextLine();
        System.out.println("Input Villa's pool area");
        double poolArea;
        do {
            flag = false;
            poolArea=inputValueDouble();
            if (!(poolArea >30)){
                System.out.println("Error, pool area must > 30, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input Villa's quantity floor");
        int quantityFloor;
        do {
            flag = false;
            quantityFloor=inputValueInt();
            if (!(quantityFloor >0)){
                System.out.println("Error, Quantity flor must > 0, try again");
                flag=true;
            }
        }while (flag);
        return new Villa(idService, nameSerivce, usingArea, priceForRent, maxNumPeople, rentalType, roomStandard, poolArea, quantityFloor);

    }

    private Facility addNewHouse(){
        boolean flag;
        System.out.println("Input House's ID Service ");
        String idService = null;
        do {
            flag = false;
            try {
                idService = inputId(REGEX_HOUSE);
                if (checkExistFacilityId(idService)) {
                    System.out.println("Error, Id has Exits, Try again");
                    flag = true;
                }
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println(" Input House's Name Service ");
        String nameSerivce = null;
        do {
            flag = false;
            try {
                nameSerivce = inputName(REGEX_NAMES_SERVICES);
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input House's using area");
        double usingArea;
        do {
            flag = false;
            usingArea=inputValueDouble();
            if (!(usingArea >30)){
                System.out.println("Error, Using area must > 30, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input House's price for rent");
        double priceForRent;
        do {
            flag = false;
            priceForRent=inputValueDouble();
            if (!(priceForRent >0)){
                System.out.println("Error, Price for rent  must > 0, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input max Number People");
        int maxNumPeople;
        do {
            flag = false;
            maxNumPeople=inputValueInt();
            if (maxNumPeople<=0||maxNumPeople>=20){
                System.out.println("Error, Maximum number is between 0 and 20, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input House's rentalType");
        String rentalType = scanner.nextLine();
        System.out.println("Input House's room standard");
        String roomStandard = scanner.nextLine();
        System.out.println("Input House's quantity floor");
        int quantityFloor;
        do {
            flag = false;
            quantityFloor=inputValueInt();
            if (!(quantityFloor >0)){
                System.out.println("Error, Quantity flor must > 0, try again");
                flag=true;
            }
        }while (flag);
        return new House(idService, nameSerivce, usingArea, priceForRent, maxNumPeople, rentalType, roomStandard, quantityFloor);
    }
    private Facility addNewRoom(){
        boolean flag;
        System.out.println("Input Room's ID Service ");
        String idService = null;
        do {
            flag = false;
            try {
                idService = inputId(REGEX_ROOM);
                if (checkExistFacilityId(idService)) {
                    System.out.println("Error, Id has Exits, Try again");
                    flag = true;
                }
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println(" Input Room's Name Service ");
        String nameSerivce = null;
        do {
            flag = false;
            try {
                nameSerivce = inputName(REGEX_NAMES_SERVICES);
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input Room's using area");
        double usingArea;
        do {
            flag = false;
            usingArea=inputValueDouble();
            if (!(usingArea >30)){
                System.out.println("Error, Using area must > 30, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input Room's price for rent");
        double priceForRent;
        do {
            flag = false;
            priceForRent=inputValueDouble();
            if (!(priceForRent >0)){
                System.out.println("Error, Price for rent  must > 0, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input max Number People");
        int maxNumPeople;
        do {
            flag = false;
            maxNumPeople=inputValueInt();
            if (maxNumPeople<=0||maxNumPeople>=20){
                System.out.println("Error, Maximum number is between 0 and 20, try again");
                flag=true;
            }
        }while (flag);
        System.out.println("Input Room's rentalType");
        String rentalType = scanner.nextLine();
        System.out.println("Input Room's free service");
        String freeService = scanner.nextLine();
        return new Room(idService, nameSerivce, usingArea, priceForRent, maxNumPeople, rentalType, freeService);
    }
    private int inputValueInt() {
        int value = 0;
        boolean flag;
        do {
            flag = false;
            try {
                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("please input Number, try again");
                flag = true;
            }
        } while (flag);

        return value;
    }

    private double inputValueDouble() {
        double value = 0;
        boolean flag;
        do {
            flag = false;
            try {
                value = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("please input Number type Double, try again");
                flag = true;
            }
        } while (flag);
        return value;
    }

    private String inputId(String regex) throws FuramaExeption {
        String Id = scanner.nextLine();
        if (!Pattern.matches(regex, Id)) {
            throw new FuramaExeption("Error! format of Facility's Id Service is SVXX-YYYY Y from 0 to 9\n" +
                    "Villa-XX : VL\n" +
                    "House-XX: HO\n" +
                    "Room-XX: RO  ");
        } else return Id;

    }

    private String inputName(String regex) throws FuramaExeption {
        String name = scanner.nextLine();
        if (!Pattern.matches(regex, name)) {
            throw new FuramaExeption("Error! Facility's name service must be UpperCase the 1st letter, try again. ");
        } else return name;

    }

    private boolean checkExistFacilityId(String id) {
        List<Facility> facilityList = facilityRepository.getAll();
        for (Facility facility : facilityList) {
            if (facility.getIdServices().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
