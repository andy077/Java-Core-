package com.cpg.lab10.exercise2;

import java.util.Scanner;

public class SpaceBetweenStringMain {
	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String input=scan.nextLine();
		SpaceBetweenString obj=new SpaceBetweenString();
		System.out.println(obj.getFormattedString(input));
		scan.close();
	}

}
