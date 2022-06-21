class ShowRoom
{
	int showRoomID;
	static String name = "Puma";
	static int noOfBranches= 50;
	String location ;
	long contactNo;
	
	public ShowRoom()
	{ System.out.println ("ShowRoom object is created");}
	
	public static void main(String sk[])
	{
	
	ShowRoom shop1 = new ShowRoom();
	shop1.showRoomID=123;
	shop1.location="Vijayanagar";
	shop1.contactNo = 7676512258l;
	                         //S.O.P (" " + refVer.variableName);
	System.out.println("The showroomID is "+ shop1.showRoomID);
	                        //S.O.P (" " + className.variableName);
	System.out.println("The name of the brand showRoom "+ ShowRoom.name);
	System.out.println("The no of branches in this city "+ ShowRoom.noOfBranches);
	System.out.println("The location of showRoom "+ shop1.location);
	System.out.println("The contactNo of showRoom "+ shop1.contactNo);
	
	ShowRoom shop2 = new ShowRoom();
	shop2.showRoomID=133;
	shop2.location="jayanagar";
	shop2.contactNo = 9676512258l;
	
	System.out.println("The showroomID is "+ shop2.showRoomID);
	System.out.println("The name of the brand showRoom "+ ShowRoom.name);
	System.out.println("The no of branches in this city "+ ShowRoom.noOfBranches);
	System.out.println("The location of showRoom "+ shop2.location);
	System.out.println("The contactNo of showRoom "+ shop2.contactNo);
	}


}