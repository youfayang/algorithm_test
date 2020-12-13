package easy.array;

/**
 * @Classname LC283_MoveZeros
 * @Description
 * 题目：给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 解法1：1.遍历数组，将所有不为零的数从0-k赋值 2.把从k+1到length的赋值为0
 * @Date ${DATE} 2020.12.12 15:38
 * @Created youfayang
 */
public class LC283_MoveZeros {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for(int num : nums){
            System.out.println(num);
        }

    }
    private static void moveZeroes(int[] nums) {
        if(nums == null){
            return;
        }
        int index = 0;
        for(int num : nums){
            if(num != 0){
                nums[index++] = num;
            }
        }
        while(index < nums.length){
            nums[index++] =0;
        }
    }
}
