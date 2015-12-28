/**
 * Created by kaijiezhou on 12/21/15.
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums){
            xor ^= num;
        }
        int devider = 1;
        while(true){
            if((xor & devider)!=0){
                break;
            }
            devider<<=1;
        }
        int group1=0;
        int group2=0;
        for(int num: nums){
            if((num&devider)!=0){
                group1 ^= num;
            }else{
                group2 ^= num;
            }
        }
        return new int[] {group1, group2};

    }
}
