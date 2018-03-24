/*Sum of array (recursive) */

import java.io.*;

class GFG {
    //Used Bottom up approach
	public static int sum(int input[],int n)
    {
      //BASE CASE
      if (n ==0)
        return 0;

      else
      {
        //old sum plus new element
        // at n=0
        //returned sum is (old sum =0 + input[0] )
        //RECURSIVE CALL
		return (sum(input,n-1) + input[n - 1]);

      }
    }
      	public static int sum(int input[])
        {
          return sum(input,input.length);

	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}
