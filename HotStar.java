class HotStar
{
static String kannadaMovies[]={"Chammak","Drishya-1","Simple Agi ondh Love Story","Galipata","Mungaru Male","kavacha","Love Mocktail","Dia","Kranti Veera Sangolli Rayanna","Kotigobba","Bhajarangi"};
static String teluguMovies[]={"Dookugu","Pokiri","Agadu","shrimantudu","Satyam","Baahubhali","Aaha","Eega","Akhanda","Legend","Tholi prema","Bheemla Nayak","Vakil Saab","Panjaa","Stalin"};
static String tamilMovies[] = {"Singham","7th Sense","Sarkar","Kaththi","Asuran","Jagame tandiran","Jigar thanda","ET","Peta","kabali","valimai","Vishwasam","Arambam"};
static String malayalamMovies[]={"Salute","Premam","Bangalore Days","Vikramadityan","ABCD","Bheeshma Parvam","Shyalock","Trance","Cold Case","Dhrishyam","Mikhael"};
static String tvShows [] = {"French Biriyani","City of Dreams","Grahan","Rudra","Special OPS","Koffe With Karan","Parampara","Criminal Justice","Aarya"};

public static void main (String a[])
{
System.out.println("List of Best Kannada Movies in HotStar");
for(int i=0; i<kannadaMovies.length; i++)
{System.out.println(kannadaMovies[i]);}

System.out.println("--------------------------------------");
System.out.println("List of Best Telugu Movies in HotStar");
for (int i=0; i<teluguMovies.length; i++)
{System.out.println(teluguMovies[i]);}

System.out.println("--------------------------------------");
System.out.println("List of Best Tamil Movies in HotStar");
for(int i=0;i<tamilMovies.length;i++)
{System.out.println(tamilMovies[i]);}

System.out.println("--------------------------------------");
System.out.println("List of Best Malayalam Movies in HotStar");
for(int i=0;i<malayalamMovies.length;i++)
{System.out.println(malayalamMovies[i]);}

System.out.println("--------------------------------------");
System.out.println("List of Best Popular Tv Shows in HotStar");
for(int i=0;i<tvShows.length;i++)
{System.out.println(tvShows[i]);}	

}
}