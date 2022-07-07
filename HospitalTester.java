class HospitalTester
{
	public static void main(String a[])
	{
		Hospital hos = new Hospital();
		
		PatientDTO dto = new PatientDTO();
		
		dto.setID(101);
		dto.setName("Rakesh");
		dto.setAge("25 years");
		dto.setGender(Gender.MALE);
		dto.setContactNo(8145795659L);
		
		
		PatientDTO dto1 = new PatientDTO();
		
		dto1.setID(102);
		dto1.setName("Kulli");
		dto1.setAge("29 years");
		dto1.setGender(Gender.FEMALE);
		dto1.setContactNo(9145795659L);
		
		PatientDTO dto2 = new PatientDTO();
		
		dto2.setID(103);
		dto2.setName("Kavita");
		dto2.setAge("26 years");
		dto2.setGender(Gender.FEMALE);
		dto2.setContactNo(96025795659L);
		
		
		PatientDTO dto3 = new PatientDTO();
		
		dto3.setID(104);
		dto3.setName("Sharath");
		dto3.setAge("35 years");
		dto3.setGender(Gender.MALE);
		dto3.setContactNo(7855795659L);
		
		PatientDTO dto4 = new PatientDTO();
		
		dto4.setID(105);
		dto4.setName("Pallavi");
		dto4.setAge("23 years");
		dto4.setGender(Gender.FEMALE);
		dto4.setContactNo(8955795659L);
		
		
		hos.creatPatient(dto);
		hos.creatPatient(dto1);
		hos.creatPatient(dto2);
		hos.creatPatient(dto3);
		hos.creatPatient(dto4);
		
		hos.getPatientDetails();
	}
	



}