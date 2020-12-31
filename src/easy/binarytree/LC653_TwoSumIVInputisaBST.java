package easy.binarytree;

import easy.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname LC653_TwoSumIVInputisaBST
 * @Description TODO
 * 题目：在二叉查找树中寻找两个节点，使它们的和为一个给定值
 * 解法1:1.中序遍历可以得到有序数组
 * @Date 2020/12/31 20:22
 * @Created by youfayang
 */
public class LC653_TwoSumIVInputisaBST {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>(16);
        inOrder(root,nums);
        int i = 0;
        int j = nums.size()-1;
        while (j>i){
            int sum = nums.get(i)+nums.get(j);
            if (sum > k){
                j--;
            }else if (sum < k){
                i++;
            }else {
                return true;
            }
        }
        return false;


        /** 第一想法*/
//        for (int i = 0; i < nums.size()-1; i++) {
//            for (int j = i+1; j < nums.size(); j++) {
//                int sum = nums.get(i)+nums.get(j);
//                if(sum == k){
//                    return true;
//                }else if (sum > k){
//                    break;
//                }
//            }
//        }
//        return false;
    }

    private void inOrder(TreeNode root, List<Integer> nums) {
        if (root == null)return;
        inOrder(root.left,nums);
        nums.add(root.val);
        inOrder(root.right,nums);
    }
}
