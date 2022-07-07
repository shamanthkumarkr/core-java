public class IPLDTO
{
	private String type;
	private String overs;
	private String sponcer;
	private String parent;
	private int noOfTeams;
	
	public IPL(){}
	
	public String getType()
	{
	 return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getOvers()
	{
	 return overs;
	}
	public void setOvers(String overs)
	{
		this.overs=overs;
	}
	public String getSponcer()
	{
	 return sponcer;
	}
	public void setSponcer(String sponcer)
	{
		this.sponcer=sponcer;
	}
	public String getParent()
	{
	 return parent;
	}
	public void setParent(String parent)
	{
		this.parent=parent;
	}
	public int getNoOfTeams()
	{
		return noOfTeams;
	}
	public void setNoOfteams(int noOfTeams)
	{
		this.noOfTeams=noOfTeams;
	}
	
	public void T20League()
	{System.out.println("Play Bold");}

}