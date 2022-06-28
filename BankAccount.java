class BankAccount{
 double amount;
 String branch;
 double ta;
double deposit;
double withdraw;


 public double deposit(double amt){
System.out.println("invoking the deposit()");
System.out.println("Amount to be deposit"+amt);
System.out.println("Amount before deposite"+amount);
amount = amount + amt;
System.out.println("Amount after deposite"+amount);
System.out.println("end of deposit()");
 return amount;
}

 public double withdraw(double wd)
 {
System.out.println("invoking the withdraw()");
System.out.println("Amount to be withdraw"+wd);
System.out.println("Amount before withdraw"+amount);
amount = amount - wd;
System.out.println("Amount after withdraw"+amount);
System.out.println("end of withdraw()");
	return amount;
}

 public double getTotalAmount()
 {
//ta = amount;	
System.out.println("getTotalAmount"+amount);
	return amount;

}						

			//class type parameter
	public void transfer(double amount,BankAccount other )
	{
		if(amount<=amount)
		withdraw(amount);
		other.deposit(amount);
		}


}
