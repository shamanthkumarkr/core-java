class Addition
{
public static void main(String a[])
{

int product = add(55,56);
 System.out.println(product);

int product1 = add(64,45,53);
System.out.println(product1);

int product2 = add(89,90);
System.out.println(product2);

int product3 = add(112,113);
System.out.println(product3);

}
	public static int add(int a,int b)
	{
	return a+b;
	}
	
	public static int add(int a, int b , int c)
	{
	return a+b+c;
	}
}