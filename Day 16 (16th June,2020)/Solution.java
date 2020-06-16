class Solution {
    public String validIPAddress(String IP) {
        if( IP.contains("..") || IP.contains("::") || (IP.contains(".") && IP.contains(":")) || IP.contains("-") )
            return "Neither";
        else if(IP.contains("."))
        {
            if(IP.charAt(IP.length()-1)=='.' || IP.charAt(0)=='.')
                return "Neither";
            String[] str = IP.split("\\.");
            if(str.length!=4)
                return "Neither";
            else
            {
                for(String s : str)
                {
                    if(s.length()>=1 && s.length()<=3)
                    {
                        try
                        {
                            if(s.length()!=1 && s.charAt(0)=='0')
                            return "Neither";
                        else if(Integer.parseInt(s)<0 || Integer.parseInt(s)>255)
                            return "Neither";
                        }catch(Exception e)
                        {
                            return "Neither";
                        }
                    }
                    else
                        return "Neither";
                }
                return "IPv4";
            }
        }
        else if(IP.contains(":"))
        {
            if(IP.charAt(IP.length()-1)==':' || IP.charAt(0)==':')
                return "Neither";
            String[] str = IP.split("\\:");
            if(str.length!=8)
                return "Neither";
            else
            {
                int flag=0;
                for(String s: str)
                {
                    if(s.length()<=0 || s.length()>4)
                          return "Neither";
                    flag=0;
                    for(char c:s.toCharArray())
                    {
                        if( ((c>='A' && c<='F') || (c>='a' && c<='f')) || (c>='0' && c<='9') )
                            flag=1;
                        else
                        {
                            flag=0;
                            break;
                        }
                    }
                    if(flag==0)
                        break;
                }
                     
                    if(flag==1)
                        return "IPv6";
                    else
                        return "Neither";
            }
        }
        return "Neither";
            
    }
}