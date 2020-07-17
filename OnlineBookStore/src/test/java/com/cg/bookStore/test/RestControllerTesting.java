//package com.cg.bookStore.test;
//
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.capgemini.main.controller.OrderInformationController;
//
//public class RestControllerTesting extends BookstoreApplicationTests {
//
//	
//
//
//	@Autowired
//	private WebApplicationContext webApplicationContext;
//
//	
//	@InjectMocks
//	private AddBook orderInformationController;
//	
//	private MockMvc mockMvc;
//	
//	
//	@Before
//	public void setup() throws Exception {
//	//	mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//		mockMvc = MockMvcBuilders.standaloneSetup(orderInformationController).build();
//	}
//	
//	@Test
//	public void demoTest() throws Exception
//	{
//		mockMvc.perform(get("/hello"))
//		.andExpect(status().isOk())
//		.andExpect(content().string("Hello"));
//	
//	
//	}
//	
//	/*
//	@Test
//	public void cancleOrder1() throws Exception
//	{
//		mockMvc.perform(get("/CancleOrder/orderID"))
//		.andExpect(status().isOk())
//		.andExpect(content().string("")); //order deleted and status change to cancle
//	}
//	
//	@Test
//	public void cancleOrder2() throws Exception
//	{
//		mockMvc.perform(get("/CancleOrder/orderID"))
//		.andExpect(status().isOk())
//		.andExpect(content().string(""));//order not found orderId is incorrect.
//	}
//	
//	@Test
//	public void cancleOrder2() throws Exception
//	{
//		mockMvc.perform(get("/CancleOrder/orderID"))
//		.andExpect(status().isOk())
//		.andExpect(content().string(""));//order is already deleted.
//	}
//	*/
//}
//
