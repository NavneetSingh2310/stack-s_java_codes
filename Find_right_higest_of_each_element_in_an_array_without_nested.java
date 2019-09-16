/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    public static int[] rightHighest(Stack<Integer> s,int n)
    {
        int a[]=new int[n];
        int max=0;
        for(int i=n-1;i>=0;i-- )
        {
            if(i==n-1)
            {
                int y=s.pop();
                a[i]=-1;
                max=y;
            }
            else{
            int x=s.pop();
            if(x>max)
            {
                max=x;
                a[i]=-1;
            }
            else if(x<max)
            {
               a[i]=max; 
            }
            }
            
        }
        
        return a;
        
    }
    
    
    
    
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	Stack<Integer> s=new Stack<Integer>();
	
	int n=sc.nextInt();

	for(int i=0;i<n;i++)
	{
	    s.push(sc.nextInt());
	}
	int b[]=rightHighest(s,n);
	
	for(int i=0;i<n;i++)
	{
	    System.out.print(b[i]+" ");
	}
	}
}