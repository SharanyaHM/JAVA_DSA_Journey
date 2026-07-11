// LC169 - Majority Element
// Link: https://leetcode.com/problems/majority-element/
// Time: O(n) | Space: O(1)

import java.util.*;
class LC0169_MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        int n = nums.length;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }

        }

        return -1;

    }
}