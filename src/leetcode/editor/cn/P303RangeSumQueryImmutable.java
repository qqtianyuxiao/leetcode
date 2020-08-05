package leetcode.editor.cn;

//区域和检索 - 数组不可变
class RangeSumQueryImmutable {
    public static void main(String[] args) {

    }

    class NumArray {
        private int[] sum;

        public NumArray(int[] nums) {
            if (nums.length == 0) {
                return;
            }
            sum = new int[nums.length];
            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i - 1] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return sum[j];
            }
            return sum[j] - sum[i - 1];
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

}

