// LC350 - Intersection of Two Arrays II (HashMap)
// Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
// Time: O(n + m) | Space: O(n)

import java.util.*;

class LC0350_IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                ans.add(num);
                map.put(num, map.get(num) - 1);

            }
        }
        int res[] = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);

        }
        return res;
    }
}