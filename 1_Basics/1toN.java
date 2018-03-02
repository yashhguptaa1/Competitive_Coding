/*to print number from 1 to n in increasing order recursively*/

import java.io.*;

class GFG {
    /* Wrong Code 
    public class Solution {

	public static void print(int n){
		if(n == 1){
			System.out.print(1 + " ");
			}
			      System.out.print(n+" ");
                  print(n - 1);
		
	}

}*/
//Right Code
    public static void print(int n)
    {
		if(n == 1)
		{
		 System.out.print(1 + " ");
         return;//base case must have a return statement
		}
		print(n - 1);
        System.out.print(n+" ");
        //placing after func call prints in ascending
        //placing before func call prints in descending
		
	    }

    }
}