package case_study.model.person;

import java.util.Date;

public class Customer extends Person{
    private String address;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(String CMND, String phoneNumber, String name, String sex, String email, String id, String dateOfBirth, String address, String typeCustomer) {
        super(CMND, phoneNumber, name, sex, email, id, dateOfBirth);
        this.address = address;
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return super.toString() +
                " address=" + address  +
                ", typeCustomer= " + typeCustomer ;
    }

    @Override
    public String getInforToCSV() {
        return super.getInforToCSV()+","+address+","+typeCustomer;
    }
}
