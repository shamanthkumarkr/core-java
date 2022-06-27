class TestingToolTester{

public static void main(String a[])
{
	TestingTool test = new TestingTool();
	{   test.type ="Software Testing Framework";
		test.repository="git.hub";
		test.os="Cross-platform";
		test.useSelenium();
		
		System.out.println("Salenium is type of : "+test.type);
		System.out.println("repository : "+test.repository);
		System.out.println("Operating System :"+test.os);
	
	}


}

}