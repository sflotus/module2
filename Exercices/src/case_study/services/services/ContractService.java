package case_study.services.services;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.repo.interface_repo.IContractRepository;
import case_study.repo.repo.BookingRepository;
import case_study.repo.repo.ContractRepository;
import case_study.services.interface_services.IContactService;

import java.util.*;
import java.util.regex.Pattern;

public class ContractService implements IContactService {
    private final String REGEX_ID_CONTRACT = "[C][T][-]*(\\d{4})";
    Scanner scanner = new Scanner(System.in);

    private IContractRepository contactRepository = new ContractRepository();

    @Override
    public void diplayAll() {
        List<Contract> contractList = contactRepository.getAll();
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
        System.out.println("----Display Contract List successful-----");
    }

    @Override
    public void add() {
        Booking bookingToContract = getBookingSortedByDateStartToContract();
        if (bookingToContract == null) {
            System.out.println("All Booking List has been added to contract");
        } else {
            boolean flag;
            String idBooking = bookingToContract.getIdBooking();
            System.out.println("You are making a contract with ID Booking: " + idBooking);
            System.out.println("Input ID Contract");
            String idContract;
            do {
                flag = false;
                idContract = inputValueWithRegex(REGEX_ID_CONTRACT, "Error! format of  Id Contract is CT-YYYY Y from 0 to 9 ");
                if (checkExistContractId(idContract)) {
                    System.out.println("Error, Id has Exits, Try again");
                    flag = true;
                }
            } while (flag);
            System.out.println("Input Deposit Money");
            double depositMoney = 0;
            do {
                try {
                    flag = false;
                    depositMoney = Double.parseDouble(scanner.nextLine());

                } catch (NumberFormatException e) {
                    System.out.println("Error! please input number");
                    flag = true;
                }
            } while (flag);
            System.out.println("Input Total Money");
            double totalMoney = 0;
            do {
                try {
                    flag = false;
                    totalMoney = Double.parseDouble(scanner.nextLine());

                } catch (NumberFormatException e) {
                    System.out.println("Error! please input number");
                    flag = true;
                }
            } while (flag);
            contactRepository.add(new Contract(idContract, idBooking, depositMoney, totalMoney));
            System.out.println("-----Add new contract successful-----");
        }

    }

    @Override
    public void editByID() {
        showAllId();
        System.out.println("Input Id to edit contract");
        String id = scanner.nextLine();
        if (contactRepository.searchByID(id) == -1) {
            System.out.println("Sorry, contract has id: " + id + " is not exist");
        } else {
            edit(contactRepository.searchByID(id));
        }
    }

    private void edit(int index) {
        List<Contract> contractList = contactRepository.getAll();
        boolean flag = true;
        boolean tempFlag;
        do {
            System.out.println("------edit Contract------");
            System.out.println("please Choose");
            System.out.println("1. edit Deposit Money ");
            System.out.println("2. edit Total Money ");
            System.out.println("Other. Quit edit contract ");
            int value = inputValueInt();
            switch (value) {
                case 1:
                    System.out.println("-----edit Deposit Money------");
                    double newDepositMoney = 0;
                    do {
                        try {
                            tempFlag = false;
                            newDepositMoney = Double.parseDouble(scanner.nextLine());
                            contractList.get(index).setDepositMoney(newDepositMoney);
                        } catch (NumberFormatException e) {
                            System.out.println("Error! please input number");
                            tempFlag = true;
                        }
                    } while (tempFlag);
                    break;
                case 2:
                    System.out.println("-----edit Total Money------");
                    double newTotalMoney = 0;
                    do {
                        try {
                            tempFlag = false;
                            newTotalMoney = Double.parseDouble(scanner.nextLine());
                            contractList.get(index).setTotalMoney(newTotalMoney);
                        } catch (NumberFormatException e) {
                            System.out.println("Error! please input number");
                            tempFlag = true;
                        }
                    } while (tempFlag);
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
        contactRepository.update(contractList);
    }

    private Booking getBookingSortedByDateStartToContract() {
        BookingRepository bookingRepository = new BookingRepository();
        Set<Booking> bookingSet = bookingRepository.getAll();
        Queue<Booking> bookingQueue = new PriorityQueue<>();
        for (Booking booking : bookingSet) {
            if (!checkExistIdCustomerInContract(booking.getIdBooking())) {
                bookingQueue.offer(booking);
            }
        }
        return bookingQueue.poll();
    }

    private boolean checkExistIdCustomerInContract(String value) {
        List<Contract> contractList = contactRepository.getAll();
        for (Contract contract : contractList) {
            if (contract.getIdBooking().equals(value)) {
                return true;
            }
        }
        return false;
    }

    private String inputValueWithRegex(String REGEX, String errorMessage) {
        String value;
        boolean flag;
        do {
            flag = false;
            value = scanner.nextLine();
            if (!checkRegex(REGEX, value)) {
                System.out.println(errorMessage);
                flag = true;
            }
        } while (flag);
        return value;
    }

    private boolean checkRegex(String regex, String string) {
        return Pattern.matches(regex, string);
    }

    private boolean checkExistContractId(String id) {
        List<Contract> contractList = contactRepository.getAll();
        for (Contract contract : contractList) {
            if (contract.getIdContract().equals(id)) {
                return true;
            }
        }
        return false;
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

    private void showAllId() {
        List<Contract> contractList = contactRepository.getAll();
        System.out.println("----------All Contract's Id-----------");
        for (Contract contract : contractList) {
            System.out.println(contract.getIdContract() + ": " + contract.getIdBooking());
        }
    }
}
