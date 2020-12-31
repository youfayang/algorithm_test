package easy.binarytree;

import easy.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname LC530_MinimumAbsoluteDifferenceinBST
 * @Description TODO
 * 题目：二叉搜索树的最小绝对差
 * 解法1:1.
 * @Date 2020/12/31 20:37
 * @Created by youfayang
 */
public class LC530_MinimumAbsoluteDifferenceinBST {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> nums = new ArrayList<>(16);
        inOrder(root,nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size()-1; i++) {
             int diff = nums.get(i+1)- nums.get(i);
             min = Math.min(min,diff);
        }
        return min;
    }
    private void inOrder(TreeNode root, List<Integer> nums) {
        if (root == null)return;
        inOrder(root.left,nums);
        nums.add(root.val);
        inOrder(root.right,nums);
    }
}
