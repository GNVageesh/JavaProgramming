package com.libraryClass;

import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        String reverse = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Enter a String to Check if it is a Palindrome or not");
        String string = sc.nextLine();

        int length = string.length();

        for(int i = length -1; i>=0; i--)
        {
            reverse = reverse+string.charAt(i);
        }
        if(string.equals(reverse))
            System.out.println("Is Palindrome");
        else {
            System.out.println("Not a palindrome number");
        }
    }
}
