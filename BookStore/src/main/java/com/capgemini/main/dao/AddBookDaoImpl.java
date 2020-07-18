package com.capgemini.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.main.entities.OrderInformation;

@Transactional
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
	public String findOrderStatus(int orderId) {
		
		String Qstr="SELECT bookstore_order.order_status FROM bookstore_order order WHERE bookstore_order.order_id= :orderId";
   		TypedQuery<String> query=entityManager.createQuery(Qstr, String.class).setParameter("order_id",orderId);
   		
   		return	query.getSingleResult();
	}

	@Override
	public void updateAddBook(int orderId) {
		entityManager.find(OrderInformation.class, orderId);
		
		
	}
	
	public void addData(OrderInformation order) {
		entityManager.persist(order);
		entityManager.close();
	}
	
}

