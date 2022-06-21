class Supermarket
{

static String biscuits[]={"Orio","ParleG","Sunfeast","Hide&seek","Goodday","DarkFantacy"};
static String grocery[]={"RefinedOil","Toordal","Maida","Atta","Rice","Groundnut","Peanut"};
static String deos[]={"Denver","Wildstone","Setwet","KS","Parkavenue","Armaf","ShotsDeo"};
static String soap[]={"Wildstone","Lifeboy","detol","Santoor","Gramsoap","MysoreSandals","Pears"};
static String detergents[]={"Wheel ,", "vanish ,", "Surfexel"};
static String coolDrinks[]={"Pepsi","cococola","Mazza","slice","Redbull","Sprite","7up"};

public static void main(String a[])
{
getBiscuits();
getGrocery();
getDeos();
getSoap();
getDetergents();
getCooldrinks();


}
public static void getBiscuits()
{
System.out.println("------------------------------------");
System.out.println("List of Biscuits");
for(int i=0; i<biscuits.length;i++)
{System.out.println(biscuits[i]);}
}

public static void getGrocery()
{
System.out.println("------------------------------------");
System.out.println("List of Grocery");
for(int i=0; i<grocery.length;i++)
{System.out.println(grocery[i]);}
}

public static void getDeos()
{
System.out.println("------------------------------------");
System.out.println("List of Deos");
for(int i=0; i<deos.length-2;i++)
{System.out.println(deos[i]);}
}
public static void getSoap()
{
System.out.println("------------------------------------");
System.out.println("List of Soap");
for(int i=0; i<soap.length-2;i++)
{System.out.println(soap[i]);}
}

public static void getDetergents()
{
System.out.println("------------------------------------");
System.out.println("List of Detergents");
for(int i=0; i<detergents.length-2;i++)
{System.out.println(detergents[i]);}
}

public static void getCooldrinks()
{
System.out.println("------------------------------------");
System.out.println("List of Cool Drinks");
for(int i=0; i<coolDrinks.length-2;i++)
{System.out.println(coolDrinks[i]);}
}
}
