import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaijiezhou on 7/27/15.
 */
public class Permutations {
    private List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result=new ArrayList<>();
        List<Integer> seed=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            seed.add(i,nums[i]);
        }
        System.out.println(seed);
        result.add(new ArrayList<Integer>(seed));
        genPermute(seed);
        return result;
    }
    private void genPermute(List<Integer> seed){
        int i=seed.size()-2;
        while(i>=0&&seed.get(i)>seed.get(i+1)){
            i--;
        }
        if(i==-1) return;
        int j;
        for(j=seed.size()-1;j>i;j--){
            if(seed.get(j)>seed.get(i)) break;
        }
        swap(seed,i,j);
        revert(seed,i+1,seed.size()-1);
        result.add(new ArrayList<Integer>(seed));
        genPermute(seed);

    }
    private void swap(List<Integer> nums, int i, int j){
        int temp=nums.get(i);
        nums.set(i,nums.get(j));
        nums.set(j,temp);
    }
    private void revert(List<Integer> nums, int start, int end){
        while(start<end){
            swap(nums,start, end);
            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        int[] nums={0,-1,2};
        System.out.println(new Permutations().permute(nums));
    }

}
