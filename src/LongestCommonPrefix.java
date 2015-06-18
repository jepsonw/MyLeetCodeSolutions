/**
 * Created by kaijiezhou on 6/17/15.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String longestPrefix=strs[0];
        for(int i=1;i<strs.length;i++){
            longestPrefix=getCommonPrefix(longestPrefix,strs[i]);
            if(longestPrefix.length()==0) break;
        }
        return longestPrefix;
    }
    private String getCommonPrefix(String str1, String str2){
        if(str1==null||str2==null||str1.equals("")||str2.equals("")) return "";
        char[] array1=str1.toCharArray();
        char[] array2=str2.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array1.length&&i<array2.length;i++){
            if(array1[i]==array2[i])
                sb.append(array1[i]);
            else
                break;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs={"abaa","ccaa"};

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }
}
