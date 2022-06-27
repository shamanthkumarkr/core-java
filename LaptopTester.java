class LaptopTester{

public static void main(String a[])
{
	Hp hp = new Hp();
	hp.graphicCard="NVIDIA";
	hp.processor="Intel coreI3";
	hp.price=60000;
	hp.rom="500 GB";
	hp.specification();
	
	System.out.println("The  GraphicCard name is  "+hp.graphicCard);
	System.out.println("The processor name is "+hp.processor);
	System.out.println("Price of the LAptop is "+hp.price);
	System.out.println("ROM is "+hp.rom);


}


}