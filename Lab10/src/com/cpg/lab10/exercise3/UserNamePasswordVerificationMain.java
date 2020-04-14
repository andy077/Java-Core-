package com.cpg.lab10.exercise3;

import java.util.Scanner;

public class UserNamePasswordVerificationMain {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		UserNamePasswordVerification obj=new UserNamePasswordVerification();
		System.out.println("Enter User Name:");
		String user=scan.nextLine();
		System.out.println("Enter Password:");
		String password=scan.nextLine();
		if(obj.checkUserNamePassword(user, password))
			System.out.println("LogIn Success!!");
		else
			System.out.println("Username or password incorrect!!");
		scan.close();
	}

}