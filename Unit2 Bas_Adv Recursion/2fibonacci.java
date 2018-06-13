/*Print the fibonacci series till the given Number */

import java.util.*;

class GFG {
    //Using Recursion
    
  //this function is used to find the value of number at xth pos
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
	// this denotes the fact that next fibonacci numkber is sum of its previous two nos 
        }
    }//Time Complexity: T(n) = T(n-1) + T(n-2)+O(n) which is exponential.



    public static int fib2(int x,int arr[])
    {
        if (x == 0 || x == 1) {
		return 1;
	}
	if (arr[x] > 0) {
		return arr[x];
	}
	int output = fib2(x - 1, arr) + fib2(x - 2, arr);
	arr[x] = output;
	return output;
}

    }
    //Time Complexity:O(n)


	public static void main (String[] args) {

	    int num = new Scanner(System.in).nextInt();
	    int[] arr=new int[num];

	    for(int i=1;i<num+1;i++)
	    {
	        System.out.print(" "+fib(i)+" ");
	    }
    for(int i=1;i<num+1;i++)
	    {
	        System.out.print(" "+fib2(i,arr)+" ");
	    }



	}
}
