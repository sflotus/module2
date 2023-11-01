package Exercices.ss6_inheritance_oop.test;

import Exercices.ss6_inheritance_oop.test.Human;

public class Male extends Human {
    private  boolean sex;
    public Male(String name, int age, boolean sex){
        super(name, age);
        this.sex = sex;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public String toString(){
        return super.toString() + "|| Sex: " + (this.sex == true ? "Male" : "Female");
    }
}
