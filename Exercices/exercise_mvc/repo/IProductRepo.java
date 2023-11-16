package Exercices.exercise_mvc.repo;


import Exercices.exercise_mvc.model.Product;

public interface IProductRepo {
	Product[] getAll();
	void add(Product p);
}
