package easy.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * 题目：输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * 解法1：getListFromSort：1.把数组转成List，2.对数组排序，3，输出前K个数
 * TODO 解法2：尝试用bfprt：1.选中一个数，将这个数小于它的放左边，大于它的放右边。直到选中的数命中k，输出之前打的数组。
 */
public class NC119_GetLeastNumbers {

    public static void main(String[] args) {
	    int[] arr = new int[]{1,2,3,4,5,6,7};
        List<Integer> list1 = getListFromSort(arr,3);
        System.out.println(list1);
    }

    private static List<Integer> getListFromSort(int[] arr, int k) {
        if (arr== null || arr.length == 0 || k<=0){
            return null;
        }
        List<Integer> sortList = new ArrayList<Integer>((int) ( arr.length *1.25+1));
        for (int i= 0; i< arr.length;i++){
            sortList.add(arr[i]);
        }
        sortList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        List<Integer> resoultList = new ArrayList<>();
        for(int i = 0; i<k;i++){
            resoultList.add(sortList.get(i));
        }
        return resoultList;
    }
}
