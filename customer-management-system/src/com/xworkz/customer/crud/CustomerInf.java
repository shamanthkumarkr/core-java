package com.xworkz.customer.crud;

import com.xworkz.customer.dto.OrderDTO;

public interface CustomerInf {
	
	
	
	 public boolean creatOrder(OrderDTO order);
	 public void getOrdersDetails();
	 public boolean updateAddressByName(String name,String address);
	 public boolean deleteOrderDetailsByName(String Name);

	

}
