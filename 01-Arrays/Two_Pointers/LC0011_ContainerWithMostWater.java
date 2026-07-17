package Two_Pointers;
// LC11 - Container With Most Water
// Link: https://leetcode.com/problems/container-with-most-water/
// Time: O(n) | Space: O(1)
 
public class LC0011_ContainerWithMostWater {
   public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int MaxArea = 0;
        while (i < j) {
            int Area = Integer.min(height[i], height[j]) * (j - i);
            if (Area > MaxArea) {
                MaxArea = Area;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return MaxArea;

    }

    
}
