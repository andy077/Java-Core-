package com.cpg.lab6.exercise8;

import java.util.Scanner;

public class PositiveStringMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=scan.nextLine();
		
		PositiveString obj=new PositiveString();
		boolean ispositive=obj.isPositive(s1);
		if(ispositive)
			System.out.println("String is positive !!");
		else
			System.out.println("String is Negative!!");
		scan.close();

	}

}
