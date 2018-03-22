/*
Return all subsequences of a string recursively
*/

import java.io.*;

class GFG {

    //Follows Bottom Up Approach
    ///1.returnSubs("aabc")
    ///3.returnSubs("abc")
    ///5.returnSubs("bc")
    ///7.returnSubs("c")
    ///9.returnSubs("")10.(base case executed)<-op={""}
    public static String[] returnSubs(String str)
    {
        //BASE CASE
        //Last string returned by substring func would be
        //empty string - storing it in output array
        if(str.length()==0)
        {
            String op[]={""};
            return op;

        }
        //Keeping track and storing last updated final array
        ///2.smallop[]=returnSubs("abc")
        ///4.smallop[]=returnSubs("bc")23.smallop={"","c","b","bc"}
        ///6.smallop[]=returnSubs("c")16.smallop={"","c"}
        ///8.smallop[]=returnSubs("")11.smallop={""}

        String smallop[]=returnSubs(str.substring(1));

        //Dynamically allocating and creating a array
        //Every element in String have 2 choices(to be there or not)
        ///12.(7.)new op[2*1]
        ///17.(5.)new op[2*2]
        String op[]=new String[2*smallop.length];

        for(int i=0;i<smallop.length;i++)
        {
            //copying contents of last updated array into final array
            ///13.(7.)op[0]={""},smallop.length=1
            ///18.(5.)op[0]={""},smallop.length=2
            ///19.(5.)op[1]={"c"},smallop.length=2
            op[i]=smallop[i];
        }

        for(int i=0;i<smallop.length;i++)
        {
            //Every time recursion occurs new substring is stored in str
            //Appending first character of that substring to a new
            //copy of subsequences already present in final array
            //and storing in new index
            ///14.(7.)op[1]={"c"+""},smallop.length=1
            ///20.(5.)op[2]={"b"+""},smallop.length=2
            ///21.(5.)op[3]={"b"+"c"},smallop.length=2

            op[i+smallop.length]=str.charAt(0)+smallop[i];
        }
        //op is the final updated array
        ///15.(7.)<-
        ///22.(5.)<-
        return op;
    }
	public static void main (String[] args) {

	    String s = "aabc";
	    String subarr[]=returnSubs(s);
        for (int i=0;i<subarr.length;i++)
        {
            System.out.println(subarr[i]);

        }

	}
}
