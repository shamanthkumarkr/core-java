class BookMyMoviesTester{
String movies[] = {"om","jogi","yajamana","A","H2O","gaja","Dangala","Appu"};
String snacks[] ={"chips","kurkure","popcorn","gobi","CoolDrinks","Sweetcorn"};
  
  
public static void main (String a[]){
BookMyMovie bookMyShow = new BookMyMovie("Prasanna",10,"om","kurkure",5,55);
bookMyShow.showTime(10,"Devi","om",200);
bookMyShow.buySnacks("kurkure",5,55);
System.out.println ("Theatre name is "+bookMyShow.theatreName);
System.out.println ("Snacks name name is "+bookMyShow.snackName);

BookMyMovie bookMyShow1 = new BookMyMovie("VEERESH",20,"gaja","popcorn",6,115);
bookMyShow1.showTime(20,"shamanth","Appu",300);
bookMyShow1.buySnacks("popcorn",6,115);
System.out.println ("Theatre name is "+bookMyShow1.theatreName);
System.out.println ("Snacks name name is "+bookMyShow1.snackName);
System.out.println("The ticket price is "+BookMyMoviesTester.ticketPrice);

}

}
