package easy.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LC594_LongestHarmoniousSubsequence
 * @Description TODO
 * 题目：最长和谐子序列
 * 解法1:1.
 * @Date 2021/1/2 17:47
 * @Created by youfayang
 */
public class LC594_LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(16);
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            int cur = val+Math.max(map.getOrDefault(key-1,Integer.MIN_VALUE),
                    map.getOrDefault(key+1,Integer.MIN_VALUE));
            cur = cur == val?0:cur;
            max = Math.max(max,cur);
        }
        return max;
    }
}
