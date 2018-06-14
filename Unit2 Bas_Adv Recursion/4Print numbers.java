/*Print numbers from 1 to n */

import java.io.*;

class GFG {

    public static void print(int n){
		if(n == 1){
			System.out.print(1 + " ");
          return;
		}
		print(n - 1);//PUSH(es) all the recursive calls in stack till n becomes 1,
	                     //and then POP(s) each function call after executing it
      System.out.print(n+" ");
    }
	public static void main (String[] args) {
		print(7);
		System.out.println("GfG!");
	}
}
