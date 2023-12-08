package Exercices.demo_mvc.repository;

//import ss6_inheritance.Student;
import ss8_mvc.model.Customer;
import ss8_mvc.util.ReadAndWriteFileCSV;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
     private final String CUSTOMER_FILE ="src/ss8_mvc/data/customer.csv";
    // tam thời tạo một mảng giả để lưu dữ liệu

    @Override
    public List<Customer> getAll() {
        // sau nay sẽ đọc dữ liệu từ  file
        // hiện tại sẽ trả về mảng giả thôi
        List<String> stringList = new ArrayList<>();
        stringList= ReadAndWriteFileCSV.readFileCSV(CUSTOMER_FILE);
        List<Customer> customerList = new ArrayList<>();
        String[] array = null;
        for (String line: stringList) {
            array = line.split(",");
            Customer customer = new Customer(Integer.parseInt(array[0]),array[1]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public List<Customer> searchByName(String searchName) {
        List<Customer> customerList = getAll();
        List<Customer> searchList = new ArrayList<>();
        for (Customer cus: customerList) {
            if (cus.getName().contains(searchName)){
                searchList.add(cus);
            }
        }
        return searchList;
    }

    @Override
    public void add(Customer customer) {
        // sau này sẽ ghi vào file
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToCSV());
        ReadAndWriteFileCSV.writeListStringToCSV(CUSTOMER_FILE,stringList,true);
       // ghi vào file
    }

    @Override
    public void delete(int id) {
        List<Customer> customerList = getAll();
        List<String> stringList = new ArrayList<>() ;

        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i).getId()!=id){
                stringList.add(customerList.get(i).getInfoToCSV());
            }
        }
        ReadAndWriteFileCSV.writeListStringToCSV(CUSTOMER_FILE,stringList,false);
        if (customerList.size()!=stringList.size()){
            System.out.println("xoá thành công");
        }else {
            System.out.println("Xoá không thành công");
        }

    }
}
