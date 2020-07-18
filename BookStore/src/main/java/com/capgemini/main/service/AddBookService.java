package com.capgemini.main.service;

public interface AddBookService {
	
	public boolean findOrderById(int orderId);
	public String updateAddBook(int orderId);
	public String findOrderStatus(int orderId);
	
}
