package com.buray.northwind.business.abstracts;

import com.buray.northwind.core.entities.User;
import com.buray.northwind.core.utilities.results.DataResult;
import com.buray.northwind.core.utilities.results.Result;

public interface UserService{

	Result add(User user);
	DataResult<User> findByEmail(String email);
}
