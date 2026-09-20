// LC 54 - Spiral Matrix
// Link: https://leetcode.com/problems/spiral-matrix/
// Approach: Boundary Traversal
// Time: O(m * n) | Space: O(1)


import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int left = 0, right = n;
        int top = 0, bottom = m;

        List<Integer> ans = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
            }
            left++;

        }
        return ans;
    }
}