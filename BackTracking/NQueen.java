public class NQueen {
    static int CountWays(boolean board[][],int i){
        int count=0;
        if(i==board.length){
            return 1;
        }

        for(int j=0;j<board[i].length;j++){
            if(canplace(board,i,j)){
                board[i][j]=true;
                count=count+CountWays(board, i+1);
                board[i][j]=false;// Backtracking
            }
        }
        return count;
    }

       static boolean canplace(boolean board[][],int i,int j){
            for(int k=i;k>=0;k--){
                if(board[k][j]){  //upper row check
                    return false;
                }
            }

            for(int row=i,col=j; row>=0 && col>=0; row--,col--){ // upper left diagnol
                if(board[row][col]){
                    return false;
                }
            }
            for(int row=i,col=j;row>=0 && col<board.length; row--,col++){ //Upper Right diagnol
                if(board[row][col]){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        boolean board[][]=new boolean[4][4]; //4x4
        System.out.println(CountWays(board,0));
    }
}
