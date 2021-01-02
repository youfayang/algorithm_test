package hard.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LC128_LongestConsecutiveSequence
 * @Description TODO
 * 题目：最长连续子序列
 * 解法1:1.
 * @Date 2021/1/2 18:10
 * @Created by youfayang
 */
public class LC128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,1);
        }
        for (int num : nums) {
            forward(map,num);
        }
        return maxCnt(map);
    }

    private int maxCnt(Map<Integer, Integer> map) {
        int max = 0;
        for (Integer value : map.values()) {
            max = Math.max(max,value);
        }
        return max;
    }

    private int forward(Map<Integer, Integer> map, int num) {
        if(!map.containsKey(num)){
            return 0;
        }
        if (map.get(num) > 1){
            return map.get(num);
        }
        int cnt = forward(map,num+1)+1;
        map.put(num,cnt);
        return cnt;
    }
}
