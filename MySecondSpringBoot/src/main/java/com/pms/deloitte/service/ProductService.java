package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import com.pms.deloitte.model.Product;

public interface ProductService 
{
	public void addProduct(Product product);
	public void deleteProduct(int productId);

	public void updateProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int productId);
	public List<Product> findByPriceBetween(int price1,int price2);
	public List<Product> findByPriceGreaterThan(int price1);


	
}
