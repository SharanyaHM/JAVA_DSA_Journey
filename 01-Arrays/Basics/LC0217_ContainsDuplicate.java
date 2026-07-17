// LC217 - Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/
// Time: O(n) | Space: O(n)

import java.util.*;
public class LC0217_ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }

        }
        return false;
    }

    
}
