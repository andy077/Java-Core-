package com.cpg.lab4.exercise1;

import java.util.Scanner;

public class SumOfCubeOfDigitsMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=scan.nextInt();
		SumOfCubeOfDigits obj=new SumOfCubeOfDigits();
		System.out.println("Sum of cubes : "+obj.getSumOfCubesOfNDigitNumber(num));
		scan.close();
	}

}