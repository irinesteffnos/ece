package com.model;

public class Model {
	private int book_id;
	private String book_name;
 	private String author;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;}
	
	public String toString()
	 	{
	 		return book_id+" "+book_name+" "+author;
	 	}
}
