import java.util.HashMap;
import java.util.Map;

/**
 * Created by kaijiezhou on 8/31/15.
 */
public class WordSearch {
    //Direction 1:up 2:down 3:left 4:right
    int allDir=0;
    int up=1;
    int down=2;
    int left=3;
    int right=4;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited=new boolean[board.length][board[0].length];
        boolean found=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    found=findPath(board,word,i,j,0,allDir);
                }
                if(found) return true;
            }
        }
        return found;
    }

    private boolean findPath(char[][] board,String word, int i, int j, int wordIndex, int dir){
        if(i==-1||i==board.length||j==-1||j==board[0].length) return false;
        if(visited[i][j]) return false;
        visited[i][j]=true;
        boolean found=false;
        if(word.charAt(wordIndex)==board[i][j]){
            if(wordIndex==word.length()-1) return true;
            else{
                if(dir!=up){
                    found=findPath(board,word,i+1,j,wordIndex+1,down);
                }
                if(!found&&dir!=left){
                    found=findPath(board,word,i,j+1,wordIndex+1,right);
                }
                if(!found&&dir!=down){
                    found=findPath(board,word,i-1,j,wordIndex+1,up);
                }
                if(!found&&dir!=right){
                    found=findPath(board,word,i,j-1,wordIndex+1,left);
                }
            }
        }
        if(!found) visited[i][j]=false;
        return found;
    }
}
