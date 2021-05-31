package com.buray.northwind.business.abstracts;

import java.util.List;

import com.buray.northwind.core.utilities.results.DataResult;
import com.buray.northwind.core.utilities.results.Result;
import com.buray.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories); 
	DataResult<List<Product>> getByProductNameContains(String productName);
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	DataResult<List<Product>> getByProductNameEndsWith(String productName);
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
}
