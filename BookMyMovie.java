class BookMyMovie
{
	String movies[] = {"om","jogi","yajamana","A","H2O","gaja","Dangala","Appu"};
	static int ticketPrice =200;
	int noOfTickets ;
	String theatreName ;
	String movieName ;
	int totalNoOfTickets ;
	int totalOfTicketPrice;
	
	String snacks[] ={"chips","kurkure","popcorn","gobi","CoolDrinks","Sweetcorn"};
	static int snackPrice = 150;
	String snackName;
	int quantity ;
	int seatNo ;
	int totalNoOfSnacks ;
	int toatalSnacksPrice;
	
	public BookMyMovie(String theatreName,int noOfTickets,String movieName,String snackName,int quantity,int seatNo)
	{
		System.out.println("BookMyMovie object is created");
	  this.theatreName = theatreName;
	  this.noOfTickets = noOfTickets;
	  this.movieName = movieName;
	   
	  this.snackName = snackName;
	  this.quantity = quantity;
	  this.seatNo = seatNo;
	}
	 
	public int showTime(int noOfTickets,String bookedBy,String movieName)
	{
	int totalOfTicketPrice =0;
		System.out.println("inside showTime()...");
		System.out.println("Arg 1 : No of tickets "+noOfTickets);
		System.out.println("Arg 2 : Booked by "+bookedBy);
		System.out.println("Arg 3 : Movie Name "+ movieName);
		
		for(int i=0; i<movies.length ; i++)
		{
		if(movieName == movies[i])
		{
		System.out.println("Movie name matched") ;
		
		if(noOfTickets<totalNoOfTickets)
		{
		totalOfTicketPrice=noOfTickets * ticketPrice;
		totalNoOfTickets=totalNoOfTickets - noOfTickets;
		System.out.println("For Movie : "+movieName + "No.of tickets are that are remaining "+totalNoOfTickets +"Total price is " +totalOfTicketPrice );
		}
		else {System.out.println("ishtu tickets illa....");}
		}
	else {System.out.println("movie not Avialable");}
   		}
return totalOfTicketPrice;
	}
	public int buySnacks(String snackName , int quantity , int bookedSeatNo)
	{
		
		int totalSnackPrice = 0;
		 System.out.println("Arg 1 : Name of the Snack "+snackName);
		 System.out.println("Arg 2 : Quantity of Snack "+quantity);
		 System.out.println("Arg 3 : booked By seat No. "+bookedSeatNo);
		 
		 for(int z=0; z<snacks.length ; z++)
		 {
			 if(snackName==snacks[z])
			 {
			 System.out.println("The Snack Name is Matched");
			 
			 if(quantity<totalNoOfSnacks)
			 { totalSnackPrice = quantity * snackPrice;
				totalNoOfSnacks=totalNoOfSnacks - quantity;
		       System.out.println(" For snacks : "+ quantity + " snacks remaining "+ totalNoOfSnacks +" total price is " + totalSnackPrice );
		     }   
		 else {System.out.println("kelavu snacks ella kaali agidave...");}
		 }
		 else {System.out.println("snack is not Available");}
	}
	
		return totalSnackPrice;
	}
	
	
}