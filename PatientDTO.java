class PatientDTO 
{
	public PatientDTO(){}
	
	private int id;
	private String name;
	private String age;
	
	private long contactNo;
	private String address;
	
	
	
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
	public String getAge()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age=age;
	}
	
	public long getContactNo()
	{
		return contactNo;
	}
	public void setContactNo(long contactNo)
	{
		this.contactNo=contactNo;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	


}