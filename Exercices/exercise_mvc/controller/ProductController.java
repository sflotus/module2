package Exercices.exercise_mvc.controller;


import Exercices.exercise_mvc.model.Product;
import Exercices.exercise_mvc.services.IProductService;
import Exercices.exercise_mvc.services.ProductService;

public class ProductController {
	private IProductService productService = new ProductService();
	public Product[] getAll() {
		return productService.getAll();
	}
	public void add(Product p) {
		productService.add(p);
	}
}	
