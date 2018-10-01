import java.io.*;

class EqualRod {
    
    
    // returns true if there is a subset of arr[] with sum equal sum  being considered
    static boolean isSub (int arr[], int n, int sum) 
    { 
        // Base Cases 
        //subset exists
        if (sum == 0) 
            return true; 
            
        //if we reach end of array before sum becomes 0 
        //no subset
        if (n == 0 && sum != 0) 
            return false; 
  
        // If last element is greater than sum, then ignore it 
        if (arr[n-1] > sum) 
            return isSub (arr, n-1, sum); 
  
        /* opt1: excluding the last element 
           Opt2: including the last element 
        */
        return isSub (arr, n-1, sum) || 
               isSub (arr, n-1, sum-arr[n-1]); 
    }
  
    // Returns true if arr[] can be partitioned in two 
    // subsets of equal sum, otherwise false 
    static boolean ifPartition (int arr[], int n) 
    { 
        // Calculate sum of the elements in array 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += arr[i]; 
  
        // If sum is odd, there cannot be two subsets 
        // with equal sum 
        if (sum%2 != 0) 
            return false; 
  
        // Find if there is subset with sum equal to half 
        // of total sum 
        return isSub (arr, n, sum/2); 
    }
    
    static int q=Integer.MIN_VALUE;
    static boolean flag=false;
    
    static void combn(int arr[], int n, int r,int index, int data[], int i)
    {
        // Current combination is ready to be checked
        
        if (index == r) {
            
            int sum=0;
            for (int j = 0; j < r; j++)
                {
                    sum+=data[j];
                   // System.out.print(data[j] + " ");
                }
            
            //if there is a subset possible
            if(ifPartition(data,r)==true)
            {
                flag=true;
                q=Math.max(q,sum);
            }
            
            return;
        }

        // When no more elements are there to put in data[]
        if (i >= n)
            return;

        // current is included, 
        data[index] = arr[i];
        combn(arr, n, r, index + 1,data, i + 1);

        // current is excluded, 
        
        combn(arr, n, r, index, data, i + 1);
    }


    /* Driver function to check for above function */
    public static void main(String[] args)
    {
        int arr[] = { 2,3,4,1,6,7};
        int r = 6;
        int n = arr.length;
        
        int data[] = new int[r];
        while((flag==false)&&r>1)
        {
            combn(arr, n, r,0,data,0);
            r=r-1;
        }
        
        System.out.println(q);
    }
}
/* This code is contributed by Devesh Agrawal */
