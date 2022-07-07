class CarryBagTester
{
	public static void main(String a[])
	{
		CarryBagDTO bag = new CarryBagDTO();
		//setting value in the name member and Price member
		bag.setName("Nilkamal's bag");
		bag.setPrice(10);
		
		//getting value of the name member and price memeber
		System.out.println(bag.getName()+ " Price is "+bag.getPrice());
	
		bag.holdThings();
	}




}