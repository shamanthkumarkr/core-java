package com.xworkz.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data  //toString(),hashCode(),equal(object)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
	
		
		 
		 private int id;
		 private String name;
		 private String address;
		 private String location;
		 private long contactNo;
		 
	
		 
	}


