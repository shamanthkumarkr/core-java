class Garden
{
	String name ;
	String location;
	String type;
	int area;
	int noOfvisitors;
	
	public Garden(String name,String location,String type,int area,int noOfvisitors)
	{
       System.out.println("The Garden object is created");
		this.name=name;
		this.location=location;
		this.type=type;
		this.area=area;
		this.noOfvisitors=noOfvisitors;
	}
	public static void main(String sk[])
	{
	Garden park = new Garden("Cubbon park","KR circle","Tropical Garden",120,5000);
	System.out.println("The name of the garden is "+park.name);
	System.out.println("garden is located at "+park.location);
	System.out.println("Type of Garden "+park.type);
	System.out.println("Ares of covering in Hectares "+park.area);
	System.out.println("No of visitors per day "+park.noOfvisitors);
	System.out.println("==========================================");
	
	Garden park1 = new Garden("LalBag park","JC road","Botonical Garden",175,12000);
	System.out.println("The name of the garden is "+park1.name);
	System.out.println("garden is located at "+park1.location);
	System.out.println("Type of Garden "+park1.type);
	System.out.println("Ares of covering in Hectares "+park1.area);
	System.out.println("No of visitors per day "+park1.noOfvisitors);
	System.out.println("==========================================");
	
	Garden park2 = new Garden("Jinke park","Chamarajpete","Herbal Garden",55,3500);
	System.out.println("The name of the garden is "+park2.name);
	System.out.println("garden is located at "+park2.location);
	System.out.println("Type of Garden "+park2.type);
	System.out.println("Ares of covering in Hectares "+park2.area);
	System.out.println("No of visitors per day "+park2.noOfvisitors);
	System.out.println("==========================================");
	
	}


}