package com.capgemini.main.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderInformationOrderBooks {

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "order_Id", nullable = false)
	private int BookId;
	
	private int Quantity;
	private float SubTotal;
	
	
}
