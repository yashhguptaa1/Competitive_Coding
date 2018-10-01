import java.util.*;
import java.io.*;

public class Main {
  
  public static long numcode(char digits[],int n)
  {
    long count[]=new long[5001];
          
    count[0]=1;//BASE CASE // empty string will the code
	count[1]=1;//BASE CASE
    
    for (int i = 2; i <= n; i++)
    {
        count[i] = 0;
 
        // If the last digit is not 0, then last digit must add to
        // the number of words
        if (digits[i-1] > '0')
            count[i] = count[i-1];
 
        // If second last digit is smaller than 2 and last digit is
        // smaller than 7, then last two digits form a valid character
        if (digits[i-2] == '1' || (digits[i-2] == '2' && digits[i-1] < '7') )
            count[i] += count[i-2];
      
      //Print your answer taking modulo "10^9+7"
      count[i]=count[i]%1000000007;
    }
    return count[n];
}
  

	
	public static void main(String[] args) {
	
    Scanner scan=new Scanner(System.in);
    
    String digits=scan.nextLine();
      
    System.out.println(numcode(digits.toCharArray(),digits.length()));
    
	}

}