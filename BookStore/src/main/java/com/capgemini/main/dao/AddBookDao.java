package com.capgemini.main.dao;

import com.capgemini.main.entities.OrderInformation;

public interface AddBookDao {
	
	public boolean findOrder(int orderId);
	public void updateAddBook(int orderId);
	public String findOrderStatus(int orderId);
}

