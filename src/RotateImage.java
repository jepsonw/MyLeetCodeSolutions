

/**
 * Created by kaijiezhou on 8/14/15.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                swap(matrix,i,j,j,i);
            }
        }

        for(int j=0;j<=(n-1)/2;j++){
            for(int i=0;i<n;i++){
                swap(matrix,i,j,i,n-1-j);
            }
        }

    }


    private void swap(int[][]matrix, int x1, int y1, int x2, int y2){
        int temp=matrix[x1][y1];
        matrix[x1][y1]=matrix[x2][y2];
        matrix[x2][y2]=temp;
    }
}
