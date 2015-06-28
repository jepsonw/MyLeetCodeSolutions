/**
 * Created by kaijiezhou on 6/28/15.
 */
public class DivideTwoInts {
    public int divide(int dividend, int divisor) {
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

    public static void main(String[] args) {
        System.out.println(new DivideTwoInts().divide(-2147483648, -1));
    }
}
