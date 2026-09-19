class Solution {
    public boolean rotateString(String s, String goal) 
    {
        if(s.length()!=goal.length())
             return false;
        else
        {
            if((s+s).contains(goal))
                return true;
        }
        return false;
    }
}