
public class CarryBagDTO
{

	public CarryBag()
	{
	}
	
	//to Achieve Encapsulation
		
		private String name;
		private double price;

	// getter and setter
	
	//we write getter by having a prefix as "get" then variable name
	//accessModifier returnType getVariableName(){return variableName; }
	public String getName()
	{
			return name;
	}
	//public void setVariablrName(dataType variableName){this.variableName=variableName;}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void holdThings()
	{
	 System.out.println("to hold the things");
	}
	

}