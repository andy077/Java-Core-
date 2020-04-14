package com.cpg.lab5.exercise6;

import java.io.Serializable;

public class EmployeeException extends Exception implements Serializable {

    String Log;
	public EmployeeException(String error)
	{
		this.Log=error;
	}
	public void displayError()
	{
		System.out.println(this.Log);
	}
}