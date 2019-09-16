/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	Stack<Integer> s=new Stack<Integer>();
  Scanner sc=new Scanner(System.in);
  String str=sc.next();
  char ch[]=str.toCharArray();
  
  for(int i=0;i<ch.length;i++)
  {
      if(Character.isDigit(ch[i]))
      s.push(Character.getNumericValue(ch[i]));
      
      else
      {
          int y=s.pop();
          int x=s.pop();
          int ans=0;
          
          if(ch[i]=='+')
          ans=x+y;
          else if(ch[i]=='-')
          ans=x-y;
          else if(ch[i]=='/')
          ans=x/y;
          else if(ch[i]=='*')
          ans=x*y;
          
         
       //  System.out.println("ans="+Character.getNumericValue(ans));
          s.push(ans);
          
          
       
      }
  }
  
  System.out.println(s.pop());
	}
}