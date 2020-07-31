package leetcode.editor.cn;

import java.util.Arrays;

//错误的集合
class SetMismatch {
    public static void main(String[] args) {
        Solution solution = new SetMismatch().new Solution();
        System.out.println(Arrays.toString(solution.findErrorNums(new int[]{1, 2, 2, 4})));
    }

    class Solution {
        public int[] findErrorNums(int[] nums) {
            Arrays.sort(nums);
            int dup = -1, missing = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1])
                    dup = nums[i];
                else if (nums[i] > nums[i - 1] + 1)
                    missing = nums[i - 1] + 1;
            }
            return new int[]{dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
        }
    }

}