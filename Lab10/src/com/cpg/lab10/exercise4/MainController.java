package com.cpg.lab10.exercise4;

interface InstanceCreationInterface
{
	Shoe getInstance();
}


public class MainController {

	public static void main(String[] args)
	{
       
		InstanceCreationInterface ici=MainController::getInstance;
		
	   System.out.println(ici.getInstance());	
	}
	
	public static Shoe getInstance()
	{
		return new Shoe("Nike",5000);
	}

}

