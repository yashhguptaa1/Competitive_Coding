/*
Given an array of length N and an integer x, you need to find all the
ndexes where x is present in the input array.
Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
*/
import java.io.*;

class GFG {
    //First forward recursion and then returns indexes when backtracking

	public static int[] allIndexes(int input[], int x) {

      return allIndexes(input,x,0);

	}

  public static int[] allIndexes(int input[], int x,int stindex) {

    	    //BASE CASE
    	    //recursion or linear search should stop on reaching the end of array
    	    //as element is not present and return an empty array i.e. array of size 0

    	    if(stindex==input.length)
    	    {
    	        int[] op=new int[0];
    	        return op;
    	    }

    	   // stores the last updated array
    	    int smallop[]=allIndexes(input,x,(stindex+1));//RECURSIVE CALL

    	    if (input[stindex]==x)
    	    {
    	        //creating new array with increased size
    	        int op[]=new int[smallop.length+1];

    	        //arranging array with indexes in sequence
    	        op[0]=stindex;
    	        for (int i=0;i<smallop.length;i++)
    	        {
    	            op[i+1]=smallop[i];
    	        }

    	        //return the updated op array with indexes in sequence
    	        return op;
    	    }


    	    else{
    	        //if input[stindex]!=element
    	        //return the same array that was returned in previous func call
    	        return smallop;
    	    }
  }
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}
