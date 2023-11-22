package Exercices.ss12_java_collection.practice_java_collection.services;

import Exercices.ss12_java_collection.practice_java_collection.model.Product;

import java.util.Comparator;

public class SortProductByPriceDEC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
