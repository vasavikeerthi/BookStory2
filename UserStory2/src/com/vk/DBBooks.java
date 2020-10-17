package com.vk;

import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Iterator;

public class DBBooks {
TreeSet<Book> tset;
public DBBooks() {
	tset = new TreeSet<Book>();
	Book b1 = new Book(1,"HappyPrince","Oscar Wilde",98.00);
	Book b2 = new Book(2,"MerchantofVenice","Shakesspear",160.00);
	Book b3 = new Book(3,"WingsofFire","A.P.J.Abdul Kalam",295.00);
	tset.add(b1);
	tset.add(b2);
	tset.add(b3);
	}
	
public void viewAll() {
	Iterator<Book> itr = tset.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
public Book viewByName(String name) {
	for (Book b:tset) {
		if(b.title.equals(name)) {
			return b;
		}
	}
	return null;

}
public void insert(Book b) {
	
	tset.add(b);
	System.out.println("data inserted successfully");	
}

public void delete(int id) {
	Iterator<Book> itr = tset.iterator();
	if(id==itr.next().bookId) {
		itr.remove();
		System.out.println("book deleted");
	}
	else {
		System.out.println("no book found with this id");
	}
}
public void update(int id, double price) {
	Iterator<Book> itr = tset.iterator();
	while(itr.hasNext()) {
		Book bTemp=itr.next();
		if(bTemp.bookId==id) {
			String title = bTemp.title;
			String author = bTemp.author;
			itr.remove();
			Book b = new Book(id,title,author,price);
			tset.add(b);
			System.out.println("Updated Successfully");
			}
		}
	}
}














