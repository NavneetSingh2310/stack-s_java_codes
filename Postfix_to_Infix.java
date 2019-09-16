/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	Stack<String> s=new Stack<String>();
  Scanner sc=new Scanner(System.in);
  String str=sc.next();
  String snew="";
  char ch[]=str.toCharArray();
  
  for(int i=0;i<ch.length;i++)
  {
      if(Character.isAlphabetic(ch[i]))
      s.push(Character.toString(ch[i]));
      
      else
      {
          String y=s.pop();
          String x=s.pop();
          
          String open="(";
          String close=")";
          
          String salter="";
          
          salter=open+x+ch[i]+y+close;
          
          s.push(salter);
          
          
       
      }
  }
  
  System.out.println(s.pop());
}
}