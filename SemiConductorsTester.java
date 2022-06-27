class SemiConductorsTester{

public static void main(String a[])
{
	TSMC sc = new TSMC();

	sc.industry="Semiconductors-Graphics card-GPU's";
	sc.hQ="Hsinchu Science Park-Taiwan";
	sc.founded=1987;
	sc.products="CPU-GPU-microprocessors";
sc.companyDetails();

System.out.println("Industry: "+sc.industry);
System.out.println("Head Quarters : "+sc.hQ);
System.out.println("Founded : "+sc.founded);
System.out.println("Products: "+sc.products);



}


}