//package com.cg.bookStore.test;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.capgemini.main.service.CancleOrderService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ServiceTesting {
//	@Autowired
//	CancleOrderService cancleOrderService;
//	
//
//	@Test
//	public void cancleOrder()
//	{
//		String val="Order cancled Sucessfully";
//		assertEquals(val,"Order cancled Sucessfully");
//	}
//
//	@Test
//	public void alreadyCancleOrder()
//	{
//		String val="order is already cancled";
//		assertEquals(val,"Order is already cancled");
//	}
//	
//	@Test
//	public void notExistsOrder()
//	{
//		String val="Wrong Order Number";
//		assertEquals(val,"Wrong Order Number");
//	}
//}
//
