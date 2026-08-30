class Solution {
    public void moveZeroes(int[] nums) 
    {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                 j=i;
                continue;
            }
            if(j<=i) j=i+1;
            while(j < nums.length && nums[j]==0)
             {
                j++;
              }
           if(j==nums.length)
              break;

           int temp = nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
       }
      
     }
}