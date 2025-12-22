class Solution {
    public int thirdMax(int[] nums) {

        Long largest = null;
        Long slargest = null;
        Long tlargest = null;

        for (int i = 0; i < nums.length; i++) {

            if ((largest != null && nums[i] == largest) ||
                (slargest != null && nums[i] == slargest) ||
                (tlargest != null && nums[i] == tlargest))
                continue;

            if (largest == null || nums[i] > largest) {
                tlargest = slargest;
                slargest = largest;
                largest = (long) nums[i];
            }
            else if (slargest == null || nums[i] > slargest) {
                tlargest = slargest;
                slargest = (long) nums[i];
            }
            else if (tlargest == null || nums[i] > tlargest) {
                tlargest = (long) nums[i];
            }
        }

        return tlargest == null ? largest.intValue() : tlargest.intValue();
    }
}
