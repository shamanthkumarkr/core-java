interface LibraryInf
{
	 boolean creatBook(BooksDTO book);
	 void getBooksDetails();
	 boolean deleteBookDetailsByName(String name);
	 boolean updateTypeofBookById(int id, String type);
	
	 String getNameofBookByID(int id);

}