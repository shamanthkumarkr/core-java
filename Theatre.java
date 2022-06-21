class Theatre
{
    String name;
	String location;
	
	String[] runningMovies= new String[3];
	
	public Theatre()
	{System.out.println ("Theatre Object is created");}
	
	public static void main(String sk[])
	{
	
	Theatre theatre = new Theatre();
	theatre.name = "Gopalan";
	theatre.location="Mysore Road";
	System.out.println("Theatre name is "+ theatre.name);
	System.out.println("location of the Theatre is "+ theatre.location);
	
	theatre.runningMovies[0]= "vikram";
	theatre.runningMovies[1]="charlie 777";
	theatre.runningMovies[2]="jurasic world";
	theatre.getrunningMovies();
	
		
	Theatre theatre1 = new Theatre();
	theatre1.name = "veeresh";
	theatre1.location="Magadi Road";
	System.out.println("Theatre name is "+ theatre1.name);
	System.out.println("location of the Theatre is "+ theatre1.location);
	
	theatre1.runningMovies[0]= "charlee77";
	theatre1.runningMovies[1]="vikram";
	theatre1.runningMovies[2]="jurasic world";
	theatre1.getrunningMovies();
	
	}
	public void  getrunningMovies()
	{
	 for (int i=0; i<runningMovies.length; i++)
	 { System.out.println(runningMovies[i]);}
	}
	
	

}