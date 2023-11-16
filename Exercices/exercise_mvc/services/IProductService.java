package Exercices.exercise_mvc.services;

import Exercices.exercise_mvc.model.Product;


public interface IProductService {
	Product[] getAll();
	void add(Product p);
}
