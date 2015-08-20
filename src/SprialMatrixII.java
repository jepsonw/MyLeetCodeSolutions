/**
 * Created by kaijiezhou on 15-8-20.
 */
public class SprialMatrixII {
    private int num;
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        num=1;
        int sideLen=n;
        while(sideLen>0){
            circleInsert(matrix,sideLen);
            sideLen-=2;
        }
        return matrix;
    }

    private void circleInsert(int[][] matrix, int sideLen){
        int n=matrix.length;
        int start=(n-sideLen)/2;
        int i,j;
        for(i=start,j=start;j<n-start;j++){
            matrix[i][j]=getNum();
        }
        --j;
        for(i=start+1;i<n-start;i++){
            matrix[i][j]=getNum();
        }
        --i;
        for(j-=1;j>=start&&i>start;j--){
            matrix[i][j]=getNum();
        }
        ++j;
        for(i-=1;i>=start+1&&j<n-start-1;i--){
            matrix[i][j]=getNum();
        }

    }
    private int getNum(){
        return num++;
    }
}
