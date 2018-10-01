// Recursive java program for
// coin change problem.
import java.io.*;

class GFG {
	
	// Using Recursion
	static int count( int S[], int m, int n )
	{
		// If n is 0 then there is 1 solution 
		// (do not include any coin)
		//1st BASE CASE
		if (n == 0)
			return 1;
		
		// If n is less than 0 then no 
		// solution exists
		//RTE 
		if (n < 0)
			return 0;
	
		// If there are no coins and n 
		// is greater than 0, then no
		// solution exist
		//2nd BASE CASE
		if (m <=0 && n >= 1)
			return 0;
	
		// mth coin is last coin 
		//1st case is we wont consider mth coin thus passing subtracted arr length
		//which will result in removal of last coin
		//2nd case is mth coin will be included for sure so
		//subtracting value of mth coin from total required Money
		return count( S, m - 1, n ) +
			count( S, m, n-S[m-1] );
	}
	
		//using DP
	public static int countWays(int S[], int value)
	{
		// We need n+1 rows as the table is
		// constructed in bottom up manner using the base
		// case (n = 0)
		int m = S.length;
		int n = value;
		int[] table = new int[n+1];

		// Initialize all table values as 0
		Arrays.fill(table, 0); //O(n)

		// Base case (If given value is 0)
		table[0] = 1;

		// Pick all coins one by one and update the table[] i.e
		///Suppose i =2 (coin value)  
		for (int i=0; i<m; i++)
			for (int j=S[i]; j<=n; j++)
				table[j] += table[j-S[i]];
        ///then on returning table[value=4] we get 3
        //which means we can make value=4 using coin 1 and 2 in 3 ways
		return table[n];
	}
	//Time complexity of this function: O(mn)
    //Space Complexity of this function: O(n)

	
}

