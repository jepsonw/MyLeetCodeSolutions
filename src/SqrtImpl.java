/**
 * Created by kaijiezhou on 15-8-21.
 */
public class SqrtImpl {
    public int mySqrtNaive(int x) {
        int i;
        for(i=0;i*i<=x;i++){
        }
        return i-1;
    }
    public int mySqrt(int x){
        if(x==0||x==1) return x;
        int start=1, end=x;
        int posResult=start;
        while(start<end){
            int candidate=(start+end)/2;
            if((x/candidate)<candidate){
                end=candidate;
            }else if((x/candidate)>candidate){
                start=candidate+1;
            }else{
                return candidate;
            }
        }
        return start-1;
    }
}
