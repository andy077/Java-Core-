package com.cpg.lab6.exercise3;

import java.util.Scanner;

public class MirrorImageMain {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter String:");
		 String s1=scan.nextLine();
		 MirrorImage obj=new MirrorImage();
		 System.out.println(obj.getImage(s1));
		 scan.close(); 
	}

}