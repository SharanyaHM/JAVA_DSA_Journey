package Sliding_Window;
// LC219 - Contains Duplicate II
// Link: https://leetcode.com/problems/contains-duplicate-ii/
// Time: O(n) | Space: O(n)

import java.util.HashMap;

public class LC0219_ContainsDuplicate2 {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }
        return false;

    }

}


