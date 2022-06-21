class MovieHub{

static String movies[] = {"Charlie 777","Vikram","BB2","Major","Kgf2","Prithviraj","Gajanana&Gang"};

public static void main(String a[])
 {
String value = getMovie( "RRR" );

 }

 //change the return type:void into String
 
public static String getMovie(String movie)
{
	String movieName = null;

	for(int i=0; i< movies.length; i++)
  {
	 if(movies[i] ==movie )
	 {movieName = movies[i];}
	else {System.out.print( movie + " is not available in the Movies Menu"); break;}
	
       }
 return movieName;
}

}