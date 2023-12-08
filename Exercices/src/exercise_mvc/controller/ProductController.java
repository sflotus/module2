package exercise_mvc.controller;


import exercise_mvc.model.Product;
import exercise_mvc.services.IProductService;
import exercise_mvc.services.ProductService;

import java.util.ArrayList;

public class ProductController {
	private IProductService productService = new ProductService();
	public ArrayList<Product> getAll() {
		return productService.getAll();
	}
	public void add(Product p) {
		productService.add(p);
	}
	public void edit(int id){
		productService.edit(id);
	}
	public void remove(int id){
		productService.remove(id);
	}
	public Product inputDataProduct(){
		return productService.inputDataProduct();
	}
}	
