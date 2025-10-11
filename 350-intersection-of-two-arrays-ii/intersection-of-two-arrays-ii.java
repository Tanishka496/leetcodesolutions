import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences in nums1
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check elements in nums2
        for (int num : nums2) {
            if (countMap.getOrDefault(num, 0) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        // Convert List to array
        int[] resArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }

        return resArray;
    }
}
