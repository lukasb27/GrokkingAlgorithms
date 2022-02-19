package com.recursion;


public class App 
{
    public static void main( String[] args )
    {
    }

    public static int factorial( int args )
    {
        if (args == 1) {
            return 1;
        } else {
            return args * factorial(args-1);
        }
    }
}
