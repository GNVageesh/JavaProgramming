package com.libraryClass;

public class checkCaseOfACharacter
{
	public static void main(String[] args)
	{
		char a = 'z';
		char b = 'a';
		if(Character.isUpperCase(a))
			System.out.println("The data is in UpperCase");
		else
			System.out.println("The data is not in UpperCase");
		if(Character.isLowerCase(b))
			System.out.println("The data is in LowerCase");
		else
			System.out.println("The data is not in LowerCase");
	}
}
