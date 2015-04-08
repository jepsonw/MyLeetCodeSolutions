import java.util.ArrayList;
import java.util.List;


public class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        if(rowIndex==0)
            return list2;
        list2.add(1);
        if(rowIndex==1){
            return list2;
        }
        list2.add(1);
        if(rowIndex==2)
            return list2;
        for(int i=3;i<=rowIndex;i++){
        	if(i%2==0){
        		getNextLine(list2,list1,i);
        	}else{
        		getNextLine(list1,list2,i);
        	}
        }
        return rowIndex%2==0?list2:list1;
    }
	
	private void getNextLine(List<Integer> target,List<Integer> lastLine, int lineNum){
		target.clear();
		for(int i=1; i<lineNum-1;i++){
			target.add(lastLine.get(i-1)+lastLine.get(i));
		}
		target.add(1);
	}
	
	public static void main(String []args){
		List<Integer> list=(new PascalTriangleII()).getRow(4);
	}
}
