import java.util.ArrayList;
import java.util.List;


public class PascalTriangleII {
	 public List<Integer> getRow(int rowIndex) {
	        List<Integer> list1=new ArrayList<Integer>();
	        List<Integer> list2=new ArrayList<Integer>();
	        list2.add(1);
	        if(rowIndex==0)
	            return list2;
	        list2.add(1);
	        if(rowIndex==1){
	            return list2;
	        }
	        for(int i=2;i<=rowIndex;i++){
	        	if(i%2==0){
	        		getNextLine(list1,list2,i);
	        	}else{
	        		getNextLine(list2,list1,i);
	        	}
	        }
	        return (rowIndex%2==0)?list1:list2;
	    }
		
		private void getNextLine(List<Integer> target,List<Integer> lastLine, int lineNum){
			target.clear();
			target.add(1);
			for(int i=1; i<lineNum;i++){
				target.add(lastLine.get(i-1)+lastLine.get(i));
			}
			target.add(1);
		}
	
	public static void main(String []args){
		List<Integer> list=(new PascalTriangleII()).getRow(2);
		for(Integer i:list){
			System.out.println(" "+i);
		}
	}
}
