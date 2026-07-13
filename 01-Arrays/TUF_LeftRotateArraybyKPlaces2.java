// Left Rotate Array by K Places (Optimal)
// Link: https://takeuforward.org/plus/dsa/problems/left-rotate-array
// Time: O(n) | Space: O(1)

public class TUF_LeftRotateArraybyKPlaces2 {

    void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateArray(int[] nums, int k) {

        int n = nums.length;
        k = k % n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);

    }
}
