package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//数组中重复的数据
//将数散列在创建好的数组中
class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        Solution solution = new FindAllDuplicatesInAnArray().new Solution();
        System.out.println(solution.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            int[] ints = new int[nums.length];
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ints[nums[i] - 1]++;
            }
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == 2) {
                    arr.add(i+1);
                }
            }
            return arr;
        }
    }

}