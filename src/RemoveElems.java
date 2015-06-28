/**
 * Created by kaijiezhou on 6/28/15.
 */
public class RemoveElems {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0) return 0;
        int length=0;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[cur++]=nums[i];
                ++length;
            }
        }
        return length;
    }
}
