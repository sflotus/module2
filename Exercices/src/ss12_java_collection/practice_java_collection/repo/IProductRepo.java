package ss12_java_collection.practice_java_collection.repo;


import ss12_java_collection.practice_java_collection.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepo {
	ArrayList<Product> getAll();
	void add(Product p);
	void remove(int id);
	void edit(int id,String name, String description, double price);

	List<Product> cloneProduct();
}
