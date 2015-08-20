/**
 * Created by kaijiezhou on 15-8-20.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder(1);
        String longN,shortN;
        if(a.length()>b.length()){
            longN=a;
            shortN=b;
        }else{
            longN=b;
            shortN=a;
        }
        char carry='0';
        int i,j;
        for(i=shortN.length()-1,j=longN.length()-1;i>=0;i--, j--){
            char s=shortN.charAt(i);
            char l=longN.charAt(j);
            switch(carry){
                case '0':
                    if(s=='1'&&l=='1'){
                        sb.insert(0,'0');
                        carry='1';
                    }else if(s!=l){
                        sb.insert(0,'1');
                    }else{
                        sb.insert(0,'0');
                    }
                    break;
                case '1':
                    if(s=='0'&&l=='0'){
                        sb.insert(0,'1');
                        carry='0';
                    }else if(s!=l){
                        sb.insert(0,'0');
                    }else{
                        sb.insert(0,'1');
                    }
                    break;
            }

        }
        for(;j>=0;j--){
            char c=longN.charAt(j);
            if(c==carry){
                sb.insert(0,'0');
            }else if(c!=carry){
                sb.insert(0,'1');
                carry='0';
            }
        }
        if(carry=='1') sb.insert(0,'1');
        return sb.toString();
    }
}
