package Exercices.exercise_mvc.services;

import Exercices.exercise_mvc.model.Product;
import Exercices.exercise_mvc.repo.IProductRepo;
import Exercices.exercise_mvc.repo.ProductRepo;

public class ProductService implements IProductService {
	private IProductRepo productRepo = new ProductRepo();
	@Override
	public Product[] getAll() {
		// statement
		return productRepo.getAll();
	}

	@Override
	public void add(Product p) {
		// statement
		productRepo.add(p);
	}
	
}
