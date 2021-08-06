package com;

import java.util.Comparator;

public class BookIdComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getBookTitle().compareTo(o2.getBookTitle());
	}
	/*
public String compare(Book o1, Book o2) {
		
		return o1.getAuthor().compareTo(o2.getAuthor());
	}
	
public int compare(Book o1, Book o2) {
		
		return o1.getBookId()-o2.getBookId();
	}

public int compare(Book o1, Book o2) {
	
	return (int) (o1.getPrice()-o2.getPrice());
}*/
}


