package Moores_Voting_Algo;
// LC169 - Majority Element
// Link: https://leetcode.com/problems/majority-element/
// Approach: Moore's Voting Algorithm
// Time: O(n) | Space: O(1)

public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        int count=0;
        int n=nums.length;
        int ele=nums[0];
        for(int i=0;i<n;i++){
           if(count==0){
            ele=nums[i];
            count=1;
           }
           else if(nums[i]==ele){
            count++;
           }
           else{
            count--;
           }
        }
        return ele;
       
    }
}

