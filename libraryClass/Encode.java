package com.libraryClass;

import java.util.Scanner;

import java.util.Scanner;

public class Encode
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();

		int i, a, c = 0;
		char ch, chr = 0;
		a = s.length();
		System.out.println("Encoded: 2");
		System.out.println("String to be encoded = " + s);
		System.out.println("Encoded String: ");
		for (i = 0; i < a; i++) {
			ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'x' || ch >= 'A' && ch <= 'X') {
				c = (int) (ch + 2);
				chr = (char) (c);
			}
			if (ch >= 'y' && ch <= 'z' || ch >= 'Y' && ch <= 'Z') {
				c = (int) (ch - 24);
				chr = (char) (c);
			}
			System.out.print(chr);
		}
	}
}
