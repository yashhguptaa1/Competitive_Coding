/*package whatever //do not write package name here */

import java.io.*;

class GFG {//aabccba
    
    public static String remConsDup(String s)
    {
        if(s.length()<=1)
        {
            return s;
        }
    
        
    if(s.charAt(0)==s.charAt(1))//a==a T
    {
        return remConsDup(s.substring(1))
        
    }
    
    else{
        String small=remConsDup(s.substring(1));
        return s.charAt(0)+small;
    }
    
    
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}