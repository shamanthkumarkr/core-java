class CurrentAccount extends BankAccount{
	static int count;
	static int freeTransaction =8;
double transactionCount;
double interest;
double interestRate;

public CurrentAccount(double interest,double interestRate){
	//super method() will be called by compiler
	this.interest=interest;
	this.interestRate=interestRate;
}


public double deposit(double amt){
System.out.println("invoking the deposit()");
System.out.println("Amount to be deposit"+amt);
System.out.println("Amount before deposite"+amount);
amount = amount + amt;
System.out.println("Amount after deposite"+amount);
System.out.println("end of deposit()");
count++;
 return amount;
}

 public double withdraw(double wd){
System.out.println("invoking the withdraw()");
System.out.println("Amount to be withdraw"+wd);
System.out.println("Amount before withdraw"+amount);
amount = amount - wd;
System.out.println("Amount after withdraw"+amount);
System.out.println("end of withdraw()");
count++;
	return amount;
}
public void deductionOfFee(){
	double transactionInterest=0;
	
	System.out.println("The deductionOfFee() started");
	System.out.println("The Total Number of count "+count);
	if(count > freeTransaction){
		 transactionInterest=interestRate*(count-freeTransaction);
	withdraw(transactionInterest);
   }
   

}
	
// calaculate periodicInterest
	public double periodicInterest(){
		double interest=getTotalAmount()*interestRate/100;
		deposit(interest);
  
	return interest;
}
}