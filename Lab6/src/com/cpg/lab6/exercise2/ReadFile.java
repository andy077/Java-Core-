package com.cpg.lab6.exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	
	
	public static void display()
	{
		File f=new File("C:/Users/anand/eclipse-workspace/Lab6/src/com/cpg/lab6/exercise2/task.txt");
		
	      try(Scanner scan=new Scanner(f))
	      {
	    	  int i=1;
	    	 while(scan.hasNext())
	    	  System.out.println(i+++"-->"+scan.nextLine());
	      }
	      catch(FileNotFoundException e)
	      {
	    	 System.out.println("File name does not exist!!"); 
	      }
	}
}
