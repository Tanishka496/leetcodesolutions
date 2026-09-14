class Solution {
    public boolean isIsomorphic(String s, String t)
    {
        HashMap<Character,Character> map =new HashMap<>();
        HashSet<Character> used = new HashSet<>();
        
        StringBuilder mapped = new StringBuilder();

        if(s.length() != t.length())
           return false;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                mapped.append(map.get(ch));
            } else 
            {
                char target = t.charAt(i);

                if(used.contains(target))
                  return false;
                
                map.put(ch,target);
                used.add(target);


                mapped.append(target);
            }
        }

        return mapped.toString().equals(t);
        
    }
}