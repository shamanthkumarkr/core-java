class Library
{
	BooksDTO books[] = new BooksDTO[4];
	
	int index;
	
	public Library()
	{
		System.out.println("Library constructor is created");
	}
	
	public boolean creatBook(BooksDTO book)
	{
		System.out.println("inside the creat  Book");
		boolean isAdded=false;
		
		if(book != null && book.getName() != null)
		{
			this.books[index++]=book;
			isAdded=true;
		}
		else{
			System.out.println("required books is not here..please add");
		
	       }
		   return isAdded;
	}
	
	public void getBooksDetails()
	{
		System.out.println("inside the Books Details");
		for(int i=0; i<books.length;i++)
		{
			System.out.println("Book ID: "+books[i].getID()+ " Name of the Book: "+books[i].getName()+" Author Name: "+books[i].getAuthor()+" Type of Book: "+books[i].getType());
		}
	}
  
}