import java.util.*;

/**
 * Created by kaijiezhou on 8/17/15.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        Arrays.sort(strs);
        for(String str:strs){
            char[] strAr=str.toCharArray();
            Arrays.sort(strAr);
            String key=new String(strAr);
            System.out.println(key);
            if(map.containsKey(key)){
                result.get(map.get(key)).add(str);
            }else{
                List<String> list=new ArrayList<>();
                list.add(str);
                result.add(list);
                map.put(key,result.size()-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs={"",""};
        System.out.println(new GroupAnagrams().groupAnagrams(strs));
    }


}
