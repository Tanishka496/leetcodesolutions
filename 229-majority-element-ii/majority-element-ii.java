class Solution {
    public List<Integer> majorityElement(int[] nums)
    {
       int canditate1 =0,canditate2=0,count1=0,count2=0;

       for(int num:nums)
       {
        if(num==canditate1)
        {
            count1++;
        }
        else if(num==canditate2){
            count2++;
        }
        else if(count1==0)
        {
            canditate1=num;
            count1++;
        }
        else if(count2==0)
        {
            canditate2=num;
            count2++;
        }
        else
        {
            count1--;
            count2--;

        }
       }
       count1=0;
       count2=0;
       for(int num:nums)
       {
         if(num==canditate1)
             count1++;
        else if(num==canditate2) 
            count2++;
           
       }

       List<Integer> res= new ArrayList();
      
       if(count1>nums.length/3)
            res.add(canditate1);

      if(count2>nums.length/3)
            res.add(canditate2);

    return res;
       
    }
}