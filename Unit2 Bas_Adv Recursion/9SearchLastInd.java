/*Given an array of length N and an integer x, you need to find and
return the last index of integer x present in the array.
Return -1 if it is not present in the array.
*/

import java.io.*;

class GFG {
     static int ind=0;
	public static int lastIndex(int input[], int x) {
		
      int l=0;
      int r=input.length;
      
      return lastIndex(input,l,r,x);
      }
  	public static int lastIndex(int input[], int l,int r,int x) {
      
      if(r>l)
      {
        if(x==input[l])
           ind=l;
        
        return lastIndex(input,l+1,r,x);
        
        
        
      }
      
      if (l==r&&ind!=0)
        return ind;
      
      else
        return -1;
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}