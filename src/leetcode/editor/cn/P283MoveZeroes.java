package leetcode.editor.cn;

import java.util.Arrays;

//移动零
class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        solution.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    class Solution {
        public void moveZeroes(int[] nums) {
            int temp = 0;
            boolean flag ;
            for (int i = 0; i < nums.length - 1; i++) {
                flag = false;
                for (int j = 0; j < nums.length - i - 1; j++) {
                    if (nums[j] == 0) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        flag = true;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            System.out.println(Arrays.toString(nums));

        }
    }

}