package leetcode.editor.cn;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

//旋转函数
class RotateFunction {
    public static void main(String[] args) {
        Solution solution = new RotateFunction().new Solution();
        System.out.println(solution.maxRotateFunction(new int[]{4,3,2,6}));
    }

    class Solution {
        public int maxRotateFunction(int[] A) {
            if (A.length == 0) {
                return 0;
            }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            String format = simpleDateFormat.format(date);
            System.out.println(format);
            int val = 0;
            int max = Integer.MIN_VALUE;
            int length = A.length;
            for (int j = 0; j < A.length; j++) {
                for (int i = 0, z = j; i < length; i++, z = (z+1) % length) {
                    val += z * A[i];
                }
                if (val > max) {
                    max = val;
                }
                val = 0;
            }
            String format1 = simpleDateFormat.format(date);
            System.out.println(format);
            return max;
        }
    }
}
