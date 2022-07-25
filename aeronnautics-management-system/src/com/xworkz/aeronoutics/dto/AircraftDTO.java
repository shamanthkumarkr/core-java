package com.xworkz.aeronoutics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

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
	
	

}
