/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(map);

        char[] charArray = s.toCharArray();
        int value = 0;
        for (int i = 0; i < charArray.length; i++) {
            char charAt = s.charAt(i);
            int integer = hashMap.get(charAt);

            if (i < charArray.length - 1) {
                char charAtNext = s.charAt(i + 1);
                int integer2 = hashMap.get(charAtNext);
                if (integer2 > integer) {
                    value += (integer2 - integer);
                    i++; 
                    continue;
                }
            }

            value += integer;
        }

        return value;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("XXIX"));
    }
}
// @lc code=end
