package com.xworkz.aeronoutics;

import com.xworkz.aeronoutics.dto.AircraftDTO;

public class AeroSpace {

	String design;
	String variant;
	int index;
	AircraftDTO dtos[];
	
	public AeroSpace(int size)
	{
		dtos= new AircraftDTO[size];
		System.out.println("The AeroSpace cons is created");
	}
	
	
	public boolean createAircraft(AircraftDTO dto)
	{
		System.out.println("Inside the Air craft creation method");
		boolean added=false;
		if(dto != null && dto.getManufacturer() != null)
		{
			this.dtos[index++]=dto;
					added=true;
		}
		else{System.out.println("Order is to be stored shortly..please wait");}
		return added;
	}
	public void getAircraftDetails()
	{
		System.out.println("Inside the get Air craft details");
		for(int i=0;i<dtos.length;i++)
		{System.out.println(dtos);}
	}
	public boolean updateAircraftRoleByEngineType(String engineType,String role)
	{
		System.out.println("inside Aircraft Role is updated by Engine Type");
		boolean updateRole=false;
		for(int i=0;i<dtos.length;i++)
		{
			if(dtos[i].getEngineType()==engineType)
			{
				dtos[i].setRole(role);
				updateRole=true;
			}
			else{System.out.println("Please Update role ");}
			
			}
		return updateRole;
	}
	
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
