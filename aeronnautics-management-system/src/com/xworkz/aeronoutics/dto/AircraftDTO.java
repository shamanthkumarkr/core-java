package com.xworkz.aeronoutics.dto;

public class AircraftDTO {
	
	private String role;
	private String range;
	private String engineType;
	private int speed;
	private String manufacturer;
	private String Wieght;
	private String length;
	private int noOfBuilt;
	private String users;
	private String origin;
	
	
	public AircraftDTO()
	{
		System.out.println("AirCraft comnstructor is created");
	}
	

	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getRange() {
		return range;
	}


	public void setRange(String range) {
		this.range = range;
	}


	public String getEngineType() {
		return engineType;
	}


	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getWieght() {
		return Wieght;
	}


	public void setWieght(String wieght) {
		Wieght = wieght;
	}


	public String getLength() {
		return length;
	}


	public void setLength(String length) {
		this.length = length;
	}


	public int getNoOfBuilt() {
		return noOfBuilt;
	}


	public void setNoOfBuilt(int noOfBuilt) {
		this.noOfBuilt = noOfBuilt;
	}


	public String getUsers() {
		return users;
	}


	public void setUsers(String users) {
		this.users = users;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}







	@Override
	public String toString() {
		return "AircraftDTO [role=" + role + ", range=" + range + ", engineType=" + engineType + ", speed=" + speed
				+ ", manufacturer=" + manufacturer + ", Wieght=" + Wieght + ", length=" + length + ", noOfBuilt="
				+ noOfBuilt + ", users=" + users + ", origin=" + origin + "]";
	}

	
	

}
