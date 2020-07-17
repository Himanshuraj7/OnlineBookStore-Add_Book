package com.cg.bookStore.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookStore.dao.AddBookDao;
import com.cg.bookStore.entities.OrderInformation;

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
	public void findOrderStatus(int orderId) {
		addBookDao.findOrder(orderId);
		
	}
	
	@Override
	public String updateAddBook(int orderId) {
	
		OrderInformation orderDetails=new OrderInformation();
			orderDetails=addBookDao.getOrderDetails(orderId);
			
			if(orderDetails.getOrderStatus().equals("Cancelled")) {
				return "Order is already Cancelled, can not update order";
			}
			
			if(!(orderDetails.getOrderStatus().equals("Processing"))) {
				return "Order has already shipped, can not update order";
			}
			
			if(orderDetails.getOrderStatus().equals("Processing")){
				addBookDao.updateAddBook(orderId);
				return "Order updated";
			}
			
			return null;
		
		 
	}

	
}
