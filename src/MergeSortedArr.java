/**
 * Created by kaijiezhou on 12/30/15.
 */
public class MergeSortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                insert(nums1, i, nums2[j]);
                ++m;
                ++j;
            }
            ++i;
        }
        while(j<n){
            nums1[i]=nums2[j];
            ++i;
            ++j;
        }

    }

    private void insert(int[]nums, int index, int val){
        int tmp=val;
        for(int i=index; i<nums.length; i++){
            int cache=nums[i];
            nums[i]=tmp;
            tmp=cache;
        }
    }
}
