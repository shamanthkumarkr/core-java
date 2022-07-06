class CarryBagTester
{
	public static void main(String a[])
	{
		CarryBag bag = new CarryBag();
		//setting value in the name member and Price member
		bag.setName("Nilkamal's bag");
		bag.setPrice(10);
		
		//getting value of the name member and price memeber
		System.out.println(bag.getName()+ " Price is "+bag.getPrice());
	
		bag.holdThings();
	}




}