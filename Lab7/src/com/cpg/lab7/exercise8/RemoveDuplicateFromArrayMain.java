package com.cpg.lab7.exercise8;

import java.util.Scanner;

public class RemoveDuplicateFromArrayMain {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter Size of array:");
	  int n=scan.nextInt();
	  int arr[]=new int[n];
	  System.out.println("Enter Array Elements:");
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=scan.nextInt();
	  }
	  RemoveDuplicateFromArray obj=new RemoveDuplicateFromArray();
	  int output[]=obj.modifyArray(arr);
	  for(int i=0;i<output.length;i++)
		  System.out.println(output[i]);
	  scan.close();

	}

}