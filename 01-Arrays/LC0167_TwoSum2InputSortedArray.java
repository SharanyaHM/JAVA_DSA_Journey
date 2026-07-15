// LC167 - Two Sum II - Input Array Is Sorted
// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Time: O(n) | Space: O(1)
 
import java.util.*;

public class LC0167_TwoSum2InputSortedArray {

    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff) + 1, i + 1 };
            }
            map.put(numbers[i], i);

        }
        return new int[] {};

    }
}
