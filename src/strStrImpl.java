/**
 * Created by kaijiezhou on 6/28/15.
 */
public class strStrImpl {
    public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null||haystack.length()<needle.length()) return -1;
        if(needle.length()==0) return 0;
        char[] hayArray=haystack.toCharArray();
        char[] needleArray=needle.toCharArray();
        for(int i=0;i<=hayArray.length-needleArray.length;i++){
            if(hayArray[i]==needleArray[0]){
                int j=1;
                for(j=1;j<needleArray.length;j++){
                    if(needleArray[j]!=hayArray[i+j])
                        break;
                }
                if(j==needleArray.length) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new strStrImpl().strStr("a","a"));
    }
}
