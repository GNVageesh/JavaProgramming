package com.libraryClass;

public class bin
{
    public static void main(String[] args)
    {
        int n = 10;
        int i = 0;
        double sum = 0;
        int d;

        while(n>0)
        {
            d = n%10;
            sum = sum + d*Math.pow(2,i);
            i++;
            n = n/10;
        }
        System.out.println(sum);
    }
}
