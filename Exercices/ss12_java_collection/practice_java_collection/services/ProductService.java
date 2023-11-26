package Exercices.ss12_java_collection.practice_java_collection.services;

import Exercices.ss12_java_collection.practice_java_collection.model.Product;
import Exercices.ss12_java_collection.practice_java_collection.repo.IProductRepo;
import Exercices.ss12_java_collection.practice_java_collection.repo.ProductRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepo productRepo = new ProductRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public ArrayList<Product> getAll() {
        return productRepo.getAll();
    }

    @Override
    public void add(Product product) {
        productRepo.add(product);
    }


    public void edit(int id) {
        ArrayList<Product> temp = productRepo.getAll();
        boolean isExist = false;
        for (int i=0;i< temp.size();i++) {
            if (temp.get(i).getId() == id) {
                System.out.println("nhap ten moi:");
                String name = scanner.nextLine();
                System.out.println("Nhap thanh tien moi:");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("nhap mieu ta moi:");
                String description = scanner.nextLine();
                productRepo.edit(i,name,description,price);
                isExist = true;
                System.out.println("chỉnh sửa thành công");
            }
        }
        if (!isExist) {
            System.out.println("K tim thay id can chinh sua");
        }
    }

    public void remove(int id) {
    ArrayList<Product> temp = productRepo.getAll();
    boolean isExist = false;
        for (int i=0;i< temp.size();i++) {
            if (temp.get(i).getId() == id) {
                productRepo.remove(i);
                isExist = true;
                System.out.println("Xoá thành công");
            }
        }
        if (!isExist) {
            System.out.println("K tim thay id can xoa");
        }
    }

    @Override
    public void search(String name) {
        ArrayList<Product> temp = productRepo.getAll();
        boolean isExist = false;
        for (Product product : temp) {
            if (product.getName().equals(name) ) {
                isExist = true;
                System.out.println("tim thay san pham");
                System.out.println(product);
            }
        }
        if (!isExist) {
            System.out.println("K tim thay san pham co ten can tim");
        }
    }

    @Override
    public void sort(boolean reverse) {
        List<Product> temp =new ArrayList<>();
        temp =productRepo.cloneProduct();
        if(reverse){
            temp.sort(new SortProductByPriceASC());
        } else temp.sort(new SortProductByPriceDEC());
        for (Product product : temp) {
            System.out.println(product);
        }
    }

    public Product inputDataProduct() {
        int id = inputId();
        System.out.print("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá thành tiền : ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập mô tả : ");
        String description = scanner.nextLine();
        return new Product(id, name, description, price);
    }
    private  int inputId() {
        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        while (true){
            if(checkExistId(id)){
                System.out.println("Id da ton tai. Nhap lai");
                System.out.println("ID:");
                id = Integer.parseInt(scanner.nextLine());
            } else  return id;
        }
    }
    private   boolean checkExistId(int id){
        ArrayList<Product> temp = productRepo.getAll();
        for(Product product :temp){
            if (id == product.getId()){
                return true;
            }
        }
        return  false;
    }
}
