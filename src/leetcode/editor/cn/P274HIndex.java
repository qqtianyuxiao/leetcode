package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//H 指数
class HIndex {
    public static void main(String[] args) {
        Solution solution = new HIndex().new Solution();
        System.out.println(solution.hIndex(new int[]{0}));
    }


    class Solution {
        public int hIndex(int[] citations) {
            if (citations.length == 0 ) {
                return 0;
            }
            Arrays.sort(citations);
            HashMap<Integer, Integer> hs = new HashMap<>();
            for (int i = 0; i <= citations[citations.length - 1]; i++) {
                for (int i1 = 0; i1 < citations.length; i1++) {
                    if (citations[i1] >= i) {
                        hs.put(i, hs.getOrDefault(i, 0) + 1);
                    }
                }
            }
            int index = -1;
            for (Map.Entry<Integer, Integer> integerIntegerEntry : hs.entrySet()) {
                if (integerIntegerEntry.getKey() <= integerIntegerEntry.getValue()) {
                    index++;
                }
            }
            return index;
        }

    }

}

