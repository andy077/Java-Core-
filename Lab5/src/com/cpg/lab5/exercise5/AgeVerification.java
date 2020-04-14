package com.cpg.lab5.exercise5;

public class AgeVerification 
{
  public void validateAge(int Age)
  {
	  try
	  {
		  if(Age<15)
			  throw new InvalidAgeException("Age cannot be below 15 years!!");
		  else
			  System.out.println("Your age is eligible !!");
		  
	  }
	  catch(InvalidAgeException e)
	  {
		  e.displayError();
	  }
  }
}
