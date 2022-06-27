class BankTester{

	public static void main (String a[])
	{
		SBI bank = new SBI();
		bank.type="Financial Institution";
	    bank.noOfEmployees=7000000L;
	    bank.hQ="Mumbai";
	    bank.noOfBranches=25000;
		Bank.transaction();
	
	System.out.println("SBI is a : "+bank.type);
	System.out.println("No of Employees : "+bank.noOfEmployees);
	System.out.println("Head Quarters: "+bank.hQ);
	System.out.println("No of Branches : "+bank.noOfBranches);
	
	}




}