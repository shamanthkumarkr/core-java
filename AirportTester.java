class AirportTester
{
	public static void main(String a[])
	{
		Airport air = new Airport();
		air.setName("KempeGowda International Airport");
		air.setType("International Airport");
		air.setPassengers("16million");
		air.setLocation("Bangalore");
		
		System.out.println("Name : "+air.getName());
		System.out.println("Type: "+air.getType());
		System.out.println("Passengers in 2021to22: "+air.getPassengers());
		System.out.println("Location: "+air.getLocation());
	 
		
	
	
	}






}