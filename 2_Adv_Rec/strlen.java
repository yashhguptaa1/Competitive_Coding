/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        //String d = "";
        String s = sc.nextLine();
        System.out.println("The length of your string is: "+stringLength(s));
}

    public static int stringLength(String s)
    {
        //without this base case we get RuntimeException
        //as a new string is returned every time , in base case
        //we check till nothing is stored in new string s
        //(this is also how we initialize a string with empty string)
    if(s.equals(""))
        return 0;
    else
        {
            System.out.println(s.substring(1));
            System.out.println(s.substring(0));
            return stringLength(s.substring(1)) + 1;
            
        }
        
    /*
                return stringLength(s.substring(0)) + 1;
        This results in infinite recursion because you're passing the same string
        Because
        
        public String substring(int beginIndex, int endIndex) {
    if (beginIndex < 0) {
        throw new StringIndexOutOfBoundsException(beginIndex);
    }
    if (endIndex > value.length) {
        throw new StringIndexOutOfBoundsException(endIndex);
    }
    int subLen = endIndex - beginIndex;
    if (subLen < 0) {
        throw new StringIndexOutOfBoundsException(subLen);
    }
    return ((beginIndex == 0) && (endIndex == value.length)) ? this
            : new String(value, beginIndex, subLen);
}
        As can be seen on passing beginIndex as 0 this is returned means same string is returned
        As can be seen on passing beginIndex as any number greater than 0 new string is created and returned
        

    */
        
}
}
/*
OUTPUT
Enter a String: 
ash gupta
yash gupta
sh gupta
ash gupta
h gupta
sh gupta
 gupta
h gupta
gupta
 gupta
upta
gupta
pta
upta
ta
pta
a
ta

a
The length of your string is: 10
*/
