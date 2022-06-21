
       //CONCEPT CONSTRUCTOR OVERLOADING 
class Showroom1
{
	//Instance variables
	
	static String name = "Puma";
	static int noOfBranches= 50;
	int showRoomID;
	String location ;
	long contactNo;
	static String brand;
	
	//parameterized constructor
	public Showroom1( int iD, String loc , long cNo,String br)
	{ System.out.println ("ShowRoom object is created");
	 showRoomID = iD;
	 location = loc;
	 contactNo = cNo;
	 brand=br;
	}
	 //main method ---- starting point
	 public static void main (String a[])
	 {
	 // Constructor are used to initiat instance variables of a class
	 Showroom1 show = new Showroom1(1,"commercial Street",1245635878L,"Zudio");
	 System.out.println("The name of the brand showRoom "+ Showroom1.name);
	 System.out.println("The no of branches in this city "+ Showroom1 .noOfBranches);
	 System.out.println("The showRoomID is "+show.showRoomID);
	 System.out.println("Location of the ShowRoom "+show.location);
	 System.out.println("show room contactNo"+ show.contactNo);
	  System.out.println("The brand is "+show.brand);
	 
	 Showroom1 show1 = new Showroom1(2, "jayanagar",456125378584L,"puma");
	 System.out.println("The name of the brand showRoom "+ Showroom1.name);
	 System.out.println("The no of branches in this city "+ Showroom1.noOfBranches);
	 System.out.println("The showRoomID is "+show1.showRoomID);
	 System.out.println("Location of the ShowRoom "+show1.location);
	 System.out.println("show room contactNo"+ show1.contactNo);
	 System.out.println("The brand is "+show.brand);
	 
	 }
	
}