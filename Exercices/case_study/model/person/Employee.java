package Exercices.case_study.model.person;

import java.util.Date;

public class Employee extends Person{
    private  String  level,position;
    private  int salary;

    public Employee() {
    }

    public Employee(int CMND, int phoneNumber, String name, String sex, String email, String id, Date dateOfBirth, String level, String position, int salary) {
        super(CMND, phoneNumber, name, sex, email, id, dateOfBirth);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary;
    }
}
