package com.xworkz.aeronoutics.crud;

import com.xworkz.aeronoutics.dto.AircraftDTO;

public class AeroSpace {

	String design;
	String variant;
	int index;
	AircraftDTO dtos[];
	
	
	
	public AeroSpace() {
		System.out.println("The AeroSpace constructor is created ");
	}

	public AeroSpace(String design, String variant) {
		this();
		this.design = design;
		this.variant = variant;
	}
	
	
	public void getVariants(String variants) 
	{

		System.out.println("there are 2 variants");
		
	}
	public void getVariants(String var1,String var2){
		System.out.println("name of the variants");
	}
	public void getDesign()
	{System.out.println("A full aspect Stealth aircraft technology");}
	public void getSpecifications()
	{System.out.println("general Specifications are...");}
	public void getDevelopment()
	{System.out.println("Developed by Dasault Aeviation");}
	
	
	

}
