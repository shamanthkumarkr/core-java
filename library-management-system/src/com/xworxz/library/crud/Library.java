package com.xworxz.library.crud;

import com.xworxz.library.dto.BooksDTO;

public interface Library
{
	 boolean creatBook(BooksDTO book);
	 void getBooksDetails();
	 boolean deleteBookDetailsByName(String name);
	 boolean updateTypeofBookById(int id, String type);
	
	 String getNameofBookByID(int id);

}

