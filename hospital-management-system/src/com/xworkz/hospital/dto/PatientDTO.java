package com.xworkz.hospital.dto;

import com.xworkz.hospital.constant.Gender;

public class PatientDTO {

	private int id;
	private String name;
	private long contactNo;
	private String Address;
	private Gender gender;

	public PatientDTO() 
	{
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", Address=" + Address + ", gender="
				+ gender + "]";
	}

	public String getAge() {
		// TODO Auto-generated method stub
		return null;
	}

}
