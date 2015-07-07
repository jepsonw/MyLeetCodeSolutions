import java.util.Stack;

/**
 * Created by kaijiezhou on 7/2/15.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        //todo
        int count=0,max=0;;
        char[] array=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<array.length;i++){
            switch(array[i]){
                case '(':
                    stack.push(')');
                    break;
                case ')':
                    if(stack.pop()==')'){
                        ++count;
                        max=max>count?max:count;
                    }else{
                        count=0;
                        stack.clear();
                    }
                    break;
            }
        }
        if(!stack.empty()){
            count-=stack.size();
            max=max>count?max:count;
        }
        return max;
    }
}
