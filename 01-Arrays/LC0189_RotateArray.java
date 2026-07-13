// LC189 - Rotate Array (Optimal)
// Reverse the entire array, then reverse the first k elements,
// and finally reverse the remaining elements to achieve right rotation.
// Time: O(n) | Space: O(1)
// Link: https://leetcode.com/problems/rotate-array/

public class LC0189_RotateArray {

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }
}
 