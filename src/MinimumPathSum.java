/**
 * Created by kaijiezhou on 15-8-20.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]  matrix=new int[m][n];
        matrix[m-1][n-1]=grid[m-1][n-1];
        for(int i=m-2;i>=0;i--){
            matrix[i][n-1]=grid[i][n-1]+matrix[i+1][n-1];
        }
        for(int i=n-2;i>=0;i--){
            matrix[m-1][i]=grid[m-1][i]+matrix[m-1][i+1];
        }
        for(int j=n-2;j>=0;j--){
            for(int i=m-2;i>=0;i--){
                matrix[i][j]=grid[i][j]+min(matrix[i+1][j],matrix[i][j+1]);
            }
        }
        return matrix[0][0];
    }
    private int min(int a, int b){
        return a<b?a:b;
    }
}
