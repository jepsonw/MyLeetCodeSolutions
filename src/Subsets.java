import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaijiezhou on 8/31/15.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for(int i=0;i<nums.length;i++){
            List<List<Integer>> copy=new ArrayList<>(result);
            for(List<Integer> cur:copy){
                List<Integer> elem=new ArrayList<>(cur);
                if(elem.size()==0||elem.get(elem.size()-1)<nums[i]){
                    elem.add(nums[i]);
                    result.add(elem);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3};
        System.out.println(new Subsets().subsets(nums));
    }
}
