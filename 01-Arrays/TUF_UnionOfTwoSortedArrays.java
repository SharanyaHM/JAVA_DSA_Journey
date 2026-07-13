// Union of Two Sorted Arrays (Optimal)
// Link: https://takeuforward.org/plus/dsa/problems/union-of-two-sorted-arrays
// Time: O(n + m) | Space: O(n + m)

import java.util.Arrays;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int unionArray[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                if (k == 0 || unionArray[k - 1] != nums1[i]) {
                    unionArray[k] = nums1[i];
                    k++;
                }
                i++;
            } else {
                if (k == 0 || unionArray[k - 1] != nums1[j]) {
                    unionArray[k] = nums1[i];
                    k++;

                }
                j++;
            }

        }
        while (j < n) {
            if (k == 0 || unionArray[k - 1] != nums1[j]) {
                unionArray[k] = nums1[i];
                k++;

            }
            j++;

        }

        while (i < n) {
            if (nums1[i] <= nums2[j]) {
                if (k == 0 || unionArray[k - 1] != nums1[i]) {
                    unionArray[k] = nums1[i];
                    k++;
                }
                i++;

            }
        }
        return Arrays.copyOf(unionArray, k);
    }
}