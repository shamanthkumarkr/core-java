class Vaporizer{

 String brandName;
 String type;
 int price ;
 
 public Vaporizer(String brandName,String type,int price)
  {
	System.out.println("The Vaporizer object is created");
	this.brandName=brandName;
	this.type=type;
	this.price=price;
   }
   
   public Vaporizer()
   {this("savani","Facial&Hair",4500);}
   
   public static void main (String a[])
   { Vaporizer vap = new Vaporizer();
   System.out.println("The brandName is : "+vap.brandName);
   System.out.println("The type of the Vaporizer is : "+vap.type);
   System.out.println("The price of the Vaporizer is : "+vap.price);
   }
 



}