/**
 * Created by kaijiezhou on 12/28/15.
 */
public class MaxProductofWordLen {
    public int maxProduct(String[] words) {
        int[] bitTable=new int[words.length];
        for(int i=0; i<words.length; i++){
            bitTable[i]=0;
            char[] cArray=words[i].toCharArray();
            for(char c: cArray){
                int bit=1<<(c-'a');
                if((bitTable[i]&bit)==0){
                    bitTable[i]+=bit;
                }
            }
        }
        int max=0;
        for(int i=0; i<words.length; i++){
            for(int j=i; j<words.length; j++){
                if((bitTable[i]&bitTable[j])==0){
                    max=Math.max(max, words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }
}
