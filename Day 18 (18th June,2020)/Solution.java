class Solution {
    public int hIndex(int[] citations) {
        
        // O(log n)  Solution :-
        int l = 0;
        int r = citations.length-1;
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            if(citations[mid] < citations.length-mid)
                l = mid+1;
            else
                r = mid-1;
        }
        return citations.length-l;
        
        // O(n) Solution :-
        /*
            int i = citations.lenth-1;
            while(i>=0)
            {
                if(citations[i] < n-i)
                    break;
                i--;
            }
            return n-i-1;
        
        */
    }
}