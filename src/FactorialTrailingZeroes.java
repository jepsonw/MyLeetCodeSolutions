
public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int count=0;
		while(n>=1){
			n/=5;
			count+=n;
		}
        return count;
    }
	


}
