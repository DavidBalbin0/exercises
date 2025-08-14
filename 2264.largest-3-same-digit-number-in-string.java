/*
 * @lc app=leetcode id=2264 lang=java
 *
 * [2264] Largest 3-Same-Digit Number in String
 */

// @lc code=start
class Solution {
    public String largestGoodInteger(String num) {
        char[] numbers = num.toCharArray();
        var goodNumber = "";
        for(int i = 0; i < (numbers.length - 2); i++){
            if(numbers[i] == numbers[i +1] && numbers[i] == numbers[i +2]) {
                String newGoodNumber = "" + numbers[i] + numbers[i] + numbers[i];
                if (newGoodNumber.compareTo(goodNumber) > 0) {
                    goodNumber = newGoodNumber;
                } 
            }
        }

        if(!goodNumber.isBlank()) {
            return "" + goodNumber;
        } else {
            return "";
        }
        
    }

        public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.largestGoodInteger("42352338")); // Esperado: 777
    }
}
// @lc code=end
