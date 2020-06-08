class Solution {
    public boolean isPowerOfTwo(int n) {
        int flag=1;
        if(n==0)
            return false;
        while(n!=1)
        {
            if(n%2==0)
            {
                 n /= 2;
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
            return false;
        else
            return true;
    }
}