class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n= costs.length;
        int[] ref=new int[n];
        int a=0,b=0;
        int sum=0,j=0;
        for(int[] ith:costs)
            {
            ref[j++]= ith[1] - ith[0];
            sum += ith[0];
            }
       // System.out.println(sum);
        Arrays.sort(ref);
        for(int i=0;i<n/2;i++)
            sum += ref[i];
        
        return sum;
    }
}