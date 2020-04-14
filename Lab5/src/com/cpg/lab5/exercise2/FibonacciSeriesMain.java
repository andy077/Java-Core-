package com.cpg.lab5.exercise2;

import java.util.Scanner;

public class FibonacciSeriesMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		FibonacciSeries obj=new FibonacciSeries();
		System.out.println("Fibonacci Series using Normal Function:"+obj.usingNormalFunction(scan.nextInt()));
		System.out.println("Fibonacci Series using Recursive method:"+obj.usingRecursiveMethod(scan.nextInt(),scan.nextInt(),scan.nextInt()));
		scan.close();

	}

}