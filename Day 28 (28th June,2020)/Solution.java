class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> list = new LinkedList<>();
        
        // PriorityQueue adds data in order based on their natural order... (that means Sorted).. and it keeps duplicates also
        HashMap<String,PriorityQueue<String>> map = new HashMap<>();
        for(List<String> s : tickets)
        {
            if(map.containsKey(s.get(0)))
            {
                PriorityQueue<String> p = map.get(s.get(0));
                p.add(s.get(1));
                map.put(s.get(0),p);
            }
            else
            {
                PriorityQueue<String> p = new PriorityQueue<>();
                p.add(s.get(1));
                map.put(s.get(0),p);
            }
        }
        
        DFS(map,list,"JFK");
        
        return list;
    }
    
    private void DFS(HashMap<String,PriorityQueue<String>> map ,LinkedList<String> list,String s)
    {
        PriorityQueue<String> p = map.get(s);
        while(p != null && !p.isEmpty())
        {
            String sp = p.poll();  // Removing First Element From PriorityQueue.
            DFS(map,list,sp);
        }
        list.addFirst(s);
    }
}