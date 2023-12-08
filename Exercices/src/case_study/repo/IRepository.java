package case_study.repo;

import case_study.model.person.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IRepository<T> {
    List<T> getAll();
    void add(T t);
    void remove(int index);
    void diplayAll();

    int searchByID(String id);

    void edit(T t);
}
