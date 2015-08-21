/**
 * Created by kaijiezhou on 15-8-21.
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] rowFlag=new boolean[m];
        boolean[] colFlag=new boolean[n];
        for(int i=0;i<m;i++){
            rowFlag[i]=false;
        }
        for(int i=0;i<n;i++){
            colFlag[i]=false;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rowFlag[i]=true;
                    colFlag[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(rowFlag[i]){
                for(int j=0;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<n;j++){
            if(colFlag[j]){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
