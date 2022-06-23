class PulseOxymeter{
String brandName;
String type;
int price ;

public PulseOxymeter(String brandName,String type,int price)
	{ System.out.println("The Pulse Oxymeter object is created ");
 this.brandName=brandName;
 this.type=type;
 this.price=price;
	}
	
	public PulseOxymeter()
	{this("Dr.Morpen","FingerTip Oxymeter",1500);}
	
	public static void main(String a[])
	{
		PulseOxymeter oximeter = new PulseOxymeter();
		System.out.println("The Brand Name is: "+oximeter.brandName);
		System.out.println("The type of Oxymeter: "+oximeter.type);
		System.out.println("The price of the Oxymeter is: "+oximeter.price);
	}




}