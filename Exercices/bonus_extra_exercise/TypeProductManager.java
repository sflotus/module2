package Exercices.bonus_extra_exercise;

import java.util.ArrayList;

public class TypeProductManager implements IManager<TypeProduct>, ISort {
    private ArrayList<TypeProduct> typeProducts = new ArrayList<>();

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
            System.out.println("Khong tim thay san pham voi ID : " + name);
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
                    TypeProduct temp ;
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
    if(reverse){
        for (int i = 0; i < typeProducts.size(); i++) {
            for (int j = i + 1; j < typeProducts.size(); j++) {
                if (typeProducts.get(i).getId() < typeProducts.get(j).getId()) {
                    TypeProduct temp=typeProducts.get(i) ;
                    typeProducts.set(i, typeProducts.get(j));
                    typeProducts.set(j, temp);
                }
            }
        }
        displayAll();
    }
    }

}
