import java.util.*;

/**
 * Created by kaijiezhou on 6/18/15.
 */
public class ThreeSum {
    public List<List<Integer>> threeSumHashMAp(int[] nums) {
        List<List<Integer>> results=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            List<List<Integer>> twoSumResults;
            if((twoSumResults=twoSum(nums,0-nums[i],i+1)).size()>0){
                System.out.println(twoSumResults.size());
                for(List<Integer> result:twoSumResults){
                    result.add(0,nums[i]);
                    results.add(result);
                }
            }
        }
        return results;

    }
    public List<List<Integer>> twoSum(int[]nums, int target,int startIndex){
        System.out.println("target="+target);
        Map<Integer,Integer> store=new HashMap<Integer,Integer>();
        List<List<Integer>> results=new ArrayList<>();
        for(int i=startIndex;i<nums.length;i++){
            store.put(nums[i],i);
        }
        System.out.println(store);
        for(int i=startIndex;i<nums.length;i++){
            Integer wantIndex;
            if((wantIndex=store.get(target-nums[i]))!=null&&wantIndex>i){
                System.out.println("match! "+nums[i]);
                List<Integer> result=new ArrayList<>();
                result.add(nums[i]);
                result.add(nums[wantIndex]);
                store.remove(target-nums[i]);
                results.add(result);
            }
        }
        return results;
    }

    public List<List<Integer>> threeSum(int[]nums){
        if(nums==null||nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> results=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1,right=nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]<0-nums[i]){
                   left=rightMove(nums,left);
                }else if(nums[left]+nums[right]>0-nums[i]){
                    right=leftMove(nums,right);
                }else{
                    List<Integer> result=new ArrayList<>();
                    result.add(nums[i]);
                    result.add((nums[left]));
                    result.add(nums[right]);
                    results.add(result);
                    left=rightMove(nums,left);
                    right=leftMove(nums, right);
                }
            }
            i=rightMove(nums,i)-1;
        }
        return results;
    }
    private int rightMove(int[]nums,int ptr){
        ++ptr;
        while(ptr<nums.length-1&&nums[ptr]==nums[ptr-1]) ++ptr;
        return ptr;
    }
    private int leftMove(int[]nums, int ptr){
        --ptr;
        while(ptr>0&&nums[ptr]==nums[ptr+1]) --ptr;
        return ptr;
    }

    public static void main(String[] args) {
        int[] nums={0,0,0};
        List<List<Integer>> results=new ThreeSum().threeSum(nums);
        for(List<Integer>result:results){
            System.out.print("[");
            for(Integer i:result){
                System.out.print(i+" ");
            }
            System.out.println("]");

        }
    }
}
