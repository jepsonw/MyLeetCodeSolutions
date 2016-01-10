import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaijiezhou on 12/30/15.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<>();
        if(n<1){
            result.add(0);
            return result;
        }
        List<Integer> lastResult= grayCode(n-1);
        result.addAll(lastResult);
        for(int i=lastResult.size()-1; i>=0;i--){
            result.add((1<<(n-1))+ lastResult.get(i));
        }
        return result;
    }


}
