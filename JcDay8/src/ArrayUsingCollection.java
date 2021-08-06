import java.util.*;
import java.io.*;

public class ArrayUsingCollection {
	public static void main(String args[])
    {
		 int array[] = { 1,3,1,6,7,5,6,3 };
		 
		 Set<Integer> set = new HashSet<Integer>();
		 
		 for(int i=0;i<array.length;i++){
			 System.out.print(array[i]+" ");
			 set.add(array[i]);
		 }
    
		 System.out.println(" ");
		 for(int i :set) {
			System.out.print(i+" "); 
		 }
    }
}
