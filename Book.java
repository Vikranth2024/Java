package pkg;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public double price(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the discount percentage : ");
		double dis = sc.nextDouble();
		return price * (100-dis)/100 ;
	}
	public static void main(String[] args){
		Book b1 = new Book("Class of Java","Pravin Jain",499.0);
		System.out.println(b1.price());
	}
	{
		
	}

}
