package Exercices.bonus_extra_exercise;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TypeProductManager implements IManager<TypeProduct>, ISort {
    private ArrayList<TypeProduct> typeProducts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public TypeProductManager() {
    }

    public TypeProductManager(ArrayList<TypeProduct> typeProducts) {
        this.typeProducts = typeProducts;
    }

    public ArrayList<TypeProduct> getTypeProducts() {
        return typeProducts;
    }

    public void setTypeProducts(ArrayList<TypeProduct> typeProducts) {
        this.typeProducts = typeProducts;
    }

    @Override
    public void add(TypeProduct typeProduct) {
        typeProducts.add(typeProduct);
    }

    @Override
    public TypeProduct search(int id) {
        boolean isExit = false;
        for (int i = 0; i < typeProducts.size(); i++) {
            if (typeProducts.get(i).getId() == id) {
                System.out.println(typeProducts.get(i));
                isExit = true;
                return typeProducts.get(i);
            }
        }
        if (!isExit) {
            System.out.println("Khong tim thay san pham voi ID : " + id);
        }
        return null;
    }

    @Override
    public void remove(int id) {
        boolean isExit = false;
        for (int i = 0; i < typeProducts.size(); i++) {
            if (typeProducts.get(i).getId() == id) {
                isExit = true;
                typeProducts.remove(i);
            }
        }
        if (!isExit) {
            System.out.println("Khong tim thay san pham voi ID : " + id);
        }
    }

    @Override
    public ArrayList<TypeProduct> search(String name) {
        boolean isExit = false;
        ArrayList<TypeProduct> list = new ArrayList<>();
        for (int i = 0; i < typeProducts.size(); i++) {
            if (typeProducts.get(i).getName() == name) {
                list.add(typeProducts.get(i));
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Khong tim thay san pham voi Name : " + name);
        }
        return list;
    }

    @Override
    public ArrayList<TypeProduct> getAll() {
        ArrayList<TypeProduct> list = new ArrayList<>();
        list.addAll(typeProducts);
        return list;
    }

    @Override
    public void displayAll() {
        for (TypeProduct typeProduct : typeProducts
        ) {
            System.out.println(typeProduct);
        }
    }

    @Override
    public void sortById() {
        for (int i = 0; i < typeProducts.size(); i++) {
            for (int j = i + 1; j < typeProducts.size(); j++) {
                if (typeProducts.get(i).getId() > typeProducts.get(j).getId()) {
                    TypeProduct temp;
                    temp = typeProducts.get(i);
                    typeProducts.set(i, typeProducts.get(j));
                    typeProducts.set(j, temp);
                }
            }
        }
        displayAll();
    }

    @Override
    public void sortById(boolean reverse) {
        if (reverse) {
            for (int i = 0; i < typeProducts.size(); i++) {
                for (int j = i + 1; j < typeProducts.size(); j++) {
                    if (typeProducts.get(i).getId() < typeProducts.get(j).getId()) {
                        TypeProduct temp = typeProducts.get(i);
                        typeProducts.set(i, typeProducts.get(j));
                        typeProducts.set(j, temp);
                    }
                }
            }
            displayAll();
        }
    }

    private int countType(int typeId) {
        int count = 0;
        for (TypeProduct typeProduct : typeProducts) {
            if (typeProduct.getId() == typeId) {
                count++;
            }
        }
        return count;
    }

    public void sortByQuantityOfType() {
        for (int i = 0; i < typeProducts.size(); i++) {
            for (int j = i + 1; j < typeProducts.size(); j++) {
                if (this.countType(typeProducts.get(i).getId()) < this.countType(typeProducts.get(j).getId())) {
                    TypeProduct temp;
                    temp = typeProducts.get(i);
                    typeProducts.set(i, typeProducts.get(j));
                    typeProducts.set(j, temp);
                }
            }
        }
        displayAll();
    }

    private String chooseTypeProductName() {
        ArrayList<String> listNames = new ArrayList<>();
        int value;
        boolean flag;
        System.out.println("Danh sách TypeProduct:");
        for (TypeProduct typeProduct : typeProducts) {
            // add name to listName
            if (!listNames.equals(typeProduct.getName())) {
                listNames.add(typeProduct.getName());
            }
        }
        for (int i =0; i<listNames.size();i++){
            System.out.println(i+": "+listNames.get(i));
        }
        do {
            flag = false;
            System.out.println("Mời bạn Chọn TypeProduct:");
            value =Integer.parseInt(scanner.nextLine());
            if(!(0<=value&&value<=listNames.size())){
                System.out.println("Giá trị chọn không hợp lệ.");
                flag=true;
            }
        }
        while (flag);
        return listNames.get(value);
    }
    public void displayByTypeProductName(){
        String value =chooseTypeProductName();
        System.out.println("Danh Sách:");
        for (TypeProduct typeProduct:typeProducts){
            if(typeProduct.getName()==value){
                System.out.println(typeProduct);
            }
        }
    }
    public  void  removeByTypeProductName(){
        System.out.println("Mời bạn chọn Type Product cần xóa");
        String value =chooseTypeProductName();
        for( int i =0; i< typeProducts.size();i++){
            if(typeProducts.get(i).getName()== value){
                typeProducts.remove(i);
                i--;
            }
        }
    }
}

