// LC027 - Remove Element
// Link: https://leetcode.com/problems/remove-element/
// Time: O(n) | Space: O(1)

class LC0027_RemoveElements {
    public int removeElement(int[] nums, int val) {
        int i, k;
        k = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}