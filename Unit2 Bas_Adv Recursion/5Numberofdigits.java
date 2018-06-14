/*Number of digits */

import java.io.*;

class GFG {
    
    public static int count(int n){
		//BASE CASE
		if(n == 0){//we return 0rather than 1 cauz we would get 1 more digit than req
			return 0;//no more digit remaining at end of recursion
		}
		//RECURSIVE CALL
	        //lastcount saves the count of digits till at any moment
	    	int enddigit=n/10;
		int lastcount = count(enddigit);
		return lastcount+1;//on not using +1, lastcount would not increment and lastcount
                            //as from base case would return
    }
	public static void main (String[] args) {
		System.out.println(count(12344));
	}
}
