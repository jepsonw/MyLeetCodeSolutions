import java.util.regex.Pattern;

public class CompareVersionNumbers {

	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int len1=v1.length;
		int len2=v2.length;
		int minLen=len1<len2?len1:len2;
		int i;
		for(i=0;i<minLen;i++){
			int n1=Integer.valueOf(v1[i]);
			int n2=Integer.valueOf(v2[i]);
			if(n1<n2){
				return -1;
			}else if(n1>n2){
				return 1;
			}else
				continue;
		}
		if(i<len1){
			if(Integer.valueOf(v1[i])==0)
				return 0;
			return 1;
		}else if(i<len2){
			if(Integer.valueOf(v2[i])==0)
				return 0;
			return -1;
		}
		return 0;
	}
	private int getVersionSum(String versionCode){
		String[] v=versionCode.split("\\.");
		int versionSum=0;
		for(int i=0;i<v.length;i++){
			versionSum+=Integer.valueOf(v[i]);
		}
		return versionSum;
	}
	private int cmpEqualSum(String version1,String version2){
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int len1=v1.length;
		int len2=v2.length;
		int minLen=len1<len2?len1:len2;
		int i;
		for(i=0;i<minLen;i++){
			int n1=Integer.valueOf(v1[i]);
			int n2=Integer.valueOf(v2[i]);
			if(n1<n2){
				return -1;
			}else if(n1>n2){
				return 1;
			}else
				continue;
		}
		if(i<len1){
			return 1;
		}else if(i<len2)
			return -1;
		return 0;
	}

	public static void main(String[] args) {
		
		System.out
				.println(new CompareVersionNumbers().compareVersion("1.22.4", "1.22.3"));
	}

}
