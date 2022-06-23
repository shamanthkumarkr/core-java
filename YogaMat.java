class YogaMat{
String sportType;
int price;

public YogaMat()
 {
  this("Fitness",800);
  System.out.println("YogaMat object is created");
 }
public YogaMat(String sportType,int price)
   {  this.sportType=sportType;
	this.price=price;
	}

public static void main(String a[])
	{
	YogaMat yoga = new YogaMat();
	System.out.println(	" type of sport yogamat used " +yoga.sportType);
	System.out.println("price of the yogamat is " + yoga.price);
	}



}