/*Factorial of a Number */

import java.io.*;

class GFG {

    //bottom up approach
    public static int factorial(int x)
    {

        //BASE CASE
        ///0!=1
        if (x==0)
        {
            return 1;
        }

        else
        {
            //it contains smaller sub probs like below
            ///5!=5 X 4!
            return x*factorial(x-1);//RECURSIVE CALL
        }
    }

	public static void main (String[] args) {
		System.out.println(factorial(5));
	}
}
