import java.util.*;

/*
	- You are given a string, that can contain repeating characters.
	- Your task is to return the first character in this string that does not repeat. i.e., occurs exactly once
	- The string will contain characters only from English alphabet set, i.e., ('A' - 'Z') and ('a' - 'z');

*/
class CountIndex
{
    int count,index;

    // constructor for first occurrence
    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }

    // method for updating count
    public void incCount() {
        this.count++;
    }
}

public class solution
{
	static final int NO_OF_CHARS = 256;

    static HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(NO_OF_CHARS);

    /* calculate count of characters
       in the passed string */
     static void getCharCountArray(String str)
     {
         for (int i = 0; i < str.length();  i++)
         {
            // If character already occurred,
             if(hm.containsKey(str.charAt(i)))
             {
                 // updating count
                 hm.get(str.charAt(i)).incCount();
             }

            // If it's first occurrence, then store the index and count = 1
             else
             {
                 hm.put(str.charAt(i), new CountIndex(i));
             }

         }
     }

  public static char firstNonRepeatingChar(String str)
	{
		//	write your code here.
      getCharCountArray(str);
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < str.length();  i++)
        {
             // If this character occurs only once and appears
            // before the current result, then update the result
            if (hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index){
                 char ch = str.charAt(i);
              		return ch;
            }

        }



		return str.charAt(0);
	}
}
