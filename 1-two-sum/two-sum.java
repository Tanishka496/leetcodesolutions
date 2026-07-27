class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int i=1;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(nums[0],0);
       for( i=1;i<nums.length;i++)
       {
        if(map.containsKey(target-nums[i]))
        {
            break;
        }
        map.put(nums[i],i);
       }
       return new int[]{map.get(target-nums[i]),i};
    }
}
