package com.cg.bookStore.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.bookStore.entities.OrderInformation;

@Repository
public class AddBookDaoImpl implements AddBookDao {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public boolean findOrder(int orderId) {
		return entityManager.contains(entityManager.find(OrderInformation.class, orderId));
		
	}
	
	@Override
	public void findOrderStatus(int orderId) {
		entityManager.find(OrderInformation.class, orderId);
		
	}

	@Override
	public OrderInformation getOrderDetails(int orderId) {
		return entityManager.find(OrderInformation.class, orderId);
	
	}
	
	@Override
	public void updateAddBook(int orderId) {
		entityManager.find(OrderInformation.class, orderId);
		
	}
	
}
