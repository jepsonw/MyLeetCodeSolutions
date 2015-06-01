
public class NumofOneBits {
	
	public int naiveHammingWeight(int n) {
		long un=n&0x0ffffffff;
		int count=0;
		for(int i=0;i<32;i++){
			if((un&1)==1)
				++count;
			un>>=1;
		}
        return count;
    }
	public static int hammingWeight(int n){
		int count=0;
		while(n!=0){
			count+=(n&1);
			System.out.println(n+", "+count);
			n=n>>>1;//>>>is LSR, >>is ASR 
		}
		return count;
	}
	

	public static void main(String[] args) {
		NumofOneBits.hammingWeight(0b10000000000000000000000000000000);
	}

}
