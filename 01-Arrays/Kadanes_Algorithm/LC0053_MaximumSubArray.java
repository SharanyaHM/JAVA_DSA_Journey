package Kadanes_Algorithm;
// LC53 - Maximum Subarray ->Kadane's Algorithm
// Link: https://leetcode.com/problems/maximum-subarray/
// Time: O(n) | Space: O(1)

class LC0053_MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int cursum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cursum <= 0) {
                cursum = 0;
            }
            cursum += nums[i];
            maxsum = Integer.max(maxsum, cursum);
        }
        return maxsum;

    }
}