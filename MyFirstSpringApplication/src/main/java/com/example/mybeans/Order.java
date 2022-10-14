package com.example.mybeans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Order {
	
	@Min(3)
	public int id;
	
	@Size(min=5,max=20)
	@NotNull
	public String product;
	
	@Max(3)
	public int price;
	
	@NotNull
	public int date;
	
	@Min(5 )
	public int qty;

}
