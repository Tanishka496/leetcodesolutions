class Solution {
    public long totalCost(int[] costs, int k, int candidates)
     {
        PriorityQueue <Integer> pq1 = new PriorityQueue<>();
        PriorityQueue <Integer> pq2 = new PriorityQueue<>();

        int left =0;
        int right=costs.length-1;
        long total=0;

        for(int i=0;i<candidates && left<=right;i++)
        {
            pq1.add(costs[left++]);
        }

        for(int i=0;i<candidates && left<=right;i++)
        {
            pq2.add(costs[right--]);
        }

        for(int i=0;i<k;i++)
        {
            if(pq2.isEmpty() || (!pq1.isEmpty() && pq1.peek()<=pq2.peek()))
            {
                total+=pq1.poll();
            if(left<=right)
            {
                pq1.add(costs[left++]);
            }
            }
            else
            {
                total+=pq2.poll();
            if(left<=right)
            {
                pq2.add(costs[right--]);
            }

            }


        }

        return total;
    }
}