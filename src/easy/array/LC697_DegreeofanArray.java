package easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Classname LC697_DegreeofanArray
 * @Description TODO
 * 题目：给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 * 解法1:1.
 * @Date 2020/12/12 20:04
 * @Created by youfayang
 */
public class LC697_DegreeofanArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> degMap = new HashMap<>((int)(nums.length/0.75+1));
        for(int num : nums){
            Integer deg = degMap.get(num);
            if(deg == null){
                deg = 1;
                degMap.put(num,deg);
            }else {
                deg = deg+1;
                degMap.put(num,deg);
            }
        }
        Set<Integer> numSet = new HashSet<>();
        int deg = 0;
        for(Map.Entry<Integer,Integer> map : degMap.entrySet()){
            int curNum = map.getKey();
            int curDeg = map.getValue();
            if (curDeg > deg){
                deg = curDeg;
                numSet.clear();
                numSet.add(curNum);
            }else if(curDeg == deg){
                numSet.add(curNum);
            }
        }
        Map<Integer,Integer> leftMap = new HashMap<>();
        Map<Integer,Integer> rightMap = new HashMap<>();
        Set<Integer> leftSet = new HashSet<>(numSet);
        Set<Integer> rightSet = new HashSet<>(numSet);
        for(int i = 0; i<nums.length; i++){
            if (leftSet.contains(nums[i])){
                leftSet.remove(nums[i]);
                leftMap.put(nums[i], i);
            }
        }
        for(int j = nums.length - 1; j>=0; j--){
            if (rightSet.contains(nums[j])){
                rightSet.remove(nums[j]);
                rightMap.put(nums[j], j);
            }
        }
        int smallLength = Integer.MAX_VALUE;
        for(Integer i : numSet){
            int curLength = rightMap.get(i) - leftMap.get(i);
            smallLength = smallLength < curLength ? smallLength :curLength;
        }
        return smallLength+1;
    }
}
