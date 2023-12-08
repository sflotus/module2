package ss12_java_collection.practice_java_collection.services;

import ss12_java_collection.practice_java_collection.model.Product;

import java.util.ArrayList;


public interface IProductService {
    ArrayList<Product> getAll();

    void add(Product p);

    void edit(int id);

    void remove(int id);

    Product inputDataProduct();

    void search(String name);

    void sort(boolean reverse);

}
