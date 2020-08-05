package leetcode.editor.cn;

//范围求和 II
class RangeAdditionIi {
    public static void main(String[] args) {
        Solution solution = new RangeAdditionIi().new Solution();
    }

    class Solution {
        public int maxCount(int m, int n, int[][] ops) {
            for (int[] op : ops) {
                m = Math.min(m, op[0]);
                n = Math.min(n, op[1]);
            }
            return m * n;
        }
    }

}