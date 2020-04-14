package com.cpg.lab6.exercise4;

import java.util.Scanner;

public class ReplaceConsonentWithNextCharacterMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String input=scan.nextLine();
		ReplaceConsonentWithNextCharacter obj=new ReplaceConsonentWithNextCharacter();
		System.out.println(obj.alterString(input));
		 scan.close();
	}

}
