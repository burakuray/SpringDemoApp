package com.buray.northwind.business.abstracts;

import java.util.List;

import com.buray.northwind.core.utilities.results.DataResult;
import com.buray.northwind.core.utilities.results.Result;
import com.buray.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
