package com.xworkz.atmapp;

import java.util.Scanner;

public class AtmTester {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);   
		System.out.println("Enter the Amount");
		int amount=sc.nextInt();
		
		
		AtmMachine atm = new AtmMachine();
		try {
			atm.check(amount);
			
		} catch (AtmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		
		System.out.println("Method method ended");
		
	}

}
