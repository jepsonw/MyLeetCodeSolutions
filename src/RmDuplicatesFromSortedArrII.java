/**
 * Created by kaijiezhou on 10/1/15.
 */
public class RmDuplicatesFromSortedArrII {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;
        int tail=0, cur=1, remain=1, length=1;
        while(cur<nums.length){
            if(nums[tail]==nums[cur]&&remain>0){
                --remain;
                nums[++tail]=nums[cur++];
                ++length;
            }else if(nums[tail]!=nums[cur]){
                remain=1;
                nums[++tail]=nums[cur++];
                ++length;
            }else{
                cur++;
            }
        }
        return length;
    }
}
