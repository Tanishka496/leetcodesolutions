class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) 
    {
        if((long long)m*k>bloomDay.size())
           return -1;
        
        int min = *min_element(bloomDay.begin(),bloomDay.end());
        int max = *max_element(bloomDay.begin(),bloomDay.end());
        int mid=0;
        int ans;
        while(min<=max)
        {
            mid=min+(max-min)/2;

            int flowers=0;
            int bcount=0;

            for(int day:bloomDay)
            {
                if(day<=mid)
                {
                    flowers++;

                    if(flowers==k)
                    {
                         bcount++;
                        flowers=0;
                    }   
                }
                else
                   flowers=0;
            }

            if(bcount>=m)
            {
                ans=mid;
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
        }
        return ans;
        
    }
};