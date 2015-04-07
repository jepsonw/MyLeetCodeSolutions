import java.util.HashMap;
import java.util.Map;


public class MajorityElem {
	 public int majorityElement(int[] num) {
	        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        int len=num.length;
	        Integer k=0;
	        Integer v=0;
	        for(int n:num){
	            k=n;
	            if((v=map.get(n))!=null){
	                map.put(k,++v);
	                if(v>len/2)
	                    return k;
	            }else
	                map.put(k,1);
	        }
	        return k;
	    }
	public static void main(String[] args) {
		

	}

}
