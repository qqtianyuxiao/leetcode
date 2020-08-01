package leetcode.editor.cn;


import java.util.Arrays;
import java.util.Collections;

//最小移动次数使数组元素相等
class MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        Solution solution = new MinimumMovesToEqualArrayElements().new Solution();
        System.out.println(solution.minMoves(new int[]{1, 2147483647}));
    }

    class Solution {
        public int minMoves(int[] nums) {
            Arrays.sort(nums);
            int count = 0;
            for (int i = 1; i < nums.length; i++) {
                count += nums[i] - nums[0];
            }
            return count;
        }
    }
}