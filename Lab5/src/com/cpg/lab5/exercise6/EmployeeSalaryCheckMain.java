package com.cpg.lab5.exercise6;

import java.util.Scanner;

public class EmployeeSalaryCheckMain {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Salary of Employee");
		int salary=scan.nextInt();
			
		EmployeeSalaryCheck obj=new EmployeeSalaryCheck(new Employee(salary));
		 obj.validateEmployee();
		scan.close();

	}

}