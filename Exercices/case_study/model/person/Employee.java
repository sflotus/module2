package Exercices.case_study.model.person;

import java.util.Date;

public class Employee extends Person{
    private  String  level,position;
    private  int salary;

    public Employee() {
    }

    public Employee(int CMND, int phoneNumber, String name, String sex, String email, String id, String dateOfBirth, String level, String position, int salary) {
        super(CMND, phoneNumber, name, sex, email, id, dateOfBirth);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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
