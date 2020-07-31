package leetcode.editor.cn;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//数组的度
class DegreeOfAnArray {
    public static void main(String[] args) {
        Solution solution = new DegreeOfAnArray().new Solution();
        System.out.println(solution.findShortestSubArray(new int[]{1}));
    }

    class Solution {
        public int findShortestSubArray(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>(),
                    left = new HashMap<>(),
                    right = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!left.containsKey(nums[i])) {
                    left.put(nums[i], i);
                }
                right.put(nums[i], i);
                count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            }

            int min = nums.length;
            //这里可以使用Collections集合来找到最大值
            int degree = Collections.max(count.values());

            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() == degree) {
                    int i = right.get(entry.getKey()) - left.get(entry.getKey());
                    min = i < min ? i : min;
                    // min = Math.min(min, right.get(x) - left.get(x) + 1);
                }
            }
            return min + 1;

        }
    }

}

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>(),
                left = new HashMap<>(),
                right = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!left.containsKey(nums[i])) {
                left.put(nums[i], i);
            }
            right.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        int min = nums.length;
        //这里可以使用Collections集合来找到最大值
        int degree = Collections.max(count.values());

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == degree) {
                int i = right.get(entry.getKey()) - left.get(entry.getKey());
                min = i < min ? i : min;
                // min = Math.min(min, right.get(x) - left.get(x) + 1);
            }
        }
        return min + 1;

    }
}

