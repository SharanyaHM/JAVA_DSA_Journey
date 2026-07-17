package Prefix_Sum;
// LC974 - Subarray Sums Divisible by K
// Link: https://leetcode.com/problems/subarray-sums-divisible-by-k/
// Time: O(n) | Space: O(n)

import java.util.HashMap;
public class LC0974_SumOfSubArraysDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefixsum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            prefixsum += nums[i];
            int r = prefixsum % k;
            if (r < 0) {
                r = r + k;
            }
            if (map.containsKey(r)) {
                count += map.get(r);
            }
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        return count;

    }
}
