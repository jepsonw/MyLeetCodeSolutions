import java.util.*;
/**
 * Created by kaijiezhou on 1/3/16.
 */
public class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        if(k==1){
            for(int i=1;i<=n;i++){
                List<Integer> list=new ArrayList<>();
                list.add(i);
                result.add(list);
            }
        }else{
            List<List<Integer>> last=combine(n,k-1);
            for(int i=1;i<=n;i++){
                for(List<Integer> com:last){
                    if(com.contains(i)) continue;
                    if(com.get(0)<i) continue;
                    List<Integer> list=new ArrayList<>(com);
                    list.add(0,i);
                    result.add(list);
                }
            }
        }
        return result;
    }
}
