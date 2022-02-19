package com.divideandconquer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int sum( int[] args )
    {
        if (args.length == 0) {
            return 0; 
        } else {
            int[] d = new int[args.length - 1];
            int sourcePos, destPos, len;
            sourcePos = 1;
            destPos = 0;
            len = args.length - 1;
            System.arraycopy(args, sourcePos, d, destPos, len);
            return args[0] + sum(d);
        }
    }
}
