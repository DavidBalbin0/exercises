/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String numberString = Integer.toString(x);

        char[] original = numberString.toCharArray();
        char[] reversed = Arrays.copyOf(original, original.length);

        int length = reversed.length;

        int leftIndex = 0;
        int rigthIndex = length - 1;

        while (leftIndex < rigthIndex) {
            char temporary = reversed[leftIndex];

            reversed[leftIndex] = reversed[rigthIndex];
            reversed[rigthIndex] = temporary;
            leftIndex++;
            rigthIndex--;
        }

        if (Arrays.equals(original, reversed)) {
            return true;
        }

        return false;


        // if (x < 0) return false;        // negativos não são palíndromos

        // String s = Integer.toString(x);
        // int left = 0, right = s.length() - 1;

        // while (left < right) {
        //     if (s.charAt(left) != s.charAt(right)) return false;
        //     left++;
        //     right--;
        // }
        // return true;
    }
}
// @lc code=end
