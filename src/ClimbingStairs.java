/**
 * Created by kaijiezhou on 15-8-21.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int [] store=new int[n];
        if(n<=1) return 1;
        store[store.length-1]=1;
        store[store.length-2]=1;
        for(int i=store.length-3;i>=0;i--){
            store[i]=store[i+1]+store[i+2];
        }
        return store[0];
    }
}
