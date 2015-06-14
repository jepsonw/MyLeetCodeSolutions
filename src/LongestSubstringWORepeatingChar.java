import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by kaijiezhou on 6/1/15.
 */
public class LongestSubstringWORepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")||s==null) return 0;
        char[] array=s.toCharArray();
        int start=0, end=0, max=1;
        Set<Character> dupHash=new HashSet<>();
        while(end<s.length()){
            System.out.println("start: "+start+" end: "+end);
            if(!dupHash.add(array[end])){
                //has duplicate
                max=max>(end-start)?max:(end-start);
                while(!dupHash.add(array[end])){
                    dupHash.remove(array[start++]);
                }
            }
            ++end;
        }
        max=max>(end-start)?max:(end-start);
        return max;
    }

    public int lengthOfLongestSubstringHashMap(String s){
        if(s.equals("")||s==null) return 0;
        char[] array=s.toCharArray();
        int start=0,max=1;
        Map<Character,Integer> dupHash=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(dupHash.containsKey(array[i])){
                int position=dupHash.get(array[i]);
                if(position>=start){
                    max=max>(i-start)?max:(i-start);
                    start=position+1;
                }
            }
            dupHash.put(array[i],i);
        }
        max=max>(array.length-start)?max:(array.length-start);
        return max;
    }

    public int lengthOfLongestSubstring2(String s){
        char[] array=s.toCharArray();

        return 0;
    }

    public static void main(String[] args) {
       // System.out.println(new LongestSubstringWORepeatingChar().lengthOfLongestSubstring("siwuoqongfkcpnuhxhftslchluifdlevvcrjufydkkhbxblw"));
        System.out.println(new LongestSubstringWORepeatingChar().lengthOfLongestSubstringHashMap("auu"));

    }
}
