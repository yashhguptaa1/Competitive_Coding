/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("The length of your string before: "+stringLength(s));
        String sx=removeX(s,"");
        System.out.println("The new string is "+sx);
        System.out.println("The length of your string after: "+stringLength(sx));

}
    public static String removeX(String str,String newStr)
    {

        if(str.substring(0, 1).equals("x"))
        { //do nothing
        }
        else {
        //add non-x char to newStr
        newStr += str.charAt(0);
        }

        if(str.length() == 1) {
        return newStr;
    }

    return removeX(str.substring(1), newStr);
}

    public static int stringLength(String s)
    {
    if(s.equals(""))
        return 0;
    else
        {
            return stringLength(s.substring(1)) + 1;

        }

    }
}
/*
INPUT
axbxcdex
OUTPUT
Enter a String:
The length of your string before: 8
The new string is abcde
The length of your string after: 5
*/
