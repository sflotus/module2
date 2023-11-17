package Exercices.exercise_mvc.services;

import Exercices.exercise_mvc.model.Product;

import java.util.ArrayList;


public interface IProductService {
	ArrayList<Product> getAll();
	void add(Product p);

	void edit(int id);
	void remove(int id);

	Product inputDataProduct();

}
