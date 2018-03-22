/*
Linear Search Recursive
*/
import java.io.*;

class GFG {
    public static boolean checkNumber(int input[], int x) {
		
      int l=0;
      int r=input.length;
      
      return checkNumber(input,l,r,x);
      }
  	public static boolean checkNumber(int input[], int l,int r,int x) {
      
      if(r>l)
      {
        if(x==input[l])
          return true;
        
        return checkNumber(input,l+1,r,x);
        
        
        
      }
      else
        return false;
    
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}