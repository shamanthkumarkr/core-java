package com.xworkz.atmapp;



public class AtmMachine {
	
	public void check(int amount) throws AtmException
	{ System.out.println("check method started");
		if(amount >=50000 || amount%100!=0){
			throw new AtmException();
		}
		else {
			
			
			System.out.println("take your cash ");
		}
		System.out.println("check method started");
	}
 
	 
	 


}
