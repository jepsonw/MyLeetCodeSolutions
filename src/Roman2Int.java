import java.util.HashMap;
import java.util.Map;

/**
 * Created by kaijiezhou on 6/17/15.
 */
public class Roman2Int {
    Map<Character,Integer> romanLib;
    public int romanToInt(String s) {
        char[]array=s.toCharArray();
        initLib();
        int num=0;
        for(int i=array.length-1;i>=0;i--){
            Integer curNum=romanLib.get(array[i]);
            if(i-1>=0&&romanLib.get(array[i-1])<curNum){
                curNum-=romanLib.get(array[i-1]);
                --i;
            }
            num+=curNum;
        }
        return num;
    }
    private void initLib(){
        romanLib=new HashMap<>();
        romanLib.put('I', 1);
        romanLib.put('V', 5);
        romanLib.put('X',10);
        romanLib.put('L',50);
        romanLib.put('C',100);
        romanLib.put('D',500);
        romanLib.put('M',1000);
    }
}
