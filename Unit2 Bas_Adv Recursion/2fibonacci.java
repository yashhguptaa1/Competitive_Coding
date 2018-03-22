/*Print the fibonacci series till the given Number */

import java.io.*;
import java.util.*;

class GFG {
    //Using Recursion
    //Bottom up approach
    public static int fib(int x)
    {

        //BASE CASE
        ///1, 1, 2, 3, 5, 8, etc.
        if (x==1||x==2)
        {
            return 1;
        }

        else
        {
            ///fib(3)= fib(2)+fib(1)
            ///      =   1   +   1
            ///      =       2
            return fib(x-1)+fib(x-2);//RECURSIVE CALL
        }
    }//Time Complexity: T(n) = T(n-1) + T(n-2)+O(n) which is exponential.
    
    //Using Dynamic Programming
    public static int[] fib(int x,int op[])
    {
     op[0]=1;
     op[1]=1;
     for (int i = 2; i < x; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        op[i] = op[i-1] + op[i-2];
    }
    
    return op;
    }//Time Complexity: O(n)

	public static void main (String[] args) {

	    int num = new Scanner(System.in).nextInt();
	    int[] arr=new int[num];
	    
	    for(int i=1;i<num+1;i++)
	    {
	        System.out.print(" "+fib(i)+" ");
	    }
        
            System.out.println(" ");
            int fin[]=fib(num,arr);
	    
	    for(int y:fin)
            System.out.println(y);
	    

	}
}
