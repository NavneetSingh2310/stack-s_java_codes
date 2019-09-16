/*package whatever //do not write package name here */

/*import java.io.*;



class GFG {
    
public static int top=-1;
public static int size=10;
public static int a[]=new int[size];

    public static void push(int value)
	{
	    if(top<size)
	    a[top++]=value;
	    else 
	    System.out.println("Full");
	}

	
	public static void pop()
	{
	    if(top<0)
	    System.out.println("Empty");
	    else top--;
	}
	public static void main (String[] args) {
           
	
               for(int i=0;i<size;i++)
               {
                   push(i);
               }
               
  

	}
}*/

import java.util.*;
import java.io.*;

class stack1 {
    
   /* public static void copy(Stack<Integer> s1,Stack<Integer> s2)
    {
        int size1=s1.size();
        Stack<Integer> s3=new Stack<Integer>();
        for(int i=0;i<size1;i++)
        {
            s3.push(s1.pop());
        }
        
        for(int i=0;i<size1;i++)
        {
            s2.push(s3.pop());
        }
    }
    
    public static void display(Stack<Integer> s)
    {
        for(int i=0;i<s.size();i++)
        {
            System.out.print(s.get(i)+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s1.push(i);
        }
        
        display(s1);
        
        copy(s1,s2);
       
        
        display(s2);
    }*/
    
    //*******************************************************
    //*******************************************************
    //*******************************************************
    
    
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<Character> s1=new Stack<Character>();
       Stack<Character> s2=new Stack<Character>();
       
        while(true)
        {
            Character ch=sc.next().charAt(0);
            /*if(ch=='(')
            s1.push(ch);
            else if(ch==')')
            s2.push(ch);
            */
            if(ch=='q')
            break;
            else
            s1.push(ch);
           
        }
        
       /* for(int i=0;i<s2.size();i++)
        {
            s1.pop();
        }*/
        
        if(s1.isEmpty())
        System.out.println("Balanced");
        else
        System.out.print("Not Balanced");
       
        
        
    }
    
}















