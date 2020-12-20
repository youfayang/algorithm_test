package easy.binarytree;

/**
 * @Classname LC110_BalancedBinaryTree
 * @Description TODO
 * 题目：给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 * 解法1:左右子树的高度差不超过1
 * @Date 2020/12/20 15:45
 * @Created by youfayang
 */
public class LC110_BalancedBinaryTree {
    private boolean isBalance = true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return isBalance;
    }

    private int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if(Math.abs(l-r)>1){
            isBalance = false;
        }
        return Math.max(l,r)+1;
    }
}
