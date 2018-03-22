/*Question
Given an integer array A which contains duplicates.
Remove duplicates from the array and return a new
array without any duplicates*/


import java.io.*;
import java.util.*;

class GFG {

    public static int[] removeDuplicates(int arr[])
	{
     int n=arr.length;

      // Return the given array if array is empty
      // or contains a single element

       if (n==0 || n==1)
        return arr;

      int[] temp=new int[n];
      int j=0;//tracks size of the array needed

      //Similarly HashSet can also be used
      HashMap<Integer,Boolean> rd=new HashMap<Integer,Boolean>();

       for (int i=0; i<n; i++)
       {
         int currInt=arr[i];
         if (!rd.containsKey(currInt))
         {
           //HashMap is being used only to make sure there is no duplicate
           //it cannot be iterated directly as order of elements get changed as can be seen below
           rd.put(currInt,true);

           //this step is important as it maintains the sequence of elements
           temp[j++] = currInt;

         }

       }

      //This step was required as temp contained null values in last
      //as number of elements were less than the size temp was allocated
      int[] fin=new int[j];

      for (int i=0; i<j; i++)
      {
        fin[i]=temp[i];
      }

      return fin;
	}
    public static void printHashMap(int arr[])
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        //Inserting values in hashmap
        for (int i=0;i<arr.length;i++){
        int currInt=arr[i];

        if (!hm.containsKey(currInt))
        {
        hm.put(arr[i],1);
         }
        }
        //printing vaues of hashmap as list

        //System.out.println(Arrays.asList(hm));
         System.out.println(Collections.singletonList(hm)); // method 2

    }
	public static void main (String[] args) {

	    GFG g=new GFG();
	    int[] arr={105,106,111,114,105,135,138,111,147,114};

	    g.printHashMap(arr);

	}
}
/*output
[{114=1, 147=1, 135=1, 105=1, 106=1, 138=1, 111=1}]
*/
