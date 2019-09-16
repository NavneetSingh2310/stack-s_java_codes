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
  
  for(int i=ch.length-1;i>=0;i--)
  {
      if(Character.isAlphabetic(ch[i]))
      s.push(Character.toString(ch[i]));
      
      else
      {
          String x=s.pop();
          String y=s.pop();
          
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