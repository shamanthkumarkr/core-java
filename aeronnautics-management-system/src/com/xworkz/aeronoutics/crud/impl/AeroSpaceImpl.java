package com.xworkz.aeronoutics.crud.impl;

import com.xworkz.aeronoutics.dto.AircraftDTO;

public class AeroSpaceImpl {
	private AircraftDTO[] dtos;
	public AeroSpaceImpl(int size, AircraftDTO[] dtos)
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
			int index = 0;
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

}
