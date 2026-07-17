package Two_Pointers;
// LC18 - 4Sum
// Link: https://leetcode.com/problems/4sum/
// Time: O(n³) | Space: O(1) (excluding the output list)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0018_Foursum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int first = 0; first < nums.length - 3; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int second = first + 1;
            // Remove second duplicates
            for (second = first + 1; second < nums.length - 2; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                int third = second + 1;
                int fourth = nums.length - 1;
                while (third < fourth) {

                    long sum = (long) nums[first] + nums[second] + nums[third] + nums[fourth];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[first], nums[second], nums[third], nums[fourth]));
                        third++;
                        fourth--;

                        // Remove duplicates for third element
                        while (third < fourth && nums[third] == nums[third - 1]) {
                            third++;
                        }

                        // Remove Duplicates for fourth element
                        while (third < fourth && nums[fourth] == nums[fourth + 1]) {
                            fourth--;
                        }
                    } else if (sum < target) {
                        third++;
                    } else {
                        fourth--;

                    }

                }
            }
        }
        return ans;
    }
}
