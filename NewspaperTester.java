class NewspaperTester
{
	public static void main(String a[])
	{
		Newspaper np = new Newspaper();
		 np.setName("The Hindhu");
		 np.setEstd(1885);
		 np.setType("National paper");
		 np.setPrice(6);
		 
		 System.out.println("Name: "+np.getName());
		 System.out.println("Established year: "+np.getEstd());
		 System.out.println("Type : "+np.getType());
		 System.out.println("price: "+np.getPrice());
		 
		 np.readNewspaper();
	
	
	}


}