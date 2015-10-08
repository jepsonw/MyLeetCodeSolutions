/**
 * Created by kaijiezhou on 10/4/15.
 */
public class SearchinRotatedSortArrII {
    public boolean search(int[] nums, int target) {
        int cur=0,prev=0;
        if(nums[cur]==target){
            return true;
        }else if(nums[cur]>target){
            cur=nums.length-1;
            while(cur>0&&nums[cur]<=nums[prev]){
                if(nums[cur]==target){
                    return true;
                }else if(nums[cur]<target){
                    return false;
                }
                prev=cur;
                --cur;
            }
        }else{
            ++cur;
            while(cur<nums.length&&nums[cur]>=nums[prev]){
                if(nums[cur]==target){
                    return true;
                }else if(nums[cur]>target){
                    return false;
                }
                prev=cur;
                ++cur;
            }

        }
        return false;
    }
}
