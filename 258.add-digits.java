/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            String numString = Integer.toString(num);
            System.out.println(numString);
            char[] charArray = numString.toCharArray();
            System.out.println(charArray);
            int numSum = 0;
            for (char c : charArray) {
                numSum = numSum + Integer.parseInt(String.valueOf(c));
                System.out.println(numSum);
            }

            num = numSum;
        }

        return num;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addDigits(38)); // Esperado: 2
        System.out.println(sol.addDigits(0));  // Esperado: 0
        System.out.println(sol.addDigits(123)); // Esperado: 6
    }
}
// @lc code=end

// Se num == 0, retorna 0  
// Senão, retorna 1 + ((num - 1) % 9)

// Procure por "digital root" para entender o porquê dessa fórmula!