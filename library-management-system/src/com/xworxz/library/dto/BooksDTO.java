package com.xworxz.library.dto;

public class BooksDTO {
	
		
		
		private int id;
		private String name;
		private String author;
		private String type;
		
		public BooksDTO(){}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "BooksDTO [id=" + id + ", name=" + name + ", author=" + author + ", type=" + type + "]";
		}
		
		
		
	}


