package com.libraryClass;

public class ascii
{
    public static void main(String[] args)
    {
        String s = "Vageesh";
        int len =s.length();
        int a;
        char a1;
        for(int i = 0;i<len;i++)
        {
            a1 = s.charAt(i);
            a = a1;
            System.out.print(a1+" "+a+" ");
        }
    }
}
