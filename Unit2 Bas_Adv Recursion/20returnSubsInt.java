
public class solution {


  	// Declaring 2-D array with 2 rows
    // int arr[][] = new int[2][];

  	// First row has 3 columns
    //arr[0] = new int[3];
    //Jagged array is a 2-D arrays but with variable number of columns in each row

  // Return a 2D array that contains all the subsets
    ///1.subsets(input={15,20,12})

	public static int[][] subsets(int input[]) {
    ///2.subsets(input={15,20,12},0)
      return subsets(input,0);


	}
	///3.subsets(input={15,20,12},0)
	///5.subsets(input={15,20,12},1)
	///7.subsets(input={15,20,12},2)
	///9.subsets(input={15,20,12},3)
  	public static int[][] subsets(int input[],int stindex) {

      //BASE CASE
      ///10.(base case executed)<-finop
       if(stindex==input.length)
    	    {
    	        int[][] finop=new int[1][1];
    	        finop[0][0]=input[stindex-1];
    	        return finop;
    	    }

    ///4.lastop[][]=subsets(input={15,20,12},1)
    ///6.lastop[][]=subsets(input={15,20,12},2)
    ///8.lastop[][]=subsets(input={15,20,12},3) 11.lastop[][]={{12}}
    int lastop[][]=subsets(input,stindex+1);//RECURSIVE CALL

    ///12.(7.)finop[2*1][2]
         int finop[][]=new int[2*lastop.length][lastop.length+1];
    ///13.(8.)
       for (int i=0; i<lastop.length; i++)
       {
         for(int j=0; j<lastop[i].length; j++)
        {
            //copying contents of last updated array into final array
            finop[i][j]=lastop[i][j];
        }
       }

        for (int i=0; i<lastop.length; i++)
       {

         for(int j=1; j<lastop[i].length; j++)
        {
            //copying contents of last updated array into final array
           finop[i+lastop.length][0]=input[stindex];

           finop[i+lastop.length][j]=lastop[i][j];
        }
       }


       return finop;

    }

}
