package com.buray.northwind.core.utilities.results;

public class DataResult<T> extends Result{

	private T data;
	
	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.setData(data);
	}
	
	public DataResult(T data, boolean success) {
		super(success);
		this.setData(data);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
