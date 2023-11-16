package Exercices.exercise_mvc.repo;


import Exercices.exercise_mvc.model.Product;

public class ProductRepo implements IProductRepo {
	private static Product[] products = new Product[10];
	@Override
	public Product[] getAll() {
		// statement
		return products;
	}

	@Override
	public void add(Product p) {
		// statement
		for (int i = 0; i < products.length;i++) {
			if(products[i] == null) {
				products[i] = p;
				break;
			}
		}
	}
	
}
