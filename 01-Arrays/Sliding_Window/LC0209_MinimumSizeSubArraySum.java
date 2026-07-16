// LC209 - Minimum Size Subarray Sum
// Link: https://leetcode.com/problems/minimum-size-subarray-sum/
// Time: O(n) | Space: O(1)

class LC0209_MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int total = 0;
        int minLength = Integer.MAX_VALUE;

        for (right = 0; right < nums.length; right++) {
            total += nums[right];
            while (total >= target) {
                int length = right - left + 1;
                minLength = Integer.min(length, minLength);
                total -= nums[left];
                left += 1;

            }

        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}

