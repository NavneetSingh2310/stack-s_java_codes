/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    public static int[] rightHighest(int a[],int n)
    {
        int b[]=new int[n];
        	Stack<Integer> s=new Stack<Integer>();
        	s.push(a[n-1]);
        	b[n-1]=-1;
        	
        	
        for(int i=n-2;i>=0;i--){
            if(i==0)
            {
                while(s.peek()<a[i])
                {
                    s.pop();
                }
                
                b[i]=s.peek();
            }
            
            else if(s.peek()<a[i])
            {
                s.pop();
                s.push(a[i]);
                b[i]=-1;
            }
            else if(s.peek()>a[i])
            {
                b[i]=s.peek();
                s.push(a[i]);
            }
            if(i==0)
            {
                while(s.peek()<a[i])
                {
                    s.pop();
                }
                
                b[i]=s.peek();
            }
        }
        	return b;
    }
    
    
    
    
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);

	
	int n=sc.nextInt();
int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	int b[]=rightHighest(a,n);
	
	for(int i=0;i<n;i++)
	{
	    System.out.print(b[i]+" ");
	}
	}
}