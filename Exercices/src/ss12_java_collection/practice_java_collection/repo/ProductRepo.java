package ss12_java_collection.practice_java_collection.repo;


import ss12_java_collection.practice_java_collection.model.Product;

import java.util.ArrayList;

public class ProductRepo implements IProductRepo {
    private static ArrayList<Product> products = new ArrayList<>();

    @Override
    public ArrayList<Product> getAll() {
        return products;
    }
    public ArrayList<Product> cloneProduct(){
        ArrayList<Product> productClone = new ArrayList<>();
        // user loop for to coppy
        for (int i =0;i< products.size();i++){
            productClone.add(products.get(i));
        }
        return productClone;
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
