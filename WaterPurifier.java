class WaterPurifier{

String brandName;
int price;
int capacity;

public WaterPurifier(String brandName,int price,int capacity)
{
System.out.println("The WaterPurifier object is created");
this.brandName=brandName;
this.price=price;
this.capacity=capacity;
}

public WaterPurifier()
{this("Kent",25000,10);}

public static void main(String a[])
	{
		WaterPurifier purifier = new WaterPurifier();
		
		System.out.println("The Brand Name of the Purifier "+purifier.brandName + "The price of the purifier is "+purifier.price + "The capacity in liters "+purifier.capacity);
	
	}



}