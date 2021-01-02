package easy.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname LC217_ContainsDuplicate
 * @Description TODO
 * 题目：存在重复元素
 * 解法1:1.
 * @Date 2021/1/2 17:27
 * @Created by youfayang
 */
public class LC217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i : nums) {
            if (!set.add(i)){
                return true;
            }
        }
        return false;
    }
}
