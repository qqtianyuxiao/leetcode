package leetcode.editor.cn;

//提莫攻击
class TeemoAttacking {
    public static void main(String[] args) {
        Solution solution = new TeemoAttacking().new Solution();
        System.out.println(solution.findPoisonedDuration(new int[]{}, 5));
    }

    class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            if (timeSeries.length == 0) {
                return 0;
            }
            int t = 0;
            int time = 0;
            for (int i = 0; i < timeSeries.length; i++) {
                if (i != timeSeries.length - 1) {
                    time = timeSeries[i + 1] - timeSeries[i];
                    if (time < duration) {
                        t = t + time;
                    } else {
                        t = t + duration;
                    }
                }
            }
            t = t + duration;
            return t;
        }
    }

}

