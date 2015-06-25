import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaijiezhou on 6/25/15.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results=new ArrayList<>();
        if(nums==null||nums.length<4) return results;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int twoSumTarget=target-nums[i]-nums[j];
                int left=j+1,right=nums.length-1;
                while(left<right){
                    if(nums[left]+nums[right]>twoSumTarget){
                        right=leftMove(nums,right);
                    }else if(nums[left]+nums[right]<twoSumTarget){
                        left=rightMove(nums,left);
                    }else{
                        List<Integer> result=new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[left]);
                        result.add(nums[right]);
                        results.add(result);
                        right=leftMove(nums,right);
                        left=rightMove(nums, left);
                    }
                }
                j=rightMove(nums,j)-1;
            }
            i=rightMove(nums,i)-1;
        }
        return results;
    }

    private int rightMove(int[]nums, int ptr){
        ptr++;
        while(ptr<nums.length-1&&nums[ptr]==nums[ptr-1]) ptr++;
        return ptr;
    }
    private int leftMove(int[]nums,int ptr){
        ptr--;
        while(ptr>0&&nums[ptr]==nums[ptr+1]) ptr--;
        return ptr;
    }

    public static void main(String[] args) {
        int[]nums={0,4,-2,-3,-2,-3,-2};
        int target=-1;
        System.out.println(new FourSum().fourSum(nums,target));
    }
}
