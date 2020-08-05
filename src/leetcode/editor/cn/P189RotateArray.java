package leetcode.editor.cn;

import java.util.Arrays;

//旋转数组
class RotateArray {
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();
        solution.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
    /*
    //暴力
    class Solution {
        public void rotate(int[] nums, int k) {
            int temp = 0;
            for (int i = 0; i < k; i++) {
                temp = nums[nums.length - 1];
                for (int j = nums.length - 2; j >= 0; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[0] = temp;
            }
        }
    }
    */

    //使用反转
    class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length - 1);
            System.out.println(Arrays.toString(nums));
        }

        public void reverse(int[] nums, int start, int end) {
            int temp = 0;
            while (start < end) {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
}
