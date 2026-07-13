// Left Rotate Array by K Places (Brute Force)
// Link: https://takeuforward.org/plus/dsa/problems/left-rotate-array
// Time: O(n) | Space: O(k)

public class TUF_LeftRotateArraybyKPlaces {

    public void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }
        for (int i = n - k; i < n; i++) {
            nums[i] = temp[i - (n - k)];
        }

    }
}