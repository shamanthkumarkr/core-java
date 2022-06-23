class AirPurifier{

 String brandName;
 String type;
 int price ;
 
 public AirPurifier(String brandName,String type,int price)
  {
	System.out.println("The AirPurifier object is created");
	this.brandName=brandName;
	this.type=type;
	this.price=price;
   }
   
   public AirPurifier()
   {this("Blue Star","Room",25990);}
   
   public static void main (String a[])
   { AirPurifier AP = new AirPurifier();
   System.out.println("The brandName is : "+AP.brandName);
   System.out.println("The type of the AirPurifier is : "+AP.type);
   System.out.println("The price of the AirPurifier is : "+AP.price);
   }
 



}