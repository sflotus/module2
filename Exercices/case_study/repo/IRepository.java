package Exercices.case_study.repo;

import java.util.ArrayList;
import java.util.List;

public interface IRepository<T> {
    ArrayList<T> getAll();
    void add(T t);
    void remove(int index);
    void diplayAll();
}
