class EngineerTester{

public static void main(String sk[])
 {
	 
	MeEngineer mech = new MeEngineer();
	 mech.problemSolving();
	 mech.getRecruit();
     mech.Designation="Design Engineer  ";
	 mech.skills="CATIA";
	 mech.expirience="2 years";
	 mech.salary=30000;
	 
	 System.out.println("Designation of :"+mech.Designation);
	 System.out.println("Skills Required  : "+mech.skills);
	 System.out.println("Experiaence Required: "+mech.expirience);
	 System.out.println("salary  : "+mech.salary);
	 System.out.println("========================");
	 
	 CivilEngineer civil = new CivilEngineer();
	 civil.problemSolving();
	 civil.getRecruit();
	 civil.Designation="Structure Engineer ";
	 civil.skills="STADPro";
	 civil.expirience="6 years";
	 civil.salary=25000;
	
	 System.out.println("Designation :"+civil.Designation);
	 System.out.println("Skills : "+civil.skills);
	 System.out.println("Experiaence: "+civil.expirience);
	 System.out.println("salry Expect : "+civil.salary);
	 System.out.println("========================");
	 
	 CsEngineer cs = new CsEngineer();
	 cs.problemSolving();
	 cs.getRecruit();
     cs.Designation="Flutter Developer";
	 cs.skills="JavaScript-SQL-Flutter";
	 cs.expirience="3 years";
	 cs.salary=80000;
	 
	 System.out.println("Designation of :"+cs.Designation);
	 System.out.println("Skills Required  : "+cs.skills);
	 System.out.println("Experiaence Required: "+cs.expirience);
	 System.out.println("salary  : "+cs.salary);
	  System.out.println("========================");
	 EcEngineer ec = new EcEngineer();
	 ec.problemSolving();
	 ec.getRecruit();
     ec.Designation="Communication and Network Analyst";
	 ec.skills="Network-VLSI";
	 ec.expirience="1 years";
	 ec.salary=45590;
	 
	 System.out.println("Designation of :"+ec.Designation);
	 System.out.println("Skills Required  : "+ec.skills);
	 System.out.println("Experiaence Required: "+ec.expirience);
	 System.out.println("salary  : "+ec.salary);
	  System.out.println("========================");
	  
	  AeroNauticalEngineer ane = new AeroNauticalEngineer();
	 ane.problemSolving();
	 ane.getRecruit();
     ane.Designation="AeroNautical Analyst";
	 ane.skills="HyperMesh-Ansys";
	 ane.expirience="1 years";
	 ane.salary=37999;
	 
	 System.out.println("Designation of :"+ane.Designation);
	 System.out.println("Skills Required  : "+ane.skills);
	 System.out.println("Experiaence Required: "+ane.expirience);
	 System.out.println("salary  : "+ane.salary);
	 
	 
	 
 }
	


}