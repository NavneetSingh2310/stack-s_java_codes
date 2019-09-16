/*package whatever //do not write package name here */

import java.util.*;

class GFG {
     public static Stack<Integer> s1=new Stack<Integer>();
    
    public static void insert(int value)
    {
        s1.push(value);
    }
    
   
    public static void delete()
    {
        
        if(s1.size()!=1)
        {
            int x=s1.pop();
            delete();
             s1.push(x);
        }
        else{
            System.out.println(s1.pop());
        }
       
        
        
    }
	public static void main (String[] args) {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		
		delete();
		
		System.out.print(s1);
	}
}