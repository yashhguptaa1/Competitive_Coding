
import java.io.*;
import java.util.*;

class GFG {
    //bottom up approach

public static int power(int x, int y)
    {
        int temp;
       // BASE CASE
       /// x^0=1
	    if( y == 0)
          return 1;

	    //Reduces TC from O(n) to O(log n)
	    temp = power(x, y/2);//Recursive call + storing last updated value

		// if even power
		///consider like finding square
	   if (y%2 == 0)
		return temp*temp;

       else//if(y%2==1)
        ///consider like finding cube
         return x*temp*temp;

    }

    //Let us extend the power function to work for negative power and float number.
    public static float power(float x, int y)
    {
        float temp;
        // BASE CASE
       /// x^0=1
	    if( y == 0)
	    return 1;

	    temp = power(x, y/2);
		System.out.print(temp+ " ");

	   if (y%2 == 0)
		return temp*temp;
	else
	{
		if(y > 0)
			return x*temp*temp;
		else//for negative power
			return (temp*temp)/x;

    }
}

	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    float x=scan.nextFloat();
	    int y =scan.nextInt();

		System.out.println("The result is "+ power(x,y));

        scan.close();
	}
}

/*
INPUT
2 -3
OUTPUT
1.0 0.5 The result is 0.125
*/
