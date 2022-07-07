class IPLtester
{
	public static void main(String a[])
	{
		IPLDTO ipl = new IPLDTO();
		ipl.setType("T20 cricket league");
		ipl.setOvers("20 Overs");
		ipl.setSponcer("TATA IPl");
		ipl.setParent("BCCI");
		ipl.setNoOfteams(10);
		
		System.out.println("IPL is a: "+ipl.getType());
		System.out.println("Max. Overs: "+ipl.getOvers());
		System.out.println("Sponcered By: "+ipl.getSponcer());
		System.out.println("Parent : "+ipl.getParent());
		System.out.println("No of Teams Participated: "+ipl.getNoOfTeams());
		
		

	}
}