
public class ReverseBits {
	public int reverseBits(int n) {
        long unsigned= n&0x0ffffffff;
        int gate=1;
        int result=0;
        for (int i=0;i<32;i++){
            System.out.println(i+"::"+"result-> "+Integer.toBinaryString(result)+"	gate-> "+Integer.toBinaryString(gate)+"	add"+Long.toBinaryString(unsigned&gate)+"	"+Integer.toHexString(result));
            result<<=1;
            result+=((unsigned&gate)==0?0:1);
            gate<<=1;
        }
        return result;
    }
	public static void main(String[]args){
		new ReverseBits().reverseBits(3);
	}
}
