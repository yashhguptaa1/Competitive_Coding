/*Print numbers */

import java.io.*;

class GFG {
    public static void print(int n){
		if(n == 1){
			System.out.print(1 + " ");
          return;
		}
		print(n - 1);
      System.out.print(n+" ");
    }	
	public static void main (String[] args) {
		print(7);
		System.out.println("GfG!");
	}
}