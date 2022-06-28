class SavingsAccount extends BankAccount 
{

double interestRate;

public SavingsAccount(double interestRate)
{
	//super method() will be called by compiler
	this.interestRate=interestRate;
}



// calaculate periodicInterest
public double periodicInterest()
{ double interest = getTotalAmount()*interestRate/100;
	deposit(interest);
	return interest;


}

}