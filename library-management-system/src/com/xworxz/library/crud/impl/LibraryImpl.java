package com.xworxz.library.crud.impl;
import java.util.Arrays;

import com.xworxz.library.crud.Library;
import com.xworxz.library.dto.BooksDTO;

public class LibraryImpl implements Library
{
	
	
	BooksDTO books[] ;
	
	int index;
	
	public LibraryImpl(int size)
	{
		books = new BooksDTO[size];
		System.out.println("Library constructor is created");
	}
	
	@Override
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
	@Override
	public void getBooksDetails()
	{
		System.out.println("inside the Books Details");
		for(int i=0; i<books.length;i++)
		{
			System.out.println("Book ID: "+books[i].getId()+ " Name of the Book: "+books[i].getName()+" Author Name: "+books[i].getAuthor()+" Type of Book: "+books[i].getType());
		}
	}
	  
		@Override
		public boolean deleteBookDetailsByName(String name)
		{
			
			boolean bookDeleted=false;
			System.out.println("inside Delete book Details by name");
			int i,j;
			for(i=0,j=0; j<books.length;j++)
			{
				if(!books[j].getName().equals(name))
				{ books[i++]=books[j];
					
					bookDeleted=true;
				}
				else{System.out.println("The book deatils is not available");}
			}
			books=Arrays.copyOf(books,i);
			return bookDeleted;
		}
		
		@Override
		public boolean updateTypeofBookById(int id, String type)
		{
				System.out.println("inside update type of book");
				boolean updateType=false;
				for(int i=0; i<books.length;i++)
				{
					if(books[i].getId()==id)
					{
						books[i].setType(type);
						updateType = true;
					}
					else{System.out.println(" update type of book ");}
				}
			return updateType;
		}
		
		
		@Override
		public String getNameofBookByID(int id)
		{
			String getNameofBook=null;
			System.out.println("inside get Name of Book by Id");
			for(int i=0; i<books.length;i++)
			{
				if(books[i].getId()==id)
				{
					getNameofBook=books[i].getName();
					System.out.println(getNameofBook);
					
				}
			}
		return getNameofBook;
		}
  
	
}