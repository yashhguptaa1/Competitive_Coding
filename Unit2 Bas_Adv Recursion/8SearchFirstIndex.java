/*
Given an array of length N and an integer x, you need to find and
return the first index of integer x present in the array.
Return -1 if it is not present
*/

import java.io.*;

class GFG {
    public static int firstIndex(int input[], int x) {


      int l=0;
      int r=input.length;

      return firstIndex(input,l,r,x);
      }

  	public static int firstIndex(int input[], int l,int r,int x) {

      if(r>l)
      {
        if(x==input[l])
          return l;

        return firstIndex(input,l+1,r,x);

     }
      else
        return -1;

	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}
