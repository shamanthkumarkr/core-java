class BookMyMoviesTester{
String movies[] = {"om","jogi","yajamana","A","H2O","gaja","Dangala","Appu"};
public static void main (String a[]){

BookMyMovie bookMyShow = new BookMyMovie("Prasanna",10,"om","kurkure",5,55);
System.out.println ("Theatre name is "+bookMyShow.theatreName);
System.out.println ("Snacks name name is "+bookMyShow.snackName);

bookMyShow.showTime(10,"Devi","om");
bookMyShow.buySnacks("kurkure",5,55);
bookMyShow.showTime(20,"shamanth","Appu");

bookMyShow.buySnacks("popcorn",8,115);



}

}