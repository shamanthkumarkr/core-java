package com.xworkz.hospital.crud.impl;
import java.util.Arrays;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalImpl implements Hospital {

	PatientDTO dtos[] ;

	//instance variable
	int index;

	//parameter constructor
	public HospitalImpl(int size)
	{
		dtos = new PatientDTO[size];
		System.out.println("Hospital constructor is called");
	}
	//CREAT
	//creatPatient method
	@Override
	public boolean creatPatient(PatientDTO dto)
	{
		System.out.println("Inside patient created");
		boolean isAdded = false;
		if(dto != null && dto.getName() !=null)
		{
			this.dtos[index++] = dto;
			isAdded=true;
		}
		else{ System.out.println("Cannot add patient...please fill");}
		return isAdded;
	}




	//READ
	@Override
	public void getPatientDetails()
	{
		System.out.println("Inside Patient Details");

		for(int i=0;i<dtos.length;i++)
		{
			System.out.println(dtos[i]);
		}
	}
	//UPDATE
	@Override
	public boolean updatePatientAddressById(int id, String address)
	{
		System.out.println("inside update patient address");
		boolean updateAddress=false;
		for(int i=0; i<dtos.length;i++)
		{
			if(dtos[i].getId()==id)
			{
				dtos[i].setAddress(address);
				updateAddress = true;
			}
			else{System.out.println("please update existing patient address ");}
		}
		return updateAddress;
	}
	@Override
	public boolean updatePatientContactNoByName(String name,long contactNo )
	{
		System.out.println("inside update patient contact Number");
		boolean updateContactNo=false;
		for(int i=0; i<dtos.length; i++)
		{
			if(dtos[i].getName()==name)
			{
				dtos[i].setContactNo(contactNo);
				updateContactNo=true;
			}
			else{System.out.println("please update existing contactNo");}

		}
		return updateContactNo;
	}
	//DELETE
	@Override
	public boolean deletePatientDetailsByName(String name)
	{

		boolean patientDeleted=false;
		System.out.println("inside Delete patient Details by name");
		int newIndex,oldIndex; //multiple array initialization
		for(newIndex=0,oldIndex=0; oldIndex<dtos.length;oldIndex++)
		{
			if(!dtos[oldIndex].getName().equals(name))
			{ dtos[newIndex++]=dtos[oldIndex];

			patientDeleted=true;
			}
			else{System.out.println("The patient deatils is not available");} 
		}
		dtos=Arrays.copyOf(dtos,newIndex);
		return patientDeleted;	 
	}

	@Override
	public String getPatientNameByID(int id)
	{
		String name=null;
		System.out.println("inside get patient Name by ID");
		for(int i=0; i<dtos.length;i++)
		{
			if(dtos[i].getId()==id)
			{
				//System.out.println(dtos[i]);
				name=dtos[i].getName();
				System.out.println(name);
			}

		}
		return name;
	}



}


