class Speaker{

static String brandName = "One Plus";
static double price = 3000.00;
static String colour = "Black";
static boolean isConnected;
static int maxVolume = 100;
static int minVolume;
static int currentVolume;

public static void main(String a[])
{
System.out.println("the brandName is "+brandName);
System.out.println("the price of the speaker "+price);
onOrOff();
increasVolume();
increasVolume();
increasVolume();
increasVolume();
increasVolume();
increasVolume();

decreasVolume();
decreasVolume();
decreasVolume();
decreasVolume();
decreasVolume();
decreasVolume();
}


public static void onOrOff()
{

System.out.println("invoking onOrOff()");
	if(isConnected == false)
	{
	isConnected=true;
System.out.println("Speaker is turned on....avialable to connect");
	}
	else if(isConnected==true)
	{
	isConnected=false;
System.out.println("Speaker is turned off");
	}
}
  
public static void increasVolume()
{
	System.out.println("IncreasVolume method is started");
	if(isConnected==true)
{
		System.out.println("The speaker is turned on");
		if(currentVolume < maxVolume)
	{
	   currentVolume = currentVolume + 20;
	   System.out.println("the currentVolume is " + currentVolume);
	}
	else
	{
		System.out.println("The speaker is reached max volume");
	}
 }
	else{System.out.println("macha... speaker On maadu");}
	
System.out.println("increasVolume method is ended ");
	
}


public static void decreasVolume()
{
	System.out.println("DecreasVolume is Started");
	if(isConnected==true){
		System.out.println("The speaker is turned on");
		if(currentVolume > minVolume)
		{
			currentVolume = currentVolume - 20;
			System.out.println("the currentVolume is " + currentVolume);
		}
		else
		{
		System.out.println("The speaker is reached minVolume");	
		}
	}
	System.out.println("decreasVolume method is ended");
	
	
	
}

}