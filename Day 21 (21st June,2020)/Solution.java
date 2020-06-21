class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;
        
        int[][] A = new int[row][col];
        A[row-1][col-1] = dungeon[row-1][col-1] > 0 ? 1 : 1 - dungeon[row-1][col-1];
        
        for(int i = row-2;i>=0;i--)
            A[i][col-1] = Math.max(A[i+1][col-1] - dungeon[i][col-1],1);
        
        for(int j=col-2;j>=0;j--)
            A[row-1][j] = Math.max(A[row-1][j+1] - dungeon[row-1][j],1);
        
        for(int i=row-2;i>=0;i--)
        {
            for(int j=col-2;j>=0;j--)
            {
                A[i][j] = Math.max(Math.min(A[i+1][j] , A[i][j+1]) - dungeon[i][j] , 1);
            }
        }
        return A[0][0];
    }
}