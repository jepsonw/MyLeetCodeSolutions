import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by kaijiezhou on 7/8/15.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> store =new HashSet<>();
        for(int i=0;i<9;i++){
            store.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(board[i][j]<='0'||board[i][j]>'9') return false;
                if(store.contains(board[i][j]))
                    return false;
                else
                    store.add(board[i][j]);
            }
        }

        for(int i=0;i<9;i++){
            store.clear();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(board[j][i]<='0'||board[j][i]>'9') return false;
                if(store.contains(board[j][i]))
                    return false;
                else
                    store.add(board[j][i]);
            }
        }

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                store.clear();
                for(int a=i;a<i+3;a++){
                    for(int b=j;b<j+3;b++){
                        if(board[a][b]=='.') continue;
                        if(board[a][b]<='0'||board[a][b]>'9') return false;
                        if(store.contains(board[a][b]))
                            return false;
                        else
                            store.add(board[a][b]);
                    }
                }
            }
        }
        return true;
    }
}
