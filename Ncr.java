class Ncr{

	 public static void main(String a[])
	 {
	//invoking fact method	ncr = n!/r!(n-r)! 
		 
	 int ncr = fact(9)/(fact(3)*fact (9-3));
	 System.out.println(ncr);
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