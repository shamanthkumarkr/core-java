class InsuranceCompanyTester{
	
	public static void main(String a[])
	{
		LIC ins = new LIC();
		ins.industry="Life Insurance and Financial Services";
		ins.hQ="Mumbai";
	    ins.founded=1956;
	    ins.type="Statutory Corporation";
		ins.getInsurance();
		
		System.out.println("LIC is the : "+ins.industry);
		System.out.println("Head Quarters of LIC: "+ins.hQ);
		System.out.println("FOunded: "+ins.founded);
		System.out.println("Type : "+ins.type);
	
	}

}