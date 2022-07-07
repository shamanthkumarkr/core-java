class ApartmentTester
{
	public static void main(String a[])
	{ 
		ApartmentDTO ap = new ApartmentDTO();
		ap.setID(123);
		ap.setName("KRS");
		ap.setOwner("Ramesh");
		
		System.out.println("Apartment ID: "+ap.getID());
		System.out.println("The name of the Apartment: "+ap.getName());
		System.out.println("Owner Name of the Apartment: "+ap.getOwner());
	
	
	}



}