package com.libraryClass;

public class convertingCharToOppCase
{
	public static void main(String[] args)
	{
		char a = 'G';
		char b = 'i';

		System.out.println("The original data is: "+a);
		System.out.println("The Final data is: "+Character.toLowerCase(a));
		System.out.println();
		System.out.println("The original data is: "+b);
		System.out.println("The Final data is: "+Character.toUpperCase(b));
	}
}
