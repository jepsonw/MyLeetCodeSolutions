/**
 * Created by kaijiezhou on 12/21/15.
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int[] bytesCounter= new int[32];
        for(int num: nums){
            int mask=1;
            for(int j=31; j>=0; j--){
                if((num&mask) != 0){
                    bytesCounter[j]+=1;
                }
                mask<<=1;
            }
        }
        int result=0;
        int lev=1;
        for(int j=31; j>=0; j--){
            if(bytesCounter[j]%3 != 0){
                result+=lev;
            }
            lev<<=1;
        }
        return result;
    }
}
