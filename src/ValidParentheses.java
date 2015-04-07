import java.util.Stack;


public class ValidParentheses {

		 public boolean isValid(String s) {
		        Stack<Character> stack =new Stack<Character>();
		        for(int i=0;i<s.length();i++){
		            char c=s.charAt(i);
		            switch(c){
		            case '(':
		                stack.push(')');
		                break;
		            case '{':
		                stack.push('}');
		                break;
		            case '[':
		                stack.push(']');
		                break;
		            case ']':
		            case '}':
		            case ')':
		                if(stack.isEmpty()||c!=stack.pop())
		                    return false;
		            }
		        }
		        if(stack.isEmpty())
		            return true;
		        return false;
		    }
		 public static void main(String[]args){
			 System.out.println(new ValidParentheses().isValid("]"));
		 }
}

