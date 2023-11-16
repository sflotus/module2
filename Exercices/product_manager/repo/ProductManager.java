package Exercices.product_manager.repo;


import Exercices.product_manager.model.Product;
import Exercices.product_manager.model.ProductIn;
import Exercices.product_manager.model.ProductOut;

import java.util.ArrayList;

public class ProductManager implements IManager<Product>,ISort,ISortPrice{
    private ArrayList<Product> products = new ArrayList<>();

    public ProductManager() {
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        products.add(product);
    }

    public Product search(int id) {
        boolean isExit = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println(products.get(i));
                isExit = true;
                return products.get(i);
            }
        }
        if (!isExit) {
            System.out.println("Khong tim thay san pham voi ID : " + id);
        }
        return null;
    }


    public void remove(int id) {
        boolean isExit = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                isExit = true;
                products.remove(i);
            }
        }
        if (!isExit) {
            System.out.println("Khong tim thay san pham voi ID : " + id);
        }
    }


    public ArrayList<Product> search(String name) {
        boolean isExit = false;
        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName() == name) {
                list.add(products.get(i));
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Khong tim thay san pham voi ID : " + name);
        }
        return list;
    }


    public ArrayList<Product> getAll() {
        ArrayList<Product> list = new ArrayList<>();
        list.addAll(products);
        return list;
    }


    public void displayAll() {
        for (Product product : products
        ) {
            System.out.println(product);
        }
    }


    public void sortById() {
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getId() > products.get(j).getId()) {
                    Product temp;
                    temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
        displayAll();
    }


    public void sortById(boolean reverse) {
        if (reverse) {
            for (int i = 0; i < products.size(); i++) {
                for (int j = i + 1; j < products.size(); j++) {
                    if (products.get(i).getId() < products.get(j).getId()) {
                        Product temp;
                        temp = products.get(i);
                        products.set(i, products.get(j));
                        products.set(j, temp);
                    }
                }
            }
            displayAll();
        }
    }


    public void sortByPrice() {
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getPrice() >= products.get(j).getPrice()) {
                    Product temp;
                    temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
        displayAll();
    }


    public void sortByPrice(boolean reverse) {
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getPrice() < products.get(j).getPrice()) {
                    Product temp;
                    temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
        displayAll();
    }

    private int countType(int typeId) {
        int count = 0;
        for (Product product : products) {
            if (product.getType().getId() == typeId) {
                count++;
            }
        }
        return count;
    }

    public void sortByQuantityOfType() {
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (this.countType(products.get(i).getType().getId()) < this.countType(products.get(j).getType().getId())) {
                    Product temp;
                    temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
        displayAll();

    }

    public void viewProduct(String typeproduct) {
        switch (typeproduct) {
            case "In":
                for (Product product : products) {
                    if (product instanceof ProductIn) {
                        System.out.println(product);
                    }
                }
                break;
            case "Out":
                for (Product product : products) {
                    if (product instanceof ProductOut) {
                        System.out.println(product);
                    }
                }
                break;
        }
    }

    public void viewProduct(long value) {
        for (Product product : products) {
            if (product instanceof ProductIn) {
                if (((ProductIn) product).getPrice() >= value) {
                    System.out.println(product);
                }
                ;
            }
            if (product instanceof ProductOut) {
                if (((ProductOut) product).getPrice() >= value) {
                    System.out.println(product);
                }
                ;
            }
        }
    }
}

