class Industry 
{
	String companyName ;
	String type ;
	int Founded ;
	String headQuarters;
	long revenue;
	int noOfEmployees;
	String owner;
	
	public Industry (String comName , String typ, int found , String HQ ,long rev,int noOfemp,String Owner)
	{
		System.out.println("Industry object is created");
		companyName = comName;
		type = typ;
		Founded=found; 
		headQuarters =HQ;
		revenue = rev;
		noOfEmployees = noOfemp;
		owner = Owner;
	}
	
	public static void main(String sk[])
	{
		
		Industry company1 = new Industry("BEL","Aerospace",1954,"Bengaluru",23000000000000L,120000,"Govt.of india and LIC");
		System.out.println("The company owned by "+ company1.owner);
		System.out.println("The company name is "+company1.companyName);
		System.out.println("type "+company1.type);
		System.out.println("year of Founded "+company1.Founded);
		System.out.println("HeadQuarters is situiated in "+company1.headQuarters);
		System.out.println("company anual Revenue is "+company1.revenue);
		System.out.println("No of employees in company "+ company1.noOfEmployees);
		System.out.println("--------------------------------------");
		
		
		Industry company2 = new Industry ("HAL","Defence & Aerospace",1940,"Bengaluru",5000000000000L,20000,"GOI");
		System.out.println("The company owned by "+ company2.owner);
		System.out.println("The company name is "+company2.companyName);
		System.out.println("type "+company2.type);
		System.out.println("year of Founded "+company2.Founded);
		System.out.println("HeadQuarters is situiated in "+company2.headQuarters);
		System.out.println("company anual Revenue is "+company2.revenue);
		System.out.println("No of employees in company "+ company2.noOfEmployees);
		System.out.println("--------------------------------------");
		
		Industry company3 = new Industry ("Infosys","SoftWare",1992,"Bengaluru",230000000000L,20000,"Infosys pvt limited");
		System.out.println("The company owned by "+ company3.owner);
		System.out.println("The company name is "+company3.companyName);
		System.out.println("type "+company3.type);
		System.out.println("year of Founded "+company3.Founded);
		System.out.println("HeadQuarters is situiated in "+company3.headQuarters);
		System.out.println("company anual Revenue is "+company3.revenue);
		System.out.println("No of employees in company "+ company3.noOfEmployees);
		System.out.println("--------------------------------------");
		
		
	}
	
}