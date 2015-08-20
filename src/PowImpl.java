/**
 * Created by kaijiezhou on 8/18/15.
 */
public class PowImpl {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n>0) return doPowAdd(x, n);
        else return 1/ doPowAdd(x, -n);
    }

    private double doPowAdd(double x, int n){
        if(n==0) return 1;
        double pow2=x*x;
        int count2=n/2;
        int remains=n%2;
        double result= doPowAdd(pow2, count2);
        if(remains==1) result*=x;
        return result;
    }

// copied from https://leetcode.com/discuss/51415/java-o-logn-solution
    public double myPow2(double x, int n) {
        if(Math.abs(x) == 1) return n % 2 == 0 ? 1 : x;
        if(n < 0) return 1 / doPowMulti(x, -n);
        if(n == 0) return 1;
        return doPowMulti(x, n);
    }

    private static double doPowMulti(double x, int index) {
        double remain = 1;
        while (index != 1) {
            double r = x;
            x = x * x;
            boolean hasRemain = index % 2 == 1;
            remain = remain * (hasRemain ? r : 1);
            index >>= 1;
        }
        return x * remain;
    }

    public static void main(String[] args) {
        System.out.println(new PowImpl().myPow(4.70975,-6));
        System.out.println(new PowImpl().myPow2(4.70975,-6));
    }
}
