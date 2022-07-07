class StadiumTester
{
	public static void main(String a[])
	{
		StadiumDTO grd = new StadiumDTO();
		grd.setName("ChinnaSwamy Stadium");
		grd.setType("Cricket Stadium");
		grd.setCapacity(35000);
		grd.setEstd(1969);
		grd.setLocation("Bangalore");
		
		System.out.println(" \nName of the Stadium: "+grd.getName()+" \nType: "+grd.getType()+" \ncapacity "+grd.getCapacity()+" \nEstablished: "+grd.getEstd()+" \nLocation:"+grd.getLocation());
		
		
	
	}





}