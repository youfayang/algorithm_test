package medium.array;

/**
 * @Classname LC769_MaxChunksToMakeSorted
 * @Description TODO 问题：1.阅读题意，第一次理解错了题意。2.注意边界条件。
 * TODO 官方解决：考虑所有位置不等，并且为非负整数，对i位置的数，与0~i-1上的leftmax取最大值max，如果max=i，则认为可以在i到i+1位置划分
 * 题目：数组arr是[0, 1, ..., arr.length - 1]的一种排列，我们将这个数组分割成几个“块”，并将这些块分别进行排序。之后再连接起来，使得连接的结果和按升序排序后的原数组相同。
 * 我们最多能将数组分成多少块？
 * 解法1:第一层for循环：从i=1出发，考虑每个i位置的左侧是否可以划分。leftMax记录左边0~i-1范围的最大值。在i位置可分为三种情况
 *      1)如果i位置的值小于leftMax，则认为i左侧不能划分。i++
 *      2)i位置值大于leftMax，并且从i到length-1位置都大于leftMax，则认为i位置可以划分
 *      3)i位置值大于leftMax，但是i右边一个位置j的值小于leftmax，则认为，leftmax = Math.Max(a[i~j]),然后i = j+1;
 * @Date 2020/12/13 12:28
 * @Created by youfayang
 */
public class LC769_MaxChunksToMakeSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,4,6,3,1,7,5,8};
        System.out.println(maxChunksToSorted(arr));
    }
    public static int maxChunksToSorted(int[] arr) {
        int leftMax = arr[0];
        int result = 1;
        //判断第i个左边的位置能不能作为划分
        for (int i = 1; i < arr.length;i++) {
            if (arr[i] <= leftMax){
                continue;
            }else {
                boolean flag = true;
                int max = arr[i];
                for (int j = i+1; j < arr.length; j++){
                    if (arr[j] <= leftMax){
                        flag =false;
                        //从i到一个比一个leftmax小的位置。遍历过的一个范围内最大的值。
                        leftMax = max;
                        i = j;
                        break;
                    } else {
                        max = Math.max(max,arr[j]);
                    }
                }
                if (flag){
                    // 从i到length-1都比leftmax大
                    leftMax = arr[i];
                    result++;
                }

            }

        }
        return result;
    }
}
