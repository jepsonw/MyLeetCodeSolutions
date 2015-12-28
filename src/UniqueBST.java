/**
 * Created by kaijiezhou on 12/25/15.
 */
public class UniqueBST{
    public int numTreesRecur(int n) {
        if(n==0) return 1;
        if (n<2) return n;
        int count=0;
        for(int i=1; i<=n;i++){
            int left=numTreesRecur(i-1);
            int right=numTreesRecur(n-i);
            count+=left*right;
        }
        return count;
    }
    public int numTrees(int n) {
        int[] table=new int[n+1];
        table[0]=1;
        for(int i=1; i<=n;i++){
            table[i]=0;
            for(int j=0; j<i;j++){
                table[i]+=(table[j]*table[i-j-1]);
            }
        }
        return table[n];
    }

}
