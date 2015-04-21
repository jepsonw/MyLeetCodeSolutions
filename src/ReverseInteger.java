
public class ReverseInteger {
	public int reverse(int x) {
        int reversed=0;
        while(x!=0){
        	System.out.println(Integer.MIN_VALUE-(x%10)+","+reversed);
        	if((x>0&&reversed>(Integer.MAX_VALUE-(x%10))/10)||(x<0&&reversed<(Integer.MIN_VALUE-(x%10))/10))
        		return 0;
            reversed=reversed*10+(x%10);
            x/=10;
        }
        return reversed;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ReverseInteger().reverse(1534236469));
	}

}
