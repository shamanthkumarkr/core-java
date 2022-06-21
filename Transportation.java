class Transportation
{
	int transportID ;
	String name ;
	String modeOftransport;
	int noOfpassangers;
	long contactNo;
	
	public Transportation(int tID,String Name,String modeOfT,int nOp, long cNo )
	{
		System.out.println ("Transportation object is created");
	transportID = tID;
	name = Name;
	modeOftransport = modeOfT;
	noOfpassangers=nOp;
	contactNo = cNo;
	}
	
	public static void main (String sk[])
	{
	Transportation travells = new Transportation(2625,"Drivezy","Road",4,5624868L);
	System.out.println("The transportID  is "+travells.transportID);
	System.out.println("The name of the company is "+travells.name);
	System.out.println("The mode of transportation is by"+travells.modeOftransport);
	System.out.println("The noOfpassangers sitting in the car"+ travells.noOfpassangers);
	System.out.println("The contactNo is "+ travells.contactNo);
	System.out.println("----------------------------------------");
	Transportation Airways = new Transportation(13254,"Indian Airways","Airways",100,91234567845L);
	System.out.println("The transportID  is "+Airways.transportID);
	System.out.println("The name of the company is "+Airways.name);
	System.out.println("The mode of transportation is by"+Airways.modeOftransport);
	System.out.println("The noOfpassangers sitting in the car"+ Airways.noOfpassangers);
	System.out.println("The contactNo is "+ Airways.contactNo);
	System.out.println("----------------------------------------");
	Transportation Railways = new Transportation (59987,"Indian railways","Rail",900,8546879512L);
	System.out.println("The transportID  is "+Railways.transportID);
	System.out.println("The name of the company is "+Railways.name);
	System.out.println("The mode of transportation is by"+Railways.modeOftransport);
	System.out.println("The noOfpassangers sitting in the car"+ Railways.noOfpassangers);
	System.out.println("The contactNo is "+ Railways.contactNo);
	System.out.println("----------------------------------------");
	Transportation seaways = new Transportation(45654,"KochiDock","SEAWAYS",10000,454447851L);
	System.out.println("The transportID  is "+seaways.transportID);
	System.out.println("The name of the company is "+seaways.name);
	System.out.println("The mode of transportation is by"+seaways.modeOftransport);
	System.out.println("The noOfpassangers sitting in the car"+ seaways.noOfpassangers);
	System.out.println("The contactNo is "+ seaways.contactNo);
	
	}

}