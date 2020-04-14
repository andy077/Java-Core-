package com.cpg.lab5.exercise5;

public class InvalidAgeException  extends Exception implements java.io.Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -831493542874637778L;

	String Log;
	public InvalidAgeException(String ErrorMsg)
	{
		this.Log=ErrorMsg;
	}
	public void displayError()
	{
		System.out.println(this.Log);
	}
}