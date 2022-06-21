class Hospital
{
	int id;
	String name;
	String location;
	int noOfDoctors;
	String type;
	
	public static void main (String sk[])
	{
		Hospital hosp = new Hospital();
		hosp.id = 1245;
		hosp.name = "Sharavati";
		hosp.location = "Vijayanagar";
		hosp.noOfDoctors = 10;
		hosp.type = "General";
		
		System.out.println("Hospital id no is " + hosp.id);
		System.out.println("The Name of the Hospital is "+ hosp.name);
		System.out.println("Location of the Hospital is "+hosp.location);
		System.out.println("Number of Doctors in Hospital "+hosp.noOfDoctors);
		System.out.println("Type of Hospital "+ hosp.type);
		System.out.println("========");
		
		
		
		Hospital hosp1 = new Hospital();
		hosp1.id = 1354;
		hosp1.name = "Suguna";
		hosp1.location = "Rajajinagar";
		hosp1.noOfDoctors = 20;
		hosp1.type = "Multispeciality";
		
		System.out.println("Hospital id no is " + hosp1.id);
		System.out.println("The Name of the Hospital is "+ hosp1.name);
		System.out.println("Location of the Hospital is "+hosp1.location);
		System.out.println("Number of Doctors in Hospital "+hosp1.noOfDoctors);
		System.out.println("Type of Hospital "+ hosp1.type);
		System.out.println("========");
	
		
		Hospital hosp2 = new Hospital();
		hosp2.id = 1654;
		hosp2.name = "Kidwai";
		hosp2.location = "Koramangala";
		hosp2.noOfDoctors = 60;
		hosp2.type = "Kidney";
		
		System.out.println("Hospital id no is " + hosp2.id);
		System.out.println("The Name of the Hospital is "+ hosp2.name);
		System.out.println("Location of the Hospital is "+hosp2.location);
		System.out.println("Number of Doctors in Hospital "+hosp2.noOfDoctors);
		System.out.println("Type of Hospital "+ hosp2.type);
		
	
	}

}