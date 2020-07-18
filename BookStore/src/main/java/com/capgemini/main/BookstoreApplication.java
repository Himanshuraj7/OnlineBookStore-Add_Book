package com.capgemini.main;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.main.dao.AddBookDaoImpl;
import com.capgemini.main.entities.OrderInformation;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Autowired
	AddBookDaoImpl addBook;
	
	@Override
	public void run(String... args) throws Exception {
		OrderInformation orderInformation = new OrderInformation();
		
		orderInformation.setOrderId(1000);
		orderInformation.setCity("patna");
		orderInformation.setCountry("India");
		orderInformation.setOrderDate(LocalDate.now());
		orderInformation.setOrderStatus("shipped");
		orderInformation.setPaymentMethod("COD");
		orderInformation.setQuantity(10);
		orderInformation.setRecipientName("satyam");
		orderInformation.setRecipientPhoneNumber("1234567890");
		orderInformation.setShippingAddress("bihar");
		orderInformation.setStreetAddress("hello");
		orderInformation.setTotalPrice(100);
		orderInformation.setZipCode(843120);
		
		addBook.addData(orderInformation);
	}
	
	

}
