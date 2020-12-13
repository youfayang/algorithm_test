package easy.array;

/**
 * @Classname LC645_SetMismatch
 * @Description 寻找丢失和重复元素
 * 题目：集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 * 解法1:1.通过新建一个boolean型数组，标记某个字段是否出现过。时间复杂度O(n),空间复杂度O(n)
 * TODO 解法2：通过交换数组元素。时间复杂度O(n),空间复杂度O(1)
 * @Date 2020/12/12 18:21
 * @Created by youfayang
 */
public class LC645_SetMismatch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,4};
        int[] result = findErrorNumsFromFlag(nums);
        for (int num: result) {
            System.out.println(num);
        }
    }
    public static int[] findErrorNumsFromFlag(int[] nums) {
        boolean[] flag = new boolean[nums.length+1];
        int err = -1;
        int miss = -1;
        for (int num : nums) {
            if (flag[num]) {
                err = num;
            }else {
                flag[num] = true;
            }
        }
        for(int i = 1; i<= nums.length; i++){
            if (!flag[i]){
                miss = i;
                break;
            }
        }
        return new int[]{err,miss};
    }
}
