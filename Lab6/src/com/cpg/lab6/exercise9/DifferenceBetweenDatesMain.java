package com.cpg.lab6.exercise9;

import java.util.Date;
import java.util.Scanner;

public class DifferenceBetweenDatesMain {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      
		Scanner scan=new Scanner(System.in);
		DifferenceBetweenDates obj=new DifferenceBetweenDates();
		System.out.print("\nEnter Date in 23/05/1999 format");
		
		Date d=new Date(scan.nextLine());
		obj.printDifferenceOfDates(d);
		scan.close();
	 }


}
