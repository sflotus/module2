package Exercices.ss5_access_modifier.student;

public class Student {
    private String name = "john";
    private  String classname = "C02";
    Student(){
    }

    public Student(String name, String classname) {
        this.name = name;
        this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
