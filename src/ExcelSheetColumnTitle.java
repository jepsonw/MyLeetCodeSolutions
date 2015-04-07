
public class ExcelSheetColumnTitle {
	  public String convertToTitle(int n) {
	        int base='A'-1;
	        int step=26;
	        String s="";
	        while(n>0){
	            int num=n%step; 
	            if(num==0){
	            	 num=26;
	            	 n=n-26;
	            }
	            char c=(char)(num+base);
	            s=String.valueOf(c)+s;
	            n=n/step;
	        }
	        return s;
	    }
	  public static void main(String[]args){
		  System.out.println(new ExcelSheetColumnTitle().convertToTitle(26));
	  }
}
