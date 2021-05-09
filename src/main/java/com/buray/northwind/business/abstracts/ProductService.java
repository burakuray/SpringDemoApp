package com.buray.northwind.business.abstracts;

import java.util.List;
import com.buray.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
