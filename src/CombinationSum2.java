import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaijiezhou on 7/9/15.
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> result=new ArrayList<>();
        List<List<Integer>> results=new ArrayList<>();
        findSum(results,result, candidates, target,0);
        return results;

    }

    //Function using DFS
    private void findSum(List<List<Integer>> results, List<Integer> result, int[] candidates, int target, int startIndex){
        if(target==0){
            /*List.contains will call object.equals
            * List.equals returns true only when l.length==l2.length && all elems are equals
            * */
            if(!results.contains(result))
                /*We must create a new array,
                otherwise, it'll be changed by the following operation.
                The param "result" here is a pointer to a single array
                */
                results.add(new ArrayList(result));
        }else if(target>0){
            for(int i=startIndex;i<candidates.length;i++){
                result.add(candidates[i]);
                findSum(results, result, candidates, target-candidates[i],i+1);
                result.remove(result.size()-1);
            }
        }

    }
}
