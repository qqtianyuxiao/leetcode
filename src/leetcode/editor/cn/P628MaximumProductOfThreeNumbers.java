package leetcode.editor.cn;

import java.util.Arrays;

//三个数的最大乘积
 class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        Solution solution = new MaximumProductOfThreeNumbers().new Solution();
        System.out.println(solution.maximumProduct(new int[]{-1000, -1000, 1000}));

    }

    class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            int a = nums[n - 1] * nums[n - 2] * nums[n - 3];
            int b = nums[n - 1] * nums[1] * nums[2];
            return Math.max(a, b);
        }
    }

}