/**
 * Created by kaijiezhou on 6/1/15.
 */
public class LongestSubstringWORepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        //TODO
        if(s.equals("")||s==null) return 0;
        int i,j;
        int max=1;
        boolean hasDup=false;
        for(i=0;i<s.length()-1;i++){
            int length=0;
            System.out.println("i->"+s.charAt(i));
            for(j=i+1;j<s.length();j++){
                System.out.println("j->"+s.charAt(j));
                if(s.charAt(i)==s.charAt(j)){
                    max=max>(j-i)?max:(j-i);
                    System.out.println(i+" and "+j+" are duplicated, Max: "+max);
                    hasDup=true;
                    break;
                }else{
                    ++length;
                }
            }
            max=max>length?max:length;
            System.out.println("Max: "+max);
            if(!hasDup){
                break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new LongestSubstringWORepeatingChar().lengthOfLongestSubstring("abcabcbb");
    }
}
