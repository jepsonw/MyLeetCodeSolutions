import java.util.*;

/**
 * Created by kaijiezhou on 1/1/16.
 */
public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums==null||nums.length==0) return null;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> each=new ArrayList<>();
        Arrays.sort(nums);
        helper(result, each, 0, nums);
        return result;
    }

    private void helper(List<List<Integer>> res, List<Integer> each, int start, int[] nums){
        res.add(each);
        while(start < nums.length){
            each.add(nums[start]);
            helper(res, new ArrayList<>(each), start+1, nums);
            each.remove(each.size()-1);
            ++start;
            while(start<nums.length && nums[start]== nums[start-1]) ++start;
        }
    }


}
