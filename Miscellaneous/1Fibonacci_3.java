/*Print the fibonacci series till the given Number */

import java.util.*;

class GFG {
    //Using Recursion_Backtracking
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
     //Extra Space: O(n) if we consider the function call stack size


    //Using Top-to-bottom Dynamic Programming
    public static int fib2(int x,int arr[])
    {
        if (x == 0 || x == 1) {
		return 1;
	}
	//if answer has already been stored then return it
	if (arr[x] > 0) {
		return arr[x];
	}
	int output = fib2(x - 1, arr) + fib2(x - 2, arr);
	arr[x] = output;
	return output;
    }//Time Complexity:O(n)
     //Extra Space: O(n)


    //Using Bottom-to-top Dynamic Programming
     public static int[] fib3(int x,int op[])
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

	 System.out.println();

     for(int i=0;i<num;i++)
	    {
	        System.out.print(" "+fib2(i,arr)+" ");
	    }
     System.out.println();

     int fin[]=fib3(num,arr);

	    for(int y:fin)
            System.out.print(" "+y+" ");


	}
}
