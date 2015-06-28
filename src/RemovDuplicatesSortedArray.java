/**
 * Created by kaijiezhou on 6/28/15.
 */
public class RemovDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return 1;
        int length=1;
        int cur=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[cur]){
                nums[++cur]=nums[i];
                ++length;
            }
        }
        return length;
    }
}
