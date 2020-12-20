package easy.binarytree;

/**
 * @Classname LC226_InvertBinaryTree
 * @Description TODO
 * 题目：翻转一棵二叉树。
 * 解法1:1.利用递归，左树和右树交换
 * @Date 2020/12/20 16:06
 * @Created by youfayang
 */
public class LC226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
