class Solution {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> list= new ArrayList<>();
        Arrays.sort(people,(a,b)-> {
            return (a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        });
        
        for(int[] p:people)
        {
            list.add(p[1],p);
        }
        return list.toArray(new int[list.size()][2]);
    }
}

/*
  Step 1: 
       Sort them in descending order of their heights.
       If Heights are same , then sort them in ascending order of the  number of people infront of it...
  
  Step 2:
       Now put the tuple (h,k) at kth index...
       
*/