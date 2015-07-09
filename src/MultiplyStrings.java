import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaijiezhou on 7/9/15.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        return addProducts(multiByBit(num1,num2));
    }
    private List<String> multiByBit(String num1,String num2){
        List<String> products=new ArrayList<>();
        for(int i=num2.length()-1;i>=0;i--){
            StringBuilder product=singleMultiply(num1,num2.charAt(i));
            int position=num2.length()-1-i;
            for(int j=0;j<position;j++){
                product.append("0");
            }
            products.add(product.toString());
        }
        return products;
    }
    private StringBuilder singleMultiply(String num1, char num2){
        StringBuilder sb=new StringBuilder();
        int carry=0,factor=num2-'0';
        int product;
        for(int i=num1.length()-1;i>=0;i--){
            product=(num1.charAt(i)-'0')*factor+carry;
            carry=product/10;
            sb.insert(0,product%10);
        }
        if(carry!=0) sb.insert(0,carry);
        return sb;

    }

    private String addProducts(List<String> products){
        String sum="0";
        for(String addend:products){
            sum=strAdd(addend,sum);
        }
        return sum;
    }
    private String strAdd(String num1, String num2){
        int i=num1.length()-1, j=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0&&j>=0){
            int sum=(num1.charAt(i)-'0')+(num2.charAt(j)-'0')+carry;
            carry=sum/10;
            sb.insert(0,sum%10);
            --i;
            --j;
        }
        if(i>=0){
            for(;i>=0;i--){
                int sum=(num1.charAt(i)-'0')+carry;
                carry=sum/10;
                sb.insert(0,sum%10);
            }
        }else if(j>=0){
            for(;j>=0;j--){
                int sum=(num1.charAt(j)-'0')+carry;
                carry=sum/10;
                sb.insert(0,sum%10);
            }
        }
        if(carry!=0) sb.insert(0,carry);
        return sb.toString();
    }
}
