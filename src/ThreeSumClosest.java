import java.util.Arrays;

/**
 * Created by kaijiezhou on 6/19/15.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length < 3) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum;
        }
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1, min = Integer.MAX_VALUE, result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) {
                    //left=rightMove(nums, left);
                    ++left;
                } else if (sum > target) {
                    // right=leftMove(nums,right);
                    --right;
                } else {
                    return target;
                }
                if (min > Math.abs(target - sum)) {
                    min = Math.abs(target - sum);
                    result = sum;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[]nums={87,6,-100,-19,10,-8,-58,56,14,-1,-42,-45,-17,10,20,-4,13,-17,0,11,-44,65,74,-48,30,-91,13,-53,76,-69,-19,-69,16,78,-56,27,41,67,-79,-2,30,-13,-60,39,95,64,-12,45,-52,45,-44,73,97,100,-19,-16,-26,58,-61,53,70,1,-83,11,-35,-7,61,30,17,98,29,52,75,-73,-73,-23,-75,91,3,-57,91,50,42,74,-7,62,17,-91,55,94,-21,-36,73,19,-61,-82,73,1,-10,-40,11,54,-81,20,40,-29,96,89,57,10,-16,-34,-56,69,76,49,76,82,80,58,-47,12,17,77,-75,-24,11,-45,60,65,55,-89,49,-19,4};
        int target=-275;
        System.out.println(new ThreeSumClosest().threeSumClosest(nums,target));
    }
}
