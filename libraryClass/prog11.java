package com.libraryClass;

class prog11
{
    public static void main (String[] args)
    {
        String s = "Welcome to the world of programming";
        s=s+" "; //adding a space at the end, to extract the last word also
        int len=s.length(); //finding the length of the sentence
        String x="", wrd="";
        char ch;
        int p, wod;
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i); //extracting characters of the string one at a time
            if(ch!=' ')
            {
                x=x+ch; //adding characters to form word if character is not space
            }
            else
            {
                p=x.length();

                {
                    wod=p;
                    wrd=x;
                }
                x=""; //emptying the temporary variable to store next word
                System.out.println(wrd);

            }}}}
