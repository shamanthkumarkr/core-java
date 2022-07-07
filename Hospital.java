class Hospital
{
	//has many patients
	PatientDTO dtos[] = new PatientDTO[5];
	
	//instance variacle
		int index;
		
	//constructor
	public Hospital()
	{
		System.out.println("Hospital const is called");
	}

	//creatPatient1 method
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
		
		
		
		
		
		public void getPatientDetails()
		{
			System.out.println("Inside Patient Details");
			
			for(int i=0;i<dtos.length;i++)
			{
				System.out.println("Patient ID: "+dtos[i].getID()+" Name of the Patient: "+dtos[i].getName()+" Age of the Patient: "+dtos[i].getAge()+" Gender: "+dtos[i].getGender()+" Contact No. : "+dtos[i].getContactNo());
			}
		}
		
		
}