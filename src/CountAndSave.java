
public class CountAndSave {
	public String countAndSay(int n) {
		if(n<=0) return "";
		String seed="1";
        for (int i=1;i<n;i++){
        	seed=generateStr(seed);
        }
        return seed;
    }
	private String generateStr(String s){
		int len=s.length();
		char num=s.charAt(0);
		int count=1;
		if(len==1) return Integer.toString(count)+num;
		StringBuilder sb=new StringBuilder();
		for (int i=1;i<len;i++){
			if(num==s.charAt(i))
				count++;
			else{
				sb.append(count);
				sb.append(num);
				count=1;
				num=s.charAt(i);
			}
			if(i==len-1){
				sb.append(count);
				sb.append(num);
			}
		}
		return sb.toString();
	}
	
   
	public static void main(String[] args) {
		
		System.out.println(new CountAndSave().countAndSay(1));
	}

}
