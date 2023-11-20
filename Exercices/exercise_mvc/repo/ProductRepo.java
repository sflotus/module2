package Exercices.exercise_mvc.repo;


import Exercices.exercise_mvc.model.Product;

import java.util.ArrayList;

public class ProductRepo implements IProductRepo {
    private static ArrayList<Product> products = new ArrayList<>();

    @Override
    public ArrayList<Product> getAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }
    public void edit(int i,String name, String description, double price) {
        products.get(i).setName(name);
        products.get(i).setDescription(description);
        products.get(i).setPrice(price);
    }
    public void remove(int i){
        products.remove(i);
    }
}
