package Two_Pointers;
// LC16 - 3Sum Closest
// Link: https://leetcode.com/problems/3sum-closest/
// Time: O(n²) | Space: O(1)

import java.util.*;

class LC0016_ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestsum = nums[0] + nums[1] + nums[2];
        for (int first = 0; first < nums.length - 2; first++) {

            int second = first + 1;
            int third = nums.length - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if (Math.abs(sum - target) < Math.abs(bestsum - target)) {
                    bestsum = sum;
                }
                if (sum == target) {
                    return target;
                } else if (sum > target) {
                    third--;
                } else {
                    second++;
                }
            }

        }

        return bestsum;
    }
}