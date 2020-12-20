package easy.binarytree;

/**
 * @Classname LC404_SumofLeftLeaves
 * @Description TODO
 * 题目：计算给定二叉树的所有左叶子之和。
 * 解法1:1.
 * @Date 2020/12/20 19:01
 * @Created by youfayang
 */
public class LC404_SumofLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftSum = sumOfLeftLeaves(root.left, true);
        int rightSum = sumOfLeftLeaves(root.right, false);
        return leftSum + rightSum;
    }

    private int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
        if (root == null){
            return 0;
        }
        //非叶节点
        if (root.left != null || root.right != null){
            int leftSum = sumOfLeftLeaves(root.left, true);
            int rightSum = sumOfLeftLeaves(root.right, false);
            return leftSum + rightSum;
        }
        if (isLeft){
            return root.val;
        }else {
            return 0;
        }
    }
}
