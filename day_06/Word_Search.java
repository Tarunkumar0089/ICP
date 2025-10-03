package day_06;
import java.util.*;
public class Word_Search {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        boolean ans=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    ans=dfs(board,word,i,j,0);
                    if(ans) break;
                }
            }
            if(ans) break;
        }
        System.out.println(ans);
    }
    static boolean dfs(char[][] board,String word,int i,int j,int index){
        if(index==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)) return false;
        char temp=board[i][j];
        board[i][j]=' ';
        boolean found=dfs(board,word,i+1,j,index+1) || dfs(board,word,i-1,j,index+1) || dfs(board,word,i,j+1,index+1) || dfs(board,word,i,j-1,index+1);
        board[i][j]=temp;
        return found;
    }
}
