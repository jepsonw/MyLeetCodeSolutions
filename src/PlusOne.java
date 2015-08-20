/**
 * Created by kaijiezhou on 15-8-20.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int sum=digits[digits.length-1]+1;
        digits[digits.length-1]=sum%10;
        int carry=sum/10;
        for(int i=digits.length-2;i>=0;i--){
            sum=digits[i]+carry;
            carry=sum/10;
            digits[i]=sum%10;
        }
        int[]result;
        if(carry>0){
            result= new int[digits.length+1];
            for(int i=result.length-1;i>0;i--){
                result[i]=digits[i-1];
            }
            result[0]=carry;
        }else{
            result=digits;
        }
        return result;

    }
}
