package com.cpg.lab5.exercise4;

import java.util.Scanner;

public class NameVerificationMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter FirstName:");
       String firstName=scan.nextLine();
       System.out.println("Enter LastName:");
       String lastName=scan.nextLine();
       NameVerification obj=new NameVerification();
       obj.checkForFirstNameAndLastName(firstName, lastName);
      scan.close();
	}

}