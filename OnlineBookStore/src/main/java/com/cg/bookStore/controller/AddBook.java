package com.cg.bookStore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.bookStore.service.AddBookService;

@RestController
public class AddBook {	

	@Autowired
	private AddBookService addBookService;
	
	@PostMapping("/updateAddBook/{orderId}")
	public ResponseEntity<String> update(@PathVariable int orderId)  {
		String result="Order Id Not Found";
		
		if(addBookService.findOrderById(orderId)) {
			result=addBookService.updateAddBook(orderId);
			return new ResponseEntity<String>(result,HttpStatus.OK);
			 
		}
		else
			return new ResponseEntity<String>(result,HttpStatus.OK);
		
		
	}
}


