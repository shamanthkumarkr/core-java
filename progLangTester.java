class progLangTester{

public static void main(String a[])
	{
		ProgLang pl = new ProgLang();
		pl.designedBy= "James Gosling";
		pl.appeared=1995;
		pl.developer="Oracale corporation";
		pl.version="Java SE 18";
		pl.toDefine();
		
		System.out.println("Designed by : "+pl.designedBy);
		System.out.println("First appeared : "+pl.appeared);
		System.out.println("Developer : "+pl.developer);
		System.out.println("Stable Release : "+pl.version);
	}

}