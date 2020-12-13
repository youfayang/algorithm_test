package medium.array;

/**
 * @Classname LC565ArrayNesting
 * @Description TODO
 * 题目：索引从0开始长度为N的数组A，包含0到N - 1的所有整数。找到最大的集合S并返回其大小，其中 S[i] = {A[i], A[A[i]], A[A[A[i]]], ... }且遵守以下的规则。
 * 假设选择索引为i的元素A[i]为S的第一个元素，S的下一个元素应该是A[A[i]]，之后是A[A[A[i]]]... 以此类推，不断添加直到S出现重复的元素。
 * 解法1:1.用一个boolean数组记录当前字段是否来到。
 * @Date 2020/12/13 11:56
 * @Created by youfayang
 */
public class LC565_ArrayNesting {
    public static void main(String[] args) {
        int[] nums = new int[]{5,4,0,3,1,6,2};
        System.out.println(arrayNesting(nums));
    }
    public static int arrayNesting(int[] nums) {

        int maxSize = 0;
        //以每一个元素为开始
        boolean[] contain = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int size = 0;
            //放到外面的原因是，每一条路径都是确定的。包括路径和路径的一个子串，但是子串的长度是一定小于第一次遍历的路径。
//            boolean[] contain = new boolean[nums.length];
            //如果当前节点没来到过，则size++ 并到下一个节点
            while (!contain[num]){
                contain[num] = true;
                size++;
                num = nums[num];
            }
           maxSize = Math.max(maxSize,size);
        }
        return maxSize;
    }
}
