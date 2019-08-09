package com.pms.deloitte.dao;

import java.util.List;

import org.hibernate.query.criteria.internal.CriteriaUpdateImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pms.deloitte.model.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer>
{
   public List<Product> findByPriceBetween(int price1,int price2);
   public List<Product> findByPriceGreaterThan(int price1);

}
