class Solution {
    public int numSquares(int n) {
        // Coz N<=3 , we will have only 1 = 1^2  ,  2 = 1^2 + 1^2  , 3 = 1^2 + 1^2 + 1^2  
        if(n<=3)
            return n;
        
        // If (N) is a perfect Square, then 1 will be the answer.
        double a = Math.sqrt(n);
        if((int)a*a==n)
            return 1;
        
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=i;
            for(int j=1;j*j<=i;j++)
            {
                arr[i] = Math.min(arr[i] , arr[i-j*j]+1);
            }
        }
        
        return arr[n];
    }
}