package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//杨辉三角 II
class PascalsTriangleIi {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangleIi().new Solution();
        List<Integer> row = solution.getRow(0);
        System.out.println(row.toString());
    }

    class Solution {
        public List<Integer> getRow(int rowIndex) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            for (int i = 1; i <= rowIndex; i++) {
                for (int j = i - 1; j >= 1; j--) {
                    arr.set(j, arr.get(j - 1) + arr.get(j));
                }
                arr.add(1);
            }
            return arr;
        }
    }

}