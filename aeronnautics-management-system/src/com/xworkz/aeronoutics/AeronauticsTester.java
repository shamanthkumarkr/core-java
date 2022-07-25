package com.xworkz.aeronoutics;

import java.util.Scanner;

import com.xworkz.aeronoutics.dto.AircraftDTO;

public class AeronauticsTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		AeroSpace aero = new AeroSpace(size);
		System.out.println("Enter the engine role");
		String role=sc.next();
		System.out.println("Enter the Range of the Aircraft");
		String range=sc.next();
		System.out.println("Enter the Engine type: ");
		String engineType=sc.next();
		System.out.println("enter the Speed of the Aircraft:");
		int speed=sc.nextInt();
		System.out.println("Enter the Manufacturing Company: ");
		String manufacturer=sc.next();
		System.out.println("Wiegt: ");
		String Wieght=sc.next();
		System.out.println("Length: ");
		String length=sc.next();
		System.out.println("No of Built");
		int noOfBuilt=sc.nextInt();
		System.out.println("Users: ");
		String users=sc.next();
		System.out.println("Origin Country: ");
		String origin=sc.next();
		AircraftDTO jet = new AircraftDTO();
		
		jet.setRole(role);
		jet.setRange(range);
		jet.setEngineType(engineType);
		jet.setSpeed(speed);
		jet.setManufacturer(manufacturer);
		jet.setWieght(Wieght);
		jet.setLength(length);
		jet.setNoOfBuilt(noOfBuilt);
		jet.setUsers(users);
		jet.setOrigin(origin);
		
		
		System.out.println(jet);
		
		
		aero.getVariants("rafel marl-II");
		aero.getSpecifications();
		aero.getDesign();
		aero.getDevelopment();
		aero.getAircraftDetails();
		System.out.println("enter Existing Type");
		String existingType =sc.next();
		System.out.println("Enter the Role to br Updated");
		String updateRole=sc.next();
		aero.updateAircraftRoleByEngineType(engineType,role);
		
		System.out.println(aero);
		sc.close();
	}

}
