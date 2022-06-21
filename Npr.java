class Npr{
public static void main(String a[])
{
	// npr = n!/(n-r)!
	
     int npr = fact(8)/fact (5-3);
	 System.out.println(npr);
	 
}
public static int fact(int factNumber)
{
        System.out.println("invokied fact()");
		System.out.println("Parameter value " + factNumber);
		
		int f=1;
		for(int i=1; i<factNumber ; i++)
		{f= f*i;}
	System.out.println("end of the fact()");
	return f;
}




}