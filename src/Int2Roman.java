/**
 * Created by kaijiezhou on 6/17/15.
 */
public class Int2Roman {
    public String intToRoman(int num) {
        if(num==0) return null;
        StringBuilder sb=new StringBuilder();
        //handle 1000-level
        for(int i=0;i<num/1000;i++){
            sb.append("M");
        }
        num%=1000;
        //handle 100 level
        sb.append(genRomanFragment(num/100,"C","D","M"));
        num%=100;
        //handle 10-level
        sb.append(genRomanFragment(num/10,"X","L","C"));
        num%=10;
        //handel 1-level
        sb.append(genRomanFragment(num,"I","V","X"));
        return sb.toString();

    }
    private String genRomanFragment(int num, String oneLabel, String fiveLabel, String tenLabel){
        String s="";
        switch(num){
            case 9:
                s=oneLabel+tenLabel;
                break;
            case 4:
                s=oneLabel+fiveLabel;
                break;
            default:
                if(num==0) return "";
                if(num>=5){
                    s=fiveLabel;
                    num-=5;
                }
                for(int i=0;i<num;i++){
                    s+=oneLabel;
                }
        }
        return s;
    }
}
