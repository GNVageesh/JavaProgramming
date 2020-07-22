package com.libraryClass;

public class character
{
	public static void main(String[] args)
	{
		char a = '1';
		char b = 'a';
		char c = '@';
		char d = ' ';
		if(Character.isDigit(a))
			System.out.println("The given number is a digit");
		else
			System.out.println("The number is not a digit");
		if(Character.isLetter(b))
			System.out.println("The given number is a letter");
		else
			System.out.println("The number is not a letter");
		if(Character.isLetterOrDigit(c))
			System.out.println("The given number is a letter or a digit");
		else
			System.out.println("The number is neither a letter or a digit");
		if(Character.isWhitespace(d))
			System.out.println("The given number is a blank space");
		else
			System.out.println("The number is not a blank space");
	}
}
