package com.cpg.lab5.exercise3;

import java.util.Scanner;

public class PrimeNumbersMain
{

	public static void main(String[] args) 
	{
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Number :");
	       int n=scan.nextInt();
	       PrimeNumbers obj=new PrimeNumbers();  
	       obj.printPrimeNumbers(n);
	       scan.close();

	}

}