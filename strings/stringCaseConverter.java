package com.strings;

import java.util.Scanner;
public class stringCaseConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = sc.nextLine();
		if (s.equalsIgnoreCase("Hello CODE  "))
			System.out.println("Hey vageesh how are you");
		if(s.equals("How are you"))
			System.out.println("I am fine");
		if(s.isEmpty())
			System.out.println("Empty String");
	}
}
