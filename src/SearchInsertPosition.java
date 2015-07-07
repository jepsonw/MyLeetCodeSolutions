/**
 * Created by kaijiezhou on 7/3/15.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums==null&&nums.length==0) return 0;
        int index=binarySearch(nums,target,0,nums.length-1);
        if(nums[index]>target) return index+1;
        else return index;
    }
    private int binarySearch(int[]nums, int target, int start, int end){
        int mid=(start+end)/2;
        if(nums[mid]==target){
            return mid;
        }else if(mid==start&&mid==end){
            return mid;
        }else if(nums[mid]>target){
            return binarySearch(nums,target,start,mid);
        }else{
            return binarySearch(nums,target,mid+1,end);
        }
    }
}
