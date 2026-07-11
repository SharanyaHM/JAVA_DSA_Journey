// LC215 - Kth Largest Element in an Array
// Link: https://leetcode.com/problems/kth-largest-element-in-an-array/
// Time: O(n log k) | Space: O(k)

import java.util.*;
public class LC0215_KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        int i = nums.length - k;
        return (nums[i]);
    }

}

    

