class  HistoricalPlaces
{
 String name;
 int estd;
 String style;
 String location;
 
 public HistoricalPlaces(String name,int estd,String style,String location)
 {
  System.out.println("The HistoricalPlaces object is created");
  this.name=name;
  this.estd=estd;
  this.style=style;
  this.location=location;
  
 }
	public static void main (String sk[])
	{
	HistoricalPlaces place = new HistoricalPlaces("Amruteshwara temple",1215,"Hoysala architechture","Amrutapura");
	
	System.out.println("The name of the temple is "+place.name);
	System.out.println("Temple is established at "+place.estd);
	System.out.println("Temple Style of Architecture is "+place.style);
	System.out.println("location of the place at "+place.location);
	System.out.println("-------------------------------");
	
	HistoricalPlaces place1 = new HistoricalPlaces("Purijaganatha temple",1100,"Nagara architechture","Puri");
	
	System.out.println("The name of the temple is "+place1.name);
	System.out.println("Temple is established at "+place1.estd);
	System.out.println("Temple Style of Architecture is "+place1.style);
	System.out.println("location of the place at "+place1.location);
	System.out.println("-------------------------------");
	
	HistoricalPlaces place2 = new HistoricalPlaces("Taj Mahal",1632,"Indo-Sarsanic architechture","Agra");
	
	System.out.println("The name of the manuement is "+place2.name);
	System.out.println("manuement is Established at "+place2.estd);
	System.out.println(" Style of Architecture is "+place2.style);
	System.out.println("location of the place at "+place2.location);
	}
		
}