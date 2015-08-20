/**
 * Created by kaijiezhou on 8/18/15.
 */
public class MaxSubarray {
    public int maxSubArray2D(int[] nums) {
        int n=nums.length;
        int T[][]=new int[n][n];
        for(int i=0;i<n;i++){
            T[i][i]=nums[i];
        }
        for(int gap=1;gap<n;gap++){
            for(int i=0;i+gap<n;i++){
                int j=i+gap;
                T[i][j]=max(T[i][j-1],T[i+1][j],T[i][j-1]+nums[j]);
            }
        }
        return T[0][n-1];
    }

    private int max(int a, int b, int c){
        int max=a>b?a:b;
        max=max>c?max:c;
        return max;
    }

    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[]max=new int[n];
        int maxNum=nums[0];
        max[0]=nums[0];
        for(int i=1;i<n;i++){
            max[i]=max(nums[i],max[i-1]+nums[i]);
            maxNum=max(max[i],maxNum);
        }
        return maxNum;
    }
    private int max(int a, int b){
        return a>b?a:b;
    }

    public static void main(String[] args) {
        int[]nums2={-113,1,3,9,-3,129};
        //System.out.println(new MaxSubarray().maxSubArray(nums));
        System.out.println(new MaxSubarray().maxSubArray(nums2));
    }
}
