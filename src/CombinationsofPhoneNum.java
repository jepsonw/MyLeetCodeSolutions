import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaijiezhou on 6/19/15.
 */
public class CombinationsofPhoneNum {
    public List<String> letterCombinations(String digits) {
        String[][] lib={{},{}, {"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        char[] digitArr=digits.toCharArray();
        List<String> store= Arrays.asList(lib[digitArr[0] - '0']);
        List<String> results=store;
        for(int i=1;i<digitArr.length;i++){
            results=new ArrayList<>();
            for(String letter:lib[digitArr[i]-'0']){
                for(String result:store){
                    results.add(result+letter);
                }
            }
            store=results;
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> result=new CombinationsofPhoneNum().letterCombinations("22");
        System.out.print(result);

    }
    //the problem can also be solved recursively.
    //In addition. this problem can also be seen as a map, and we can use DFS to find all possible collections.
}
