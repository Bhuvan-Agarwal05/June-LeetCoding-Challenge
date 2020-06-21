class Solution {
    public String getPermutation(int n, int k) {
        StringBuffer sp = new StringBuffer("");
        ArrayList<Integer> fact = new ArrayList<>();
        fact.add(1);
        for(int i=1;i<=n;i++)
            fact.add(i,fact.get(i-1)*i);  // Factorial from 0 to n
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
            list.add(i);  // Make a list from 1 to n
        
        int idx=0;
        while(n>0)
        {
            idx = k/fact.get(n-1);
            if(k%fact.get(n-1)==0)
            {
                idx--;
                k = fact.get(n-1);
            }
            else
                k = k%fact.get(n-1);
            sp.append(list.get(idx));
            list.remove(idx);
            n--;
        }
        return sp.toString();
    }
}