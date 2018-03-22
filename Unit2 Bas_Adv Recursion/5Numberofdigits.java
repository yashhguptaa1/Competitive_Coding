/*Number of digits */

import java.io.*;

class GFG {
    //Top down approach
    public static int count(int n){
		//BASE CASE
		if(n == 0){
			return 0;//no more digit remaining at end of recursion
		}
		//RECURSIVE CALL
		int lastcount = count(n / 10);
		return lastcount+1;
    }
	public static void main (String[] args) {
		System.out.println(count(12344));
	}
}