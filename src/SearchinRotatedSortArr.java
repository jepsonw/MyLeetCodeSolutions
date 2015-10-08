/**
 * Created by kaijiezhou on 10/4/15.
 */
public class SearchinRotatedSortArr {
    public int search(int[] nums, int target) {
        int prev=0, cur=0;
        if(nums[cur]==target){
            return cur;
        }else if(nums[cur]>target){
            cur=nums.length-1;
            while(cur>=0&&nums[cur]<nums[prev]){
                if(nums[cur]==target){
                    return cur;
                }else if(nums[cur]<target){
                    return -1;
                }
                prev=cur;
                --cur;
            }
        }else{
            ++cur;
            while(cur<nums.length&&nums[cur]>nums[prev]){
                if(nums[cur]==target){
                    return cur;
                }else if(nums[cur]>target){
                    return -1;
                }
                prev=cur;
                ++cur;
            }
        }
        return -1;
    }
}
