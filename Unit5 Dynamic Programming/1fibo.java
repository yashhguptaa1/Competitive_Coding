/*Given a number n print the first n fibonacci numbers.
Example:

Input:

1

7

Output:

1 1 2 3 5 8 13
*/


import java.io.*;
import java.util.*;

class fibo {
    
    //array to be used in recursive method to print n fibo numbers
    static int op[]=new int[50];
    
    //Iterative method
    //TC: O(n)
    //SC: O(n)
    public void printFibo(int n)
    {
        //n+2 is taken for case if n=0 then in next step
        //n+2 will ensure ArrayIndexOutOfBoundsException doesnt occur
        int fib[]=new int[n+2];
        
        //Base Cases 
        fib[0]=1;
        fib[1]=1;
        
        //Add the previous 2 numbers in the series 
        // and store it
        for(int i=2;i<n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        //Print the whole sequence
        for(int i=0;i<n;i++)
        {
            System.out.println(fib[i]);
        }
    }
        //Recursive method
        //TC: O(n)
        //SC:O(n)
        public int printFibo2(int n,int arr[])
        {
            //Base Case
            //First two numbers in sequence
            if(n==0||n==1)
            {
                //DOUBT correct if used
                //op[n]=1;
                //return op[n];
                arr[n]=1;
                return arr[n];
            }
            
            //Using DP
            //If a case has already been solved then return stored value for it
            if(arr[n]>0)
            {
                return arr[n];
            }
            //If not solved already
            arr[n]=printFibo2(n-1,arr)+printFibo2(n-2,arr);
            op[n]=arr[n];
            return arr[n];
            
            
        }

    
	public static void main (String[] args) {
	    
	    Scanner scan=new Scanner(System.in);
	    
	    int t=scan.nextInt();
	    
	    fibo f=new fibo();
	    
	    f.printFibo(t);
	    
	    int arr[]=new int[t+1];
	    
	    for(int i=0;i<=t;i++)
	    {
	        arr[i]=0;
	    }
	    
	    System.out.println(f.printFibo2(t,arr));
	    
	    for(int i=0;i<=t;i++)
	    {
	    System.out.println(op[i]);
	    }
	    
	}
}

/* output
1
1
2
3
5
8
13
21
0
0
2
3
5
8
13
21


*/