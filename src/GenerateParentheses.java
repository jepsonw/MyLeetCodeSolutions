import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaijiezhou on 6/27/15.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> results=new ArrayList<>();
        if(n<=0) {
            results.add("");
            return results;
        }
        if(n==1){
            results.add("()");
            return results;
        }
        for(int i=0;i<n;i++){
            List<String> left=generateParenthesis(i);
            List<String> right=generateParenthesis(n-i-1);
            for(String sl:left){
                for(String sr:right){
                    results.add("("+sl+")"+sr);
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(new GenerateParentheses().generateParenthesis(3));
    }
}
