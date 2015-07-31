import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaijiezhou on 7/2/15.
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2,j=nums.length-1;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i==-1){
            revert(nums,0,nums.length-1);
            return;
        }
        for(j=nums.length-1;j>i;j--){
            if(nums[j]>nums[i]){
                break;
            }
        }
        swap(nums,i,j);
        revert(nums,i+1,nums.length-1);

    }
    private void swap(int[]nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    private void revert(int[]nums, int start, int end){
        while(start<end) {
            swap(nums, start, end);
            ++start;
            --end;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,3,4,2};
        new NextPermutation().nextPermutation(nums);
        for(int i:nums){
            System.out.println(i);
        }


    }
}
