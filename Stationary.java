class Stationary
{
	String name;
	int openTimings;
	int closeTimings;
	long gstID;
	String location;
	String type;
	
	public static void main (String sk[])
	{
	Stationary shop1 = new Stationary();
	shop1.name = "Shopersshopi";
	shop1.openTimings = 10;
	shop1.closeTimings= 8;
	shop1.gstID=45267458766l;
	shop1.location="Jayanagar";
	shop1.type="Gift";
	
	System.out.println("Name of the Shop "+shop1.name);
	System.out.println("shop opening timings "+shop1.openTimings);
	System.out.println("shop closing timings "+shop1.closeTimings);
	System.out.println(" shop GST ID number is "+ shop1.gstID);
	System.out.println("THe location of the shop is"+ shop1.location);
	System.out.println("the type of Stationary is"+ shop1.type);
	
	Stationary shop2 = new Stationary();
	shop2.name = "ShopAtoZ";
	shop2.openTimings = 10;
	shop2.closeTimings= 9;
	shop2.gstID=452674584586l;
	shop2.location="Banashankari";
	shop2.type="AtoZ";
	
	System.out.println("Name of the Shop "+shop2.name);
	System.out.println("shop opening timings "+shop2.openTimings);
	System.out.println("shop closing timings "+shop2.closeTimings);
	System.out.println(" shop GST ID number is "+ shop2.gstID);
	System.out.println("THe location of the shop is"+ shop2.location);
	System.out.println("the type of Stationary is"+ shop2.type);
	System.out.println("========");
	
	Stationary shop3 = new Stationary();
	shop3.name = "Stop&Shop";
	shop3.openTimings = 10;
	shop3.closeTimings= 11;
	shop3.gstID=452674587458l;
	shop3.location="Hampinagar";
	shop3.type="Cloth";
	System.out.println("========");
	
	System.out.println("Name of the Shop "+shop3.name);
	System.out.println("shop opening timings "+shop3.openTimings);
	System.out.println("shop closing timings "+shop3.closeTimings);
	System.out.println(" shop GST ID number is "+ shop3.gstID);
	System.out.println("THe location of the shop is"+ shop3.location);
	System.out.println("the type of Stationary is"+ shop3.type);
	
	
	
	
	}

}