/**
 * Created by kaijiezhou on 6/28/15.
 */
public class DivideTwoInts {
    public int divideNaive(int dividend, int divisor) {
        //TODO
        if(divisor==0) return Integer.MAX_VALUE;
        if(dividend==0) return 0;
        boolean sameSign=true;
        boolean posDiv=dividend>0;
        if((dividend<0&&divisor>0)||(dividend>0&&divisor<0))
            sameSign=false;
        int quotient=sameSign?-1:1;
        do{
            if(sameSign){
                if((long)quotient+1l>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                ++quotient;
                dividend-=divisor;
            }else{
                if((long)quotient-1l<Integer.MIN_VALUE)
                    return Integer.MAX_VALUE;
                --quotient;
                dividend+=divisor;
            }

        }while((posDiv&&dividend>=0)||(!posDiv&&dividend<=0));
        return quotient;
    }
    /*This Algorithm works just like what we do when dividing numbers.
    follow this instruction: https://leetcode.com/discuss/16208/my-fast-solution-using-bit-operation-36ms
    * As for any integer can be writen by 2n+1 or 2n. Think about 123/5:
    divisor dividend

    5 123

    <<1

    <<1

    <<1

    <<1

    5*16 = 80

    5 123-80=43

    <<1

    <<1

    <<1

    5*8 = 40

    5 43-40=3

    5<3, thus result = 16+8 = 24

    (if dividend == 125, finally we have:)

    5==5, thus result = 16+8+1 = 25;
    */
    public int divide(int dividend, int divisor){
        if(divisor==0) return Integer.MAX_VALUE;
        boolean sameSign=(dividend>0&&divisor>0)||(dividend<0&&divisor<0);
        long dividendL=Math.abs((long)dividend);
        long divisorL=Math.abs((long)divisor);
        long result=0;
        while(divisorL<=dividendL){
            long temp=divisorL;
            long resultPart=1;
            while(temp<=dividendL){
                temp<<=1;
                resultPart<<=1;
            }
            temp>>=1;
            resultPart>>=1;
            dividendL-=temp;
            result+=resultPart;
            //if(result>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        if(!sameSign){
            result=-result;
            if(result<Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
        }else if(result>=Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return (int)result;

    }

    public static void main(String[] args) {
        System.out.println(new DivideTwoInts().divide(-2147483648, 1));
    }
}
