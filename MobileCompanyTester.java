class MobileCompanyTester{

	public static void main(String a[])
	{
	 Sony mobile = new Sony();
	 
	  mobile.founded=1946;
      mobile.founder="Akio Morita" ;
      mobile.hQ= "Tokyo";
	  mobile.noOfEmployees=1090000L;
	  mobile.companyDetails();

		System.out.println("Founded: "+mobile.founded);
		System.out.println("Founder: "+mobile.founder);
		System.out.println("Head Quarters : "+mobile.hQ);
		System.out.println("No of Employees : "+mobile.noOfEmployees);
	
	
	}



}