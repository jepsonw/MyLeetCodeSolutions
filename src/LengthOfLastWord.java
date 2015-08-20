/**
 * Created by kaijiezhou on 8/19/15.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        char[] array=s.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i]==' ') count=0;
            else ++count;
        }
        return count;
    }

    public int lengthOfLastWord2(String s) {
        s=s.trim();
        String[] arr=s.split(" ");
        return arr[arr.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("a "));
    }
}
