package exercise_mvc.repo;


import exercise_mvc.model.Product;

import java.util.ArrayList;

public interface IProductRepo {
	ArrayList<Product> getAll();
	void add(Product p);
	void remove(int id);
	void edit(int id,String name, String description, double price);
}
