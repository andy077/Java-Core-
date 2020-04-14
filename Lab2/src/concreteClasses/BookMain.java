package concreteClasses;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) 
	{
	 Scanner scan=new Scanner(System.in);
	  int identificationNumber=scan.nextInt();
	  int noOfCopies=scan.nextInt();
	  String title=scan.nextLine();
	  String author=scan.nextLine();
	  Book b1=new Book(identificationNumber,noOfCopies,title,author);
	   b1.print();
	  scan.close();
	}

}