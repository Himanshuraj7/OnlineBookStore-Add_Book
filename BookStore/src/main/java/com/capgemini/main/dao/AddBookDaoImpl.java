package com.capgemini.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.main.entities.OrderInformation;


@Repository
public class AddBookDaoImpl implements AddBookDao {

	@Autowired
	@PersistenceContext
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

