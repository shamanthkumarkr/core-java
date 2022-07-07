public class ApartmentDTO
{
	private int id;
	private String name;
	private String owner;
	
	public ApartmentDTO(){}
	
	public int getID()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id=id;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getOwner()
	{
		return owner;
	}
	public void setOwner(String owner)
	{
		this.owner=owner;
	}
}