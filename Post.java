import java.util.*;

class Post{
	public static int precedence(char c){
		int a=0;
		switch(c){
			case '^': a = 3;
			break;
			case '/': a = 2;
			break;
			case '*': a = 2;
			break;
			case '+': a = 1;
			break;
			case '-': a = 1;
			break;
		}
		return a;
	}
	public static String postfix(String str){
		Stack<Character> stack = new Stack<Character>();
		//System.out.print(postfix(str));
		stack.push('(');
		str+=')';
		String result = "";
		char[] c = str.toCharArray();
		for (int i=0; i<c.length ;i++ ) {
			if(c[i]=='(') stack.push(c[i]);
			else if(Character.isLetterOrDigit(c[i])) result+=c[i];
			else if(c[i]==')'){
				while(stack.peek()!='('){
					result+=stack.pop();
				}
				stack.pop();
			}
			else{
				while(precedence(stack.peek())>=precedence(c[i])){
					result+=stack.pop();
				}
				stack.push(c[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(postfix(str));
	}
}