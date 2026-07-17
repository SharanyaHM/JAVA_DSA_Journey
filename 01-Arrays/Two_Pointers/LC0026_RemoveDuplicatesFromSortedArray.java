package Two_Pointers;
// LC026 - Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time: O(n) | Space: O(1)

class LC0026_RemoveDuplicatesFromSortedArray {
    
    public int removeDuplicates(int[] nums) {
        int i, k, size;
        k = 0;
        size = nums.length;
        for (i = 1; i < size; i++) {
            if (nums[i] != nums[k]) {
                nums[k + 1] = nums[i];
                k++;
            }

        }
        return k + 1;

    }


}

