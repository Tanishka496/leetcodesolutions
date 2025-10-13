class Solution 
{
    public int maxArea(int[] height) 
    {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right)
        {
            // Find the area formed between left and right lines
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            // Update maximum area
            if (area > maxWater)
                maxWater = area;

            // Move the pointer that has the smaller height
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}
