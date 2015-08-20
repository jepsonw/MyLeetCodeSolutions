/**
 * Created by kaijiezhou on 15-8-20.
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][]grid=new int[m][n];
        for(int i=0;i<m;i++){
            grid[i][n-1]=1;
        }
        for(int i=0;i<n;i++){
            grid[m-1][i]=1;
        }
        for(int j=n-2;j>=0;j--){
            for(int i=m-2;i>=0;i--){
                grid[i][j]=grid[i+1][j]+grid[i][j+1];
                System.out.println(i+", "+j);
            }
        }
        return grid[0][0];
    }

    public static void main(String[] args) {
        System.out.println(new UniquePaths().uniquePaths(3,5));
    }
}
