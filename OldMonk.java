// child /sub/derived
class OldMonk extends Rum{
	
	public static void main(String a[])
{
	OldMonk old = new OldMonk();
	 
	 old.price=440.00;
	 old.alcoholContent= "42%";
	 old.quantity="750 ml";
	 old.mfgDate="29 april 2020";
	 old.expiry="Best before 6 years";
	 old.toGetkick();
	 
	 System.out.println(""+old.price);
	 System.out.println(""+old.alcoholContent);
	 System.out.println(""+old.quantity);
	 System.out.println(""+old.mfgDate);
	 System.out.println(""+old.expiry);
}

}