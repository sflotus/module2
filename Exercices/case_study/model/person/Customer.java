package Exercices.case_study.model.person;

import java.util.Date;

public class Customer extends Person{
    private String address;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(int CMND, int phoneNumber, String name, String sex, String email, String id, Date dateOfBirth, String address, String typeCustomer) {
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
                "address='" + address + '\'' +
                ", typeCustomer='" + typeCustomer ;
    }
}
