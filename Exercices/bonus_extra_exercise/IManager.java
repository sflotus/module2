package Exercices.bonus_extra_exercise;

import java.util.ArrayList;

public interface IManager<T> {
    void  add(T t);
    T search(int id);
    void remove(int id);
    ArrayList<T> search(String name);
    ArrayList<T> getAll();
    void displayAll();
}
