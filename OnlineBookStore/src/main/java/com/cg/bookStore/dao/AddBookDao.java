package com.cg.bookStore.dao;

import com.cg.bookStore.entities.OrderInformation;

public interface AddBookDao {
	
	public boolean findOrder(int orderId);
	public OrderInformation getOrderDetails(int orderId);
	public void updateAddBook(int orderId);
	public void findOrderStatus(int orderId);
}
