class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        if(row<=2)
            return;
        int col = board[0].length;
        if(col<=2)
            return;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if((i==0 || j==0 || i==row-1 || j==col-1) && board[i][j]=='O')
                    markIt(board,i,j);
            }
        }
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='M')
                    board[i][j]='O';
            }
        }
        
        
    }
    
    public void markIt(char[][] board,int i,int j)
    {
        if(i>=0 && i<board.length && j>=0 && j<board[0].length && board[i][j]=='O')
        {
            board[i][j]='M';
            markIt(board,i+1,j);
            markIt(board,i-1,j);
            markIt(board,i,j+1);
            markIt(board,i,j-1);
        }
    }
}