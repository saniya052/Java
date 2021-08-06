package com;

import java.util.*;

public class BookComapre {
	public static void main(String[] args)
    {
		Book b1=new Book(9,"dsds","msdsa",135.2);
		Book b2=new Book(123,"sds","asa",235.2);
		Book b3=new Book(0,"ts","pdsa",5.2);
		
		
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Collections.sort(books, new BookIdComparator());
		
		Iterator<Book> iterator = books.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
    }

}
