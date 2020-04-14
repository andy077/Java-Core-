package com.cpg.lab5.exercise4;

public class NameVerification 
{
    public void checkForFirstNameAndLastName(String firstName,String lastName)
    {
    	try
    	{
    		if(firstName.isEmpty())
    			throw new InvalidNameException("First name cannot be empty!!");
    		else if(lastName.isEmpty())
    			throw new InvalidNameException("Last name cannot be empty!!");
    		else if(firstName.isEmpty() && lastName.isEmpty())
    			throw new InvalidNameException("First name  and Last Name cannot be empty!!");
    		System.out.println(" Your First Name:"+firstName+" LastName: "+lastName);
    	}
    	catch(InvalidNameException e)
    	{
    		e.displayError();
    	}
    }
}