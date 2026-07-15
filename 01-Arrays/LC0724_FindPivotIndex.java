// LC724 - Find Pivot Index
// Link: https://leetcode.com/problems/find-pivot-index/
// Time: O(n) | Space: O(1)

class LC0724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int totalsum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalsum - leftsum - nums[i];
            if (leftsum == rightsum) {
                return i;
            }
            leftsum += nums[i];

        }

        return -1;
    }
}
