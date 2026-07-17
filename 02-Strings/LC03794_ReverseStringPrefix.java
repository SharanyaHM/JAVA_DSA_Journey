// LC3794 - Reverse String Prefix
// Link: https://leetcode.com/problems/reverse-string-prefix/
// Time: O(k) | Space: O(n)

public class LC03794_ReverseStringPrefix {
   
    static void reverse(char a[],int start, int end){
        while(start<end){
            char temp= a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        

    }
    public String reversePrefix(String s, int k) {
        k = Math.min(k, s.length());
        char a[]=s.toCharArray();
        reverse(a,0,k-1);
        return new String(a);
    }
}

