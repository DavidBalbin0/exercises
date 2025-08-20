/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr1 = { "flower", "flow", "flight" };
        String[] arr2 = { "dog", "racecar", "car" };
        String[] arr3 = { "interspecies", "interstellar", "interstate" };
        System.out.println(solution.longestCommonPrefix(arr1)); // Esperado: "fl"
        System.out.println(solution.longestCommonPrefix(arr2)); // Esperado: ""
        System.out.println(solution.longestCommonPrefix(arr3)); // Esperado: "inters"
    }
}
// @lc code=end
