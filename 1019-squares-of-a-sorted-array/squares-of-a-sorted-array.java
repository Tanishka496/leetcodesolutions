class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;           // pointer at the start
        int right = n - 1;      // pointer at the end
        int pos = n - 1;        // fill result from the end

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return result;
    }
}
