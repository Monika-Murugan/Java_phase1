

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Scanner;  
 
public class Long_increasing_subseq  {
    public static void main(String[] args) {
    	int n;  
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Enter the number of elements you want to store: ");  
    	 
    	n=sc.nextInt();  
    	 
    	int[] array = new int[n];  
    	System.out.println("Enter the elements of the array: "); 
    	for(int i=0; i<n; i++)  
    	{  
    	 
    	array[i]=sc.nextInt();  
    	}  
        ArrayList list = new ArrayList();
        ArrayList longestList = new ArrayList(); 
        int currentMax;
        int highestCount = 0;
        for(int i = 0; i < array.length;i++)
        {
            currentMax = 0;
            for(int j = i;j < array.length; j++)
            {
                if(array[j] > currentMax)
                {
                    list.add(array[j]);
                    currentMax = array[j];
                }
            }
                                    
            if(highestCount < list.size())
            {
                highestCount = list.size();
                longestList = new ArrayList(list); 
                      
            }  
            list.clear();
        }
        System.out.println();
         
        Iterator itr = longestList.iterator();
        System.out.println("The Longest increasing subsequence in the array list is: ");
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("Length of Longest increasing subsequence: " + highestCount);
    }
     
}