class LibraryTester
{
	public static void main(String a[])
	{
		Library lib =new Library();
		
		BooksDTO book = new BooksDTO();
		book.setID(111);
		book.setName("Bhagavath Geetha");
		book.setAuthor("Vyasaraya");
		book.setType("Epic");
		
		
		BooksDTO book1 = new BooksDTO();
		book1.setID(222);
		book1.setName("Shri Ramayana Darshanam");
		book1.setAuthor("Kuvempu");
		book1.setType("Epic");
		
		BooksDTO book2 = new BooksDTO();
		book2.setID(333);
		book2.setName("Malvika agnimitra");
		book2.setAuthor("Kaviratna Kalidasa");
		book2.setType("Play");
		
		BooksDTO book3 = new BooksDTO();
		book3.setID(444);
		book3.setName("Wings of fire");
		book3.setAuthor("Apj Abdul kalam");
		book3.setType("Auto Biography");
		
		
		lib.creatBook(book);
		lib.creatBook(book1);
		lib.creatBook(book2);
		lib.creatBook(book3);
		lib.getBooksDetails();
	
	
	
	}



}