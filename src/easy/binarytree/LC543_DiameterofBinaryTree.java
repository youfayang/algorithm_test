package easy.binarytree;

/**
 * @Classname LC543_DiameterofBinaryTree
 * @Description TODO
 * 题目：给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 * 解法1:1.左边高度+右边高度 和 左边的直径和右边的直径 取最大值。
 * @Date 2020/12/20 15:57
 * @Created by youfayang
 */
public class LC543_DiameterofBinaryTree {
    private int  max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        max = Math.max(max,l+r);
        return Math.max(l,r)+1;
    }
}
