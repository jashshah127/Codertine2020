/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int findIndex(int arr[], int t) 
    { 
  
        // if array is Null 
        if (arr == null) { 
            return -1; 
        } 
  
        // find length of array 
        int len = arr.length; 
        int i = 0; 
  
        // traverse in the array 
        while (i < len) { 
  
            // if the i-th element is t 
            // then return the index 
            if (arr[i] == t) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] data = new int[n][2];
		for (int i = 0; i < n; i++){
		    for(int j = 0; j < 2; j++){
		        if(in.hasNext()){
		        data[i][j] = in.nextInt();
		        }
		    }
		}
		
		int[] arr = new int[n];
		int[] sum = new int[n];
		for (int i = 0; i < n; i++){
		    arr[i] = data[i][0] + data[i][1];
		    sum[i] = data[i][0] + data[i][1];
		} 
		
		Arrays.sort(arr);
		
		for(int i =0; i< arr.length; i++){
		    System.out.print((findIndex(sum, arr[i]) + 1) + " ");
		}
	}
}
