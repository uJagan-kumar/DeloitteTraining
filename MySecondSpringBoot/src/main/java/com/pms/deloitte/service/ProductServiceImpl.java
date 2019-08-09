package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.deloitte.dao.ProductDao;
import com.pms.deloitte.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;;

	public void setPersonDAO(ProductDao productDao) {
		this.productDao = productDao;}
	
	@Override
	@Transactional
	public void addProduct(Product product) {
		this.productDao.save(product);
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		Product product = new Product();
		product.setProductId(productId);
		this.productDao.delete(product);

	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		this.productDao.save(product);

	}

	@Override
	@Transactional
	public List<Product> getAllProducts() {
		
		return (List<Product>)this.productDao.findAll();
	}

	@Override
	@Transactional
	public Product getProductById(int productId) {
		Optional<Product> product = this.productDao.findById(productId);
		
		if(product.isPresent())
		{
			return product.get();
		}
		else
		return null;
	}

	@Override
	public List<Product> findByPriceBetween(int price1, int price2) {
		return productDao.findByPriceBetween( price1, price2);
	}

	@Override
	public List<Product> findByPriceGreaterThan(int price1) {
		return productDao.findByPriceGreaterThan(price1);
		
	}

}
