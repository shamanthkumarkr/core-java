class Institution
{
	String name ;
	String location;
	long contactNo;
	int noOfStudents;
	
	public Institution(String name,String location,long contactNo,int noOfStudents)
	{
	 System.out.println("The Institution object is created");
	 
	 this.name=name;
	 this.location=location;
	 this.contactNo=contactNo;
	this.noOfStudents=noOfStudents;
	
	}
	
	public static void main(String sk[])
	{
	Institution centre = new Institution("Xworkz ODC","Rajaji nagar",845769125L,90);
	System.out.println("The Name of the institution is "+ centre.name);
	System.out.println("The location of the Institution is "+centre.location);
	System.out.println("contactNo is "+centre.contactNo);
	System.out.println("No of students present "+centre.noOfStudents);
	System.out.println("-------------------------------");
	
	Institution centre1 = new Institution("Universal School","RR nagar",845769445L,650);
	System.out.println("The Name of the institution is "+ centre1.name);
	System.out.println("The location of the Institution is "+centre1.location);
	System.out.println("contactNo is "+centre1.contactNo);
	System.out.println("No of students present "+centre1.noOfStudents);
	System.out.println("-------------------------------");
	
	Institution centre2 = new Institution("Nagarajuana college","Yalahanka",985769445L,2650);
	System.out.println("The Name of the institution is "+ centre2.name);
	System.out.println("The location of the Institution is "+centre2.location);
	System.out.println("contactNo is "+centre2.contactNo);
	System.out.println("No of students present "+centre2.noOfStudents);
	
	}

}