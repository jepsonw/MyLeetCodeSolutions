/**
 * Created by kaijiezhou on 6/15/15.
 */
public class LongestPalidromicSubstr {
    public String longestPalindrome(String s) {
        if(s==null||s.equals("")||s.length()==1) return s;
        char[]array=s.toCharArray();
        System.out.println("total length:"+array.length);
        int max=1, startIndex=0;
        boolean twoMid=(array[0]==array[1]);
        if(twoMid) max=2;
        for(int i=1;i<array.length-1;i++){
            int j=1, k=1, length=1;
            boolean isTwoMid=false;
            int maxDist=min(i,array.length-1-i);
            while(j<=i&&array[i]==array[i-j]){
                length++;
                isTwoMid=!isTwoMid;
                j++;
            }
            while(k<array.length-i&&array[i]==array[i+k]){
                ++length;
                isTwoMid=!isTwoMid;
                ++k;
            }
            for(;j<=i&&k<array.length-i;j++,k++){
                if(array[i-j]!=array[i+k])
                    break;
                length+=2;
            }
            if(length>max){
                max=length;
                startIndex=i-j+1;
                twoMid=isTwoMid;
            }
        }
       System.out.println(max+", "+startIndex+", "+ twoMid);
        return s.substring(startIndex, startIndex + max);
    }
    private int min(int a, int b){
        return a>b?b:a;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalidromicSubstr().longestPalindrome("aaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaa"));
    }
}
