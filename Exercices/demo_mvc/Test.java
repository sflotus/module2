package ss8_mvc;

import ss6_inheritance.Student;
import ss8_mvc.model.Customer;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>(10);
//        ArrayList<Integer> integers = new ArrayList<>();
//        // sử dụng cơ chế auto boxing của JDK5 => int => Interger
//        integers.add(1);
//        // không dung generic => bài 11 học
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("sssss");
//        arrayList.add(1);

        Customer customer =new Customer(1,"chánh11");
        Customer customer1 =new Customer(1,"chánh22");
        Customer customer2 =new Customer(2,"chánh2");
        Customer customer3 =new Customer(1,"chánh223");
        Set<Customer> customerSet = new LinkedHashSet<>();
        customerSet.add(customer);
        customerSet.add(customer1);
        customerSet.add(customer2);
        customerSet.add(customer3);
        // duyệt set
        for (Customer c: customerSet) {
            System.out.println(c);
        }
    }
}
