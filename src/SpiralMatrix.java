import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaijiezhou on 8/19/15.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowCount=matrix.length;
        int colCount=rowCount>0?matrix[0].length:0;
        List<Integer> result=new ArrayList<Integer>();
        while(rowCount>0&&colCount>0){
            System.out.println(rowCount+", "+colCount);
            circleCollect(result,matrix,rowCount,colCount);
            rowCount-=2;
            colCount-=2;
        }
        return result;
    }

    private void circleCollect(List<Integer> result, int[][] matrix, int rowCount, int colCount){
        int startJ= (matrix[0].length-colCount)/2;
        int startI=(matrix.length-rowCount)/2;
        int i,j;
        for(j=startJ,i=startI;j<matrix[0].length-startJ;j++){
            System.out.println("->");
            result.add(matrix[i][j]);
        }
        --j;
        for(i=startI+1;i<matrix.length-startI;i++){
            System.out.println("down");
            result.add(matrix[i][j]);
        }
        --i;
        for(j-=1;j>=startJ&&i>startI;j--){
            System.out.println("<-");
            result.add(matrix[i][j]);
        }
        ++j;
        for(i-=1;i>startI&&j<matrix[0].length-startJ-1;i--){
            System.out.println("up");
            result.add(matrix[i][j]);
        }
    }

    public static void main(String[] args) {
        int[][]matrix={{2,5,20},{8,4,0},{0,-1,7},{2,9,8}};
        System.out.println(new SpiralMatrix().spiralOrder(matrix));
    }
}
