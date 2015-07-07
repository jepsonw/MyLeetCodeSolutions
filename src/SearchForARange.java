/**
 * Created by kaijiezhou on 7/3/15.
 */
public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[]result={-1,-1};
        if(nums==null||nums.length==0) return result;
        int i=findPos(nums,target,0,nums.length-1);
        if(i==-1) return result;
        int j=i;
        for(;i>0;i--){
            if(nums[i-1]!=target) break;
        }
        for(;j<nums.length-1;j++){
            if(nums[j+1]!=target) break;
        }
        result[0]=i;
        result[1]=j;
        return result;

    }
    private int findPos(int[]nums,int target, int start,int end){
        int mid=(start+end)/2;
        if(target==nums[mid]){
            return mid;
        }else if(mid==start&&mid==end){
            return -1;
        }else if(target>nums[mid]){
            return findPos(nums,target,mid+1,end);
        }else{
            return findPos(nums,target,start,mid);
        }
    }
}
