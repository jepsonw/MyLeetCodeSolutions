import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rowList=new ArrayList<List<Integer>>();
        if(numRows==0) return rowList;
        List<Integer> firstRow=new ArrayList<Integer>();
        firstRow.add(1);
        rowList.add(firstRow);
        if(numRows==1) return rowList;
        List<Integer> secRow=new ArrayList<Integer>();
        secRow.add(1);
        secRow.add(1);
        rowList.add(secRow);
        if(numRows==2) return rowList;
        List<Integer> lastRow=secRow;
        for(int i=3;i<=numRows;i++){
            List<Integer> curRow=new ArrayList<Integer>();
            curRow.add(1);
            int index=1;
            while(index<i-1){
               curRow.add(lastRow.get(index-1)+lastRow.get(index));
               index++;
            }
            curRow.add(1);
            rowList.add(curRow);
            lastRow=curRow;
        }
        return rowList;
    }
}