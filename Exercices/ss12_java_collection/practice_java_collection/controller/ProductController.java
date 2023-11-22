package Exercices.ss12_java_collection.practice_java_collection.controller;


import Exercices.ss12_java_collection.practice_java_collection.model.Product;
import Exercices.ss12_java_collection.practice_java_collection.services.IProductService;
import Exercices.ss12_java_collection.practice_java_collection.services.ProductService;

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
	public void search(String name){
		productService.search(name);
	}
	public void sort(boolean reverse){
		productService.sort(reverse);
	}
}	
