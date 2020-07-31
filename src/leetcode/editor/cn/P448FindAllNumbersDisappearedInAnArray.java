package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//找到所有数组中消失的数字
class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        Solution solution = new FindAllNumbersDisappearedInAnArray().new Solution();
        System.out.println(solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int[] ints = new int[nums.length];
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ints[nums[i] - 1]++;
            }
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == 0) {
                    arr.add(i + 1);
                }
            }
            return arr;
        }
    }

}

