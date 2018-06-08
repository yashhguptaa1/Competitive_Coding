/*
Write an efficient program to find the sum of contiguous subarray within
a one-dimensional array of numbers which has the largest sum.
i/p: -2, -3, 4, -1, -2, 1, 5, -3
o/p:
Maximum contiguous sum is 7
Starting index 2
Ending index 6
*/

import java.io.*;
import java.util.*;

class GFG {

    public static void maxSumSubarr(int arr[],int n)
    {
        int maxSoFar=Integer.MIN_VALUE;
        int maxEndingHere=0;
        int s=0,end=0,start=0;

        for(int i=0;i<n;i++)
        {
            maxEndingHere+=arr[i];

            if(maxEndingHere<0)
            {
                //as negative ans will never result in max sum
                maxEndingHere=0;
                s=i+1;//shift starting point by 1
            }

            if(maxSoFar<maxEndingHere)
            {
                //Here DP is being implemented by storing last ans in maxSoFar
                maxSoFar=maxEndingHere;
                start=s;
                end=i;
            }

        }
        System.out.println("Maximum contiguous sum is "+maxSoFar);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
	public static void main (String[] args) {

	    Scanner scan =new Scanner (System.in);

	    int size=scan.nextInt();
	    int arr[]=new int[size];

	    for(int j=0;j<size;j++)
	    {
	        arr[j]=scan.nextInt();
	    }

	    maxSumSubarr(arr,size);
	}
}
