/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    public static Stack<Integer> s1=new Stack<Integer>();
    public static Stack<Integer> s2=new Stack<Integer>();
    
    public static void insert(int value)
    {
       /* if(!s2.empty())
        {
            while(s2.empty())
            {
                s1.push(s2.pop());
            }
            
            s1.push(value);
        }
        else if(s2.empty())
        {
            s2.push(value);
        }
        
        int n=s1.size();
        for(int i=0;i<n;i++)
        {
            s2.push(s1.pop());
        }*/
        s1.push(value);
    }
    
    public static int delete()
    {
        int n=s1.size();
        for(int i=0;i<n;i++)
        {
            s2.push(s1.pop());
        }
        
        int temp=-1;
        if(!s2.empty())
        {
            temp=s2.pop();
        }
        else 
        {
            System.out.println("Stack is empty");
           
        }
        
       while(!s2.empty())
        {
            s1.push(s2.pop());
        }
        return temp;
    }

public static void display()
{
    System.out.println("S1 : "+s1);
    
    System.out.println("S2 : "+s2);
}


    
	public static void main (String[] args) {
		insert(10);
		insert(20);
		display();
	System.out.println(delete());
		insert(30);
		display();
	}
}