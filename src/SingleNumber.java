/**
 * Created by kaijiezhou on 12/21/15.
 */
public class SingleNumber {

    public int singleNumberLSpaceLTime(int[] nums) {
        int j=0;
        for(int i: nums){
            // ^ is xor
            j ^= i;
        }
        return j;
    }
}
