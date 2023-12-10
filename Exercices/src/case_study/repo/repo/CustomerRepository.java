package case_study.repo.repo;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repo.interface_repo.ICustomerRepository;
import case_study.util.ReadAndWriteFileCSV;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository<Customer> {
    private static final String CUSTOMER_DATA = "case_study/data/person/customer.csv";

    @Override
    public List<Customer> getAll() {
        List<String> stringList = ReadAndWriteFileCSV.readfileCSV(CUSTOMER_DATA);
        List<Customer> customerList = new ArrayList<>();
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            customerList.add(new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]));
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInforToCSV());
        ReadAndWriteFileCSV.writeListStringToCSV(CUSTOMER_DATA, stringList, true);
    }

    @Override
    public void remove(int index) {
        List<Customer> customerList = getAll();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (i != index) {
                stringList.add(customerList.get(i).getInforToCSV());
            }
        }
        ReadAndWriteFileCSV.writeListStringToCSV(CUSTOMER_DATA, stringList, false);
    }

    @Override
    public int searchByID(String id) {
        List<Customer> customerList = getAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        ReadAndWriteFileCSV.deleteDataFile(CUSTOMER_DATA);
        for (Customer customer : customerList) {
            stringList.add(customer.getInforToCSV());
        }
        ReadAndWriteFileCSV.writeListStringToCSV(CUSTOMER_DATA, stringList, false);
    }


}
