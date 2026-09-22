class Solution {
    public String frequencySort(String s) 
    {
        StringBuilder str = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        int length= s.length();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
              (a,b)->b.getValue() - a.getValue()
        );

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            pq.offer(entry);

        }

        while( !pq.isEmpty())
        {
             Map.Entry<Character,Integer> entry = pq.poll();

             char ch = entry.getKey();

             int freq= entry.getValue();

             for(int i=0;i<freq;i++)
             {
                str.append(ch);
             }
        }

        return str.toString();


    }
}