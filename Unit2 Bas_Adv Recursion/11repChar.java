/*Given an input string S and two characters c1 and c2,
you need to replace every occurrence of character c1
with character c2 in the given string. */

import java.io.*;

class GFG {
    
	public static String replaceCharacter(String input, char c1, char c2) {
      return replaceCharacter(input,c1,c2,"");
		

	}
        public static String replaceCharacter(String input, char c1, char c2,String output)
        {
          if(input.length()==0)
          {
            return output;
          }
          
          if(input.charAt(0)==c1) 
        { 
            return replaceCharacter(input.substring(1),c1,c2,output+c2);
        } 
        
          else 
            return replaceCharacter(input.substring(1),c1,c2,output+input.charAt(0));
        
        }
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}