/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static void mergeSort(int[] input){
		
      mergeSort(input,0,input.length-1);
		
	}
  public static void mergeSort(int[] input,int si,int ei){
    
    //BASE CASE
    //if there is 0 or 1 element in array return
    if(si>=ei)
    {
      return ;
    }
    int mid=(si+ei)/2;
    
    mergeSort(input,si,mid);
    mergeSort(input,mid+1,ei);
    merge(input,si,mid,ei);
  }
  
  public static void merge(int[] input,int si,int mid,int ei){
    
    int n1=mid-si+1;
    int n2=ei-mid;
    /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
    
    for(int i=0;i<n1;i++)
      L[i]=input[si+i];
    
    for(int i=0;i<n2;i++)
      R[i]=input[mid+1+i];
    
    /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of array after merging of previous subarray
    	
    	int k = si;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                input[k] = L[i];
                i++;
            }
            else
            {
                input[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            input[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            input[k] = R[j];
            j++;
            k++;
        }
  }
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}