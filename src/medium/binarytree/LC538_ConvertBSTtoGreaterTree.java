package medium.binarytree;

import easy.binarytree.TreeNode;

/**
 * @Classname LC538_ConvertBSTtoGreaterTree
 * @Description TODO
 * 题目：把二叉树转换为累加树
 * 解法1:1.先遍历右子树，可以得到从大到小的顺序。然后用一个全局变量记录累加值
 * remark 二叉搜索树的右子树的优先遍历，可以得到从大到小的排列。
 * @Date 2020/12/26 10:34
 * @Created by youfayang
 */
public class LC538_ConvertBSTtoGreaterTree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traver(root);
        return root;
    }

    private void traver(TreeNode root) {
        if (root == null)return;
        traver(root.right);
        sum = sum + root.val;
        root.val = sum;
        traver(root.left);
    }
}
