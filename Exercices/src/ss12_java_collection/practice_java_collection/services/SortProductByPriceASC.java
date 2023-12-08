package ss12_java_collection.practice_java_collection.services;

import ss12_java_collection.practice_java_collection.model.Product;

import java.util.Comparator;

public class SortProductByPriceASC implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
