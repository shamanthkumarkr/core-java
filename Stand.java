class Stand{
	
//instance variable
double price;
//access modifier className() or constructor
public Stand()
{
System.out.println("This is the wooden Stand ");
}

public static void main(String sk[])
{ 
//className refVer = new constructor();
 Stand std = new Stand();
 std.price = 2000.00;
 System.out.println(" and The price of the Stand is "+std.price);
}
} 