import java.util.*;
import java.io.*;
public class Arrayunique {
	
void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                  
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	
	
	static int removeDuplicates(int arr[], int n)
    {
       
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
         
        int j = 0;
        for (int i=0; i<n-1; i++)
        
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
       
        temp[j++] = arr[n-1];  
         
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    }
	
	 public static void main(String args[])
	    {
		   Arrayunique ob = new Arrayunique();
	        int arr[] = {1, 3, 5, 1, 3, 1, 10,10};
	        //bubble sort
	        ob.bubbleSort(arr);
	       
	        int n=arr.length;
	        n=removeDuplicates(arr,n);
	        
	        for (int i=0; i<n; i++)
	            System.out.print(arr[i]+" ");

	     
	    }


}

