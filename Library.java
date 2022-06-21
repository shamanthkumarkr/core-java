class Library {

	String name;
	int id;
	static String location = "Bangaluru";
	String type;
	int noOfseats;
	
	public Library(String name,int id,String type,int noOfseats)
	{
	System.out.println("Library object is created ");
	
	this.name=name;
	this.id=id;
	this.type=type;
	this.noOfseats=noOfseats;
	}
	
	public static void main(String sk[])
	{
	 Library lib = new Library("Serenity",777,"private",120);
	 System.out.println("ID number "+ lib.id);
	 System.out.println("Name of the library "+lib.name);
	 System.out.println("Library type "+lib.type);
	 System.out.println("No of seats in library "+lib.noOfseats);
	 System.out.println("location of the library "+Library.location);
	 System.out.println("-------------------------------");
	 
	 Library lib2 = new Library("Visionary",888,"private",70);
	 System.out.println("ID number "+ lib2.id);
	 System.out.println("Name of the library "+lib2.name);
	 System.out.println("Library type "+lib2.type);
	 System.out.println("No of seats in library "+lib2.noOfseats);
	 System.out.println("location of the library "+Library.location);
	 System.out.println("-------------------------------");
	 
	 Library lib3 = new Library("Dr.Ranaganath",12,"public",70);
	 System.out.println("ID number "+ lib3.id);
	 System.out.println("Name of the library "+lib3.name);
	 System.out.println("Library type "+lib3.type);
	 System.out.println("No of seats in library "+lib3.noOfseats);
	 System.out.println("location of the library "+Library.location);
	 System.out.println("-------------------------------");
	 
	
	}

}