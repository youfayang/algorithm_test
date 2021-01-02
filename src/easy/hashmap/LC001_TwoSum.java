package easy.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LC001_TwoSum
 * @Description TODO
 * 题目：两数之和
 * 解法1:1.
 * @Date 2021/1/2 17:19
 * @Created by youfayang
 */
public class LC001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target-num)){
                return new int[]{i,map.get(target-num)};
            }
            map.put(num,i);
        }
        return null;
    }
}
