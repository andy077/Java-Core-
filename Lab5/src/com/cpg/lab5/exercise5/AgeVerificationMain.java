package com.cpg.lab5.exercise5;

import java.util.Scanner;

public class AgeVerificationMain 
{

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=scan.nextInt();
		AgeVerification obj=new AgeVerification();
	     obj.validateAge(age);
		scan.close();
	}
}