class AccountTester{


	public static void main(String sk[])
	{
		SavingsAccount sa = new SavingsAccount(0.3);
		sa.deposit(5000.00);
		sa.withdraw(500.00);
		double amount = sa.getTotalAmount();
		System.out.println("Balance of Existing account "+amount);
		sa.periodicInterest();
	
	SavingsAccount other = new SavingsAccount(0.3);
	sa.transfer(3000.00,other);
	
	sa.transfer(3000.00,other);
	double totalAmount = other.getTotalAmount ();
	System.out.println("Balance of other account "+totalAmount);
	
	CurrentAccount ca = new CurrentAccount(15, 2.2);
	ca.deposit(6000.00);
	ca.withdraw(3200.00);
	ca.deposit(7500.00);
	ca.withdraw(2500.00);
	ca.deposit(8500.00);
	ca.withdraw(3000.00);
	ca.deductionOfFee();
	ca.periodicInterest();
	ca.getTotalAmount();
	
	}
	

}
