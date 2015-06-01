import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kaijiezhou on 5/24/15.
 */
public class TwoSum {
    public int[] twoSumNaive(int[] nums, int target){
        if(nums.length==0) return null;
        int[] results=new int[2];
        for(int i=0;i<nums.length-1;i++){
            results[0]=i+1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==(target-nums[i])){
                    results[1]=j+1;
                    return results;
                }
            }
        }
        return null;
    }

    public int[] twoSum1(int[]nums, int target){
        if(nums.length==0) return null;
        Map<Integer,Integer> store=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            store.put(target-nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(store.get(nums[i])!=null&&store.get(nums[i])!=i){
                int [] results={i+1,store.get(nums[i])+1};
                return results;
            }
        }
        return null;
    }

    //this method only returns numbers not indexes
    public int[] twoSumReturnsNum(int[]nums, int target){
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            int store=nums[i]+nums[j];
            if(store<target){
                ++i;
            }else if (store>target){
                --j;
            }else{
                int[]results={nums[i],nums[j]};
                return results;
            }

        }
        return null;
    }
}
