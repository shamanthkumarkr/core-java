class BankTester{

public static void main(String a[]){
	
	
	Bank bank1 = new Kotak();
	System.out.println("The Rate of interest in Kotak Bank is : ");
	bank1.getInterest(5.5);
	

	Bank bank2 = new Icici();
   	System.out.println("The Rate of interest in Icici Bank is : "); 
	bank2.getInterest(6);
	
	Bank bank3 = new Yes();
   	System.out.println("The Rate of interest in Yes Bank is : "); 
	bank3.getInterest(6.2);
	
	Bank bank4 = new Karnataka();
   	System.out.println("The Rate of interest in Karanataka Bank is : "); 
	bank4.getInterest(5);
	
	Bank bank5 = new Canara();
	System.out.println("The Rate of interest in Canara Bank is :");
	bank5.getInterest(4);
	
	Bank bank6 = new Vijaya();
	System.out.println("The Rate of interest in Vijaya Bank is :");
	bank6.getInterest(4.4);
	
	Bank bank7 = new HDFC();
	System.out.println("The Rate of interest in HDFC Bank is :");
	bank7.getInterest(8);
	
	Bank bank8 = new SBI();
	System.out.println("The Rate of interest in SBI Bank is :");
	bank8.getInterest(4.3);
	
}
}