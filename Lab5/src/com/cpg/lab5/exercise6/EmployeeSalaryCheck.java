package com.cpg.lab5.exercise6;

public class EmployeeSalaryCheck
{
	Employee emp;
	public EmployeeSalaryCheck(Employee emp)
	{
		this.emp=emp;
	}
  public void validateEmployee()
  {
	  try
	  {
		  if(emp.salary<3000)
			throw new EmployeeException("Salary should be given more than 3000");
		  else
			  System.out.println("Ok he is an Employee");
	  }
	  catch(EmployeeException e)
	  {
		  e.displayError();
	  }
  }
}
