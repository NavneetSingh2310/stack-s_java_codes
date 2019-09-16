/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int op=0;
		int cp=0;
		char ch[]=str.toCharArray();
		int n=ch.length;
		for(int i=0;i<n;i++)
		{
		   if(ch[i]=='(')
		   op++;
		   else if(ch[i]==')')
		   {
		       if(op>0)
		       op--;
		       else
		       cp++;
		   }
		   
		   
		}
		
		int ans=(op/2)+(cp/2);
		if(op%2==0 && cp%2==0 )
		System.out.println(ans);
		else if(cp%2==1 || op%2==1)
		System.out.println(ans+2);
		
        


    }
}
