import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kaijiezhou on 15-8-20.
 */
public class PermutationSequence {
    Map<Integer,Integer> factMap=new HashMap<>();
    public String getPermutation(int n, int k) {
        if(n==1&&k==1) return Integer.toString(1);
        List<String> numStrs=new ArrayList<>();
        StringBuilder result=new StringBuilder();
        initFactMap(n);
        for(int i=1;i<=n;i++){
            numStrs.add(Integer.toString(i));
        }
        int lastFact=1;
        if(n>1) lastFact=factMap.get(--n);
        int count=k/lastFact;
        while(k%lastFact>0){
            result.append(numStrs.get(count));
            numStrs.remove(count);
            k%=lastFact;
            if(n>1) lastFact=factMap.get(--n);
            count=k/lastFact;
        }
        result.append(numStrs.get(count-1));
        numStrs.remove(count-1);
        for(int i=numStrs.size()-1;i>=0;i--){
            result.append(numStrs.get(i));
        }
        return result.toString();
    }
    private void initFactMap(int size){
        int product=1;
        for(int i=1;i<=size;i++){
            product*=i;
            factMap.put(i,product);
        }
    }
}
