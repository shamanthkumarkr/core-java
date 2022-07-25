package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {
	boolean creatPatient(PatientDTO dto);
	void getPatientDetails();
	boolean updatePatientAddressById(int id, String address);
	boolean updatePatientContactNoByName(String name,long contactNo );
	boolean deletePatientDetailsByName(String name);
	String getPatientNameByID(int id);
}
 