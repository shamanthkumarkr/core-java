package com.xworkz.customer.dto;

public class OrderDTO {
	
		
		 
		 private int id;
		 private String name;
		 private String address;
		 private String location;
		 private long contactNo;
		 
		 public OrderDTO(){}

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

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public long getContactNo() {
			return contactNo;
		}

		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}

		@Override
		public String toString() {
			return "OrderDTO [id=" + id + ", name=" + name + ", address=" + address + ", location=" + location
					+ ", contactNo=" + contactNo + "]";
		}
		
		
		 
	}


