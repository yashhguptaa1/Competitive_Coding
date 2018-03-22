/*
Print all subsequences of String
*/

import java.io.*;

class GFG {

    public static void printSubs(String input,String outputSoFar)
    {
        //BASE CALL
        if(input.length()==0)
        {
            System.out.println(outputSoFar);
            return;
        }
        //RECURSIVE CALL
        //For every character there are two choices
        //1.First char of str is not part of subsequences
        printSubs(input.substring(1),outputSoFar);
        //2.First char of str is part of subsequences
        printSubs(input.substring(1),outputSoFar+input.charAt(0));

    }
	public static void main (String[] args) {

	    printSubs("xyz","");
		System.out.println("GfG!");
	}
}
