/*
TUF- Longest Subarray with Sum K
Link:https://takeuforward.org/plus/dsa/problems/longest-subarray-with-sum-k
Approach:
- Prefix Sum + HashMap
- Store the first occurrence of each prefix sum.
- Check if (prefixSum - k) exists.
- Update the maximum subarray length.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

public class TUF_LongestsubarraywithsumK {

    public int longestSubarray(int[] nums, int k) {
        int maxlength = 0;
        int minsum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            minsum += nums[i];
            if (minsum == k) {
                maxlength = i + 1;
            }
            if (map.containsKey(minsum - k)) {
                int length = i - map.get(minsum - k);
                maxlength = Integer.max(maxlength, length);

            }
            if (!(map.containsKey(minsum))) {
                map.put(minsum, i);

            }
        }
        return maxlength;

    }
}
