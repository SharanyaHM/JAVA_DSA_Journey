// LC50 - Pow(x, n)
// Link: https://leetcode.com/problems/powx-n/
// Approach: Binary Exponentiation (Fast Power)
// Time: O(log n) | Space: O(1)

class Solution {
    public double myPow(double x, int n) {
        long exp = n;

        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double ans = 1;

        while (exp > 0) {
            if (exp % 2 == 1) {
                ans *= x;
            }

            x *= x;
            exp /= 2;
        }

        return ans;
    }
}