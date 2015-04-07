public class ZigZagConversion {
	public String convert(String s, int nRows) {
		int gap1;
		int gap2 =0;
		int index;
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		if (nRows >=3) {
		    for(int i=0;i<len;i+=2*(nRows-1))
		        sb=checkAppend(sb,s,i);
			for (int r = 2; r <= nRows; r++) {
				gap1 = 2 * (nRows - r);
				gap2 += 2;
				index = r - 1;
				sb=checkAppend(sb,s,index);
				while (index < len) {
					if (gap1 > 0) {
						index += gap1;
						sb = checkAppend(sb, s, index);
					}
					index += gap2;
					sb = checkAppend(sb, s, index);
				}
			}

		}else{
			for(int r=1;r<=nRows;r++){
				index=r-1;
				while(index<len){
					sb.append(s.charAt(index));
					index+=nRows;
				}
			}
		}
		return sb.toString();
	}

	private StringBuilder checkAppend(StringBuilder sb, String s, int index) {
		if (index < s.length()) {
			char c = s.charAt(index);
			sb.append(s.charAt(index));
		}
		return sb;
	}
		

	public static void main(String[] args) {
		
		ZigZagConversion z = new ZigZagConversion();
		System.out.println(z.convert("ABCD", 3));
	}

}
