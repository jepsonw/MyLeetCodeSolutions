/**
 * Created by kaijiezhou on 15-8-20.
 */
public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] matrix=new int[m][n];
        matrix[m-1][n-1]=obstacleGrid[m-1][n-1]==0?1:0;
        for(int i=m-2;i>=0;i--){
            matrix[i][n-1]=obstacleGrid[i][n-1]==0?matrix[i+1][n-1]:0;
        }
        for(int j=n-2;j>=0;j--){
            matrix[m-1][j]=obstacleGrid[m-1][j]==0?matrix[m-1][j+1]:0;
        }
        for(int j=n-2;j>=0;j--){
            for(int i=m-2;i>=0;i--){
                matrix[i][j]= obstacleGrid[i][j]==0?matrix[i+1][j]+matrix[i][j+1]:0;
            }
        }
        return matrix[0][0];
    }
}
