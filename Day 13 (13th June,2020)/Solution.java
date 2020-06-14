class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int n = nums.length;
        
        if(n==0) 
            return answer;
        else if(n==1)
        {
            answer = new ArrayList<>();
            answer.add(nums[0]);
            return answer;
        }
        else
        {
            Arrays.sort(nums);
            int[] nextIndex = new int[n];
            int[] sizes = new int[n];
            
            Arrays.fill(nextIndex,-1);
            Arrays.fill(sizes,1);
            
            int maxLen = 1;
            int maxIndex = 0;
            
            for(int i=n-1;i>=0;i--)
            {
                int j = i+1;
                int max = 0;
                int maxI = i;
                while(j<n)
                {
                    if(nums[j]%nums[i] == 0 && sizes[j] > max)
                    {
                        max = sizes[j];
                        maxI=j;
                    }
                    j++;
                }
                
                if(maxI != i)
                {
                    sizes[i] += sizes[maxI];
                    nextIndex[i] = maxI;
                    if(max+1 > maxLen){
                        maxLen = max+1;
                        maxIndex = i;
                    }
                }
            }
            
            int ans = maxIndex;
            while(ans>=0)
            {
                answer.add(nums[ans]);
                ans = nextIndex[ans];
            }
            return answer;
            
        }
        
    }
}