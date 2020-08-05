package leetcode.editor.cn;

//回文数
class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
    }

    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int rotating = 0;
            while (x > rotating) {
                rotating = rotating * 10 + x % 10;
                x /= 10;
            }

            return x == rotating || x == rotating / 10;

        }
    }

}