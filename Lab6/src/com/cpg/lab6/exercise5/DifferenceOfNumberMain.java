package com.cpg.lab6.exercise5;

import java.util.Scanner;

public class DifferenceOfNumberMain {
	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  DifferenceOfNumber obj=new DifferenceOfNumber();
		  System.out.println("Enter Number:");
		  String input=scan.nextLine();
		  System.out.println(obj.modifyNumber(input));
		     scan.close();

	}

}
