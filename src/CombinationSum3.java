import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaijiezhou on 1/7/16.
 */
public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> results=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        helper(results, result, k, n, 0);
        return results;
    }

    private void helper(List<List<Integer>> results, List<Integer> result, int k, int n, int pos){
        if(n < pos || k < 0) return;

        if(k>0){
            for(int i=pos+1; i<=9; i++){
                result.add(i);
                helper(results, result, k-1, n-pos, i);
                result.remove(result.size()-1);
            }
        }else if(n==pos){
            if(! results.contains(result)){
                results.add(new ArrayList<>(result));
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(new CombinationSum3().combinationSum3(3,7));
    }
}
