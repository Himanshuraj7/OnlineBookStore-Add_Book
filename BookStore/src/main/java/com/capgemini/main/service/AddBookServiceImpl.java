package com.capgemini.main.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.dao.AddBookDao;

@Transactional
@Service
public class AddBookServiceImpl implements AddBookService {
	
	@Autowired
	AddBookDao addBookDao;
	
	@Override
	public boolean findOrderById(int orderId) {
		return addBookDao.findOrder(orderId);	
	}
	
	@Override
	public String findOrderStatus(int orderId) {
		return addBookDao.findOrderStatus(orderId);	
	}
	
	@Override
	public String updateAddBook(int orderId) {
			
			if(findOrderStatus(orderId).equalsIgnoreCase("Cancelled")) {
				return "Order is already Cancelled, can not update order";
			}
			
			if(findOrderStatus(orderId).equalsIgnoreCase("Shipped")) {
				return "Order has already shipped, can not update order";
			}
			
			if(findOrderStatus(orderId).equalsIgnoreCase("Delivered")) {
				return "Order has already been delivered, can not update order";
			}
			
			if(findOrderStatus(orderId).equalsIgnoreCase("Processing")){
				addBookDao.updateAddBook(orderId);
				return "Order updated";
			}
			
			return null;
	}
	
}
