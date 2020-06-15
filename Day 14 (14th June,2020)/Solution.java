class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[1] - b[1];
            }
        });
        
        pq.add(new int[]{src, 0, -1});
        while(!pq.isEmpty()){
            int[] x = pq.poll();
            if(x[0] == dst)
                return x[1];
            
            if(x[2] == K)
                continue;
            
            for(int i = 0; i < flights.length; i++)
            {
                if(flights[i][0] == x[0] && flights[i][1] != src)
                {
                    int next = flights[i][1];
                    if(x[2] < K)
                        pq.add(new int[]{next, flights[i][2] + x[1], x[2] + 1});
                }
            }
        }
        return -1;
    }
}