package com.xworxz.library;

import java.util.Scanner;

import com.xworxz.library.crud.Library;
import com.xworxz.library.crud.impl.LibraryImpl;
import com.xworxz.library.dto.BooksDTO;

public class LibraryTester {
	
	
		public static void main(String a[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter no of Books to Added");
			int size = sc.nextInt();
			
			Library lib =new LibraryImpl(size);
			
			for(int i=0; i<size; i++)
			{
			
			BooksDTO book = new BooksDTO();
			
			System.out.println("Enter the Book ID: ");
			int id= sc.nextInt();
			
			System.out.println("Enter the Book Name: ");
			String name= sc.next();
			
			System.out.println("Enter the Book Author: ");
			String author = sc.next();
			
			System.out.println("Enter the Book Type: ");
			String type = sc.next();
			
			book.setId(id);
			book.setName(name);
			book.setAuthor(author);
			book.setType(type);  
					
			lib.creatBook(book);
			}
			String option = null;
				do{
					System.out.println("Enter 1 to fetch all the books");
					System.out.println("Enter 2 to update type of book by ID");
					System.out.println("Enter 3 to delete book Details By Name");
					System.out.println("Enter 4 to get book name By Id");
					System.out.println("Enter 5 to delete Book Details By Name");
					System.out.println("Enter the Choise No.");
			
					int choise= sc.nextInt();
					
					switch(choise)
					{
						case 1:		lib.getBooksDetails();
									break;
						case 2:	System.out.println("enter the existing ID for Type of book has to be updated");
								int existingID =  sc.nextInt();
							
							System.out.println("enter the type of book to be updated");
							String updatedType = sc.next();
							
							lib.updateTypeofBookById(existingID,updatedType );
							break;
					
							
						case 3:	System.out.println("enter the  name to be deleted");
								String name1 = sc.next();
							
				 				lib.deleteBookDetailsByName(name1);
								break;
							
						case 4: 	
								System.out.println("Enter the ID");
								int id=sc.nextInt();
								
								lib.getNameofBookByID(id);
								break;
						
						default: break;
						
					}
					System.out.println("Do you want to continue y/n");
				option = sc.next();
				}
				
				while (option.equals("y"));
				
				sc.close();
		}	
	}


