import java.math.BigInteger;

/**
 * Created by kaijiezhou on 6/13/15.
 */
public class String2Int {
    public int myAtoiTail(String str) {
        if(str==null) return 0;
        str=str.trim();
        if(str.equals("")) return 0;
        int level=1;
        int result=0, sign=1;
        switch(str.charAt(0)){
            case '-':
                sign=-1;
                break;
            case '+':
                if(str.charAt(1)>'9'||str.charAt(1)<'0')
                    return 0;
                break;
            default:
                if(str.charAt(0)>'9'||str.charAt(0)<'0')
                    return 0;

        }
        for(int i=str.length()-1;i>=0;i--){
            char c =str.charAt(i);
            if(c<='9'&&c>='0'){
                long overFlowTest=(long)result+(long)((c-'0')*level*sign);
                System.out.print("Add :" + (long) ((c - '0') * level * sign) + ", long->"+overFlowTest+", ");
                if(overFlowTest>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }else if(overFlowTest<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                result=(int)overFlowTest;
                System.out.println(result);
                level*=10;
            }else{
                switch(c){
                    case '-':
                        if(i==0)
                            break;
                    case '+':
                        if(i==0)
                            break;
                    default:
                        result=0;
                        level=1;
                        break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new String2Int().myAtoi("    10522545459"));
    }

    public int myAtoi(String str) {
        if(str==null||str.equals("")) return 0;
        int result=0,sign=1;
        boolean done=false;
        str=str.trim();
        char[] array=str.toCharArray();
        for(int i=0;i<array.length;i++){
            switch(array[i]){
                case '-':
                    if(i==0){
                        sign=-1;
                        break;
                    }
                case '+':
                    if(i==0){
                        break;
                    }
                default:
                    if(array[i]<='9'&&array[i]>='0'){
                        long oFlowTest=(long)result*10+(long)((array[i]-'0')*sign);
                        if(oFlowTest>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                        else if(oFlowTest<Integer.MIN_VALUE) return Integer.MIN_VALUE;
                        result=(int)oFlowTest;
                    }else
                        done=true;
            }
            if(done){
                break;
            }
        }
        return result;
    }
}
