//implementing stack using one queue

import java.util.*;

class GFG {
     public static Queue<Integer> q1=new LinkedList<Integer>();
     
    
    public static void insert(int value)
    {
       q1.add(value);
       int size=q1.size();
       for(int i=0;i<size-1;i++)
       {
           q1.add(q1.remove());
       }
    }
    
    public static void delete()
    {
        System.out.println("Deleted element is :"+q1.remove());
    }
   
   	public static void main (String[] args) {
		insert(10);
		insert(20);
		insert(30);
		System.out.println(q1);
		delete();
		delete();
		System.out.println(q1);
		
	}
}