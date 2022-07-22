class BooksDTO
{
	public BooksDTO(){}
	
	private int id;
	private String name;
	private String author;
	private String type;
	
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

	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	
}