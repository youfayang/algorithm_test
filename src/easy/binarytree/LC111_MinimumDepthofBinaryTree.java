package easy.binarytree;

/**
 * @Classname LC111_MinimumDepthofBinaryTree
 * @Description TODO
 * 题目：给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 解法1:1.
 * @Date 2020/12/20 18:03
 * @Created by youfayang
 */
public class LC111_MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }else if (root.left == null){
            return 1+minDepth(root.right);
        }else if (root.right == null){
            return 1+minDepth(root.left);
        }else{
            return 1+Math.min(minDepth(root.left),minDepth(root.right));
        }
    }
}
