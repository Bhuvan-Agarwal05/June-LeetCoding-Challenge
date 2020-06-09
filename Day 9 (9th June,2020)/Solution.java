class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        else
        {
            int i=0;
            StringBuffer sp = new StringBuffer("");
            
            for(char ch:s.toCharArray())
            {
                while(i<t.length())
                {
                    if(ch==t.charAt(i))
                    {
                        sp.append(ch);
                        i++;
                        break;
                    }
                    else
                        i++;
                }
            }
            if(sp.toString().equals(s))
                return true;
            else
                return false;
        }
        
    }
}