package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


//第三大的数
class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution solution = new ThirdMaximumNumber().new Solution();
        System.out.println(solution.thirdMax(new int[]{-2147483648, 1, 1}));
    }

    class Solution {
        public int thirdMax(int[] nums) {
            Arrays.sort(nums);
            ArrayList<Integer> arr = new ArrayList<>();
            for (int num : nums) {
                if (!arr.contains(num)) {
                    arr.add(num);
                }
            }
            if (arr.size() < 3) {
                return arr.get(arr.size() - 1);
            }
            return arr.get(arr.size() - 3);
        }
    }

}


