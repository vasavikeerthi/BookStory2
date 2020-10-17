package com.vk;

import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
Scanner  s = new Scanner(System.in);
		
		DBBooks d= new DBBooks();
		char b;
		do {
			System.out.println("enter 1 to view list of books");
			System.out.println("enter 2 to search book by title");
			System.out.println("enter 3 to insert a book");
			System.out.println("enter 4 to delete a book ");
			System.out.println("enter 5 to update the book details");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				d.viewAll();
				break;
			case 2:
				System.out.println("enter the title of book");
				String name = s.next();
				Book rb = d.viewByName(name);
				if(rb!=null) {
					System.out.println(rb);
				}
				else {
					System.out.println("wrong details");
				}
				break;
			case 3:
				System.out.println("enter the book id");
				int id1 = s.nextInt();
				System.out.println("enter book title");
				String name1 = s.next();
				System.out.println("enter author name");
				String author1 = s.next();
				System.out.println("enter price of the book");
				double price1  = s.nextDouble();
				Book bb = new Book(id1,name1,author1,price1);
				d.insert(bb);
				break;
			case 4:
				System.out.println("enter id of the book you want to delete");
				int id2 = s.nextInt();
				d.delete(id2);
				break;
			case 5:
				System.out.println("enter the id");
				int id3= s.nextInt();
				System.out.println("enter the price");
				double p =s.nextDouble();
				d.update(id3,p);
				break;
				default:
					break;
				
			}
			
			System.out.println("press m for list of choices");
	b =s.next().charAt(0);
		
		}while(b=='M'||b=='m');
		
		
	}

}
