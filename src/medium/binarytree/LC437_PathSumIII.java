package medium.binarytree;

import easy.binarytree.TreeNode;

/**
 * @Classname LC437_PathSumIII
 * @Description TODO
 * 题目：给定一个二叉树，它的每个结点都存放着一个整数值。
 * 找出路径和等于给定数值的路径总数。
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * 解法1:1.获得以每个节点为起始的一条路径和。
 * 解法2：TODO 查看题解，了解前缀和
 * @Date 2020/12/20 16:44
 * @Created by youfayang
 */
public class LC437_PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }
        return pathSum(root.left, sum)
                + pathSum(root.right, sum)
                + pathSumRoot(root, sum);

    }

    private int pathSumRoot(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }
        if (sum == root.val){
            return 1+pathSumRoot(root.left, sum - root.val)
                    + pathSumRoot(root.right, sum- root.val);
        }/**else if (sum < root.val){
            return 0;
        }*/else {
            return pathSumRoot(root.left, sum - root.val)
                    + pathSumRoot(root.right, sum- root.val);
        }
    }
}
