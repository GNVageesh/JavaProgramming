package com.iterations;

import java.util.Scanner;
public class forLoops
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("------Tables Program----------");
        System.out.println();
        System.out.println("Enter a number to find it's tables");
        int n = sc.nextInt();

        for(int i = 1; i <=10; i++)
        {
            System.out.println(n+" x "+i+" = "+(i*n));
        }
    }
}
