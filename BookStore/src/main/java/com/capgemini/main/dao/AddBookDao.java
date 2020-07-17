package com.capgemini.main.dao;

import com.capgemini.main.entities.OrderInformation;

public interface AddBookDao {
	
	public boolean findOrder(int orderId);
	public OrderInformation getOrderDetails(int orderId);
	public void updateAddBook(int orderId);
	public void findOrderStatus(int orderId);
}

