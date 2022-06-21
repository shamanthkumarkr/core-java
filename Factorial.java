class Factorial{

	 public static void main(String a[])
	 {
	//invoking fact method	 
		 
	 int npr = fact(8)/fact (5-3);
	 System.out.println(npr);
	 }
	
	public static int fact(int factnumber)
	{
		System.out.println("invokied fact()");
		System.out.println("Parameter value " + factnumber);
	 int f=1;
	 for(int i=1; i<= factnumber ; i++)
	 { f= f*i;}
	System.out.println("end of the fact()");
	return f;
	}
		
}