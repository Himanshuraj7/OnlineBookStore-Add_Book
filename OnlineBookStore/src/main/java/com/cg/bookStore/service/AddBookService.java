package com.cg.bookStore.service;

public interface AddBookService {
	
	public boolean findOrderById(int orderId);
	public String updateAddBook(int orderId);
	public void findOrderStatus(int orderId);
	
}
