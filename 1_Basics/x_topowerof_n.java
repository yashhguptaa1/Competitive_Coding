
import java.io.*;
import java.util.*;

class GFG {
    public static float power(float x, int y)
    {
        float temp;
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
		else
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