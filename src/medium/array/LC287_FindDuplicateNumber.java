package medium.array;

/**
 * @Classname LC287_FindDuplicateNumber
 * @Description TODO
 * 题目：给定一个包含n + 1 个整数的数组nums，其数字都在 1 到 n之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * 解法1:利用二分法1.取中值mid，则<=mid应该有mid个，若大于，则应该在
 * @Date 2020/12/12 18:55
 * @Created by youfayang
 */
public class LC287_FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,2,5,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int lo = 1;
        int hi = nums.length-1;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            int cnt = 0;
            for(int i = 0; i< nums.length; i++){
                if (nums[i] <= mid){
                    cnt++;
                }
            }
            if(cnt > mid){
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        return lo;
    }
}
