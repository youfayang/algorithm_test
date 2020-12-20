package easy.binarytree;

/**
 * @Classname LC112_PathSum
 * @Description TODO
 * 题目：给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 解法1:1.递归
 * @Date 2020/12/20 16:24
 * @Created by youfayang
 */
public class LC112_PathSum {
    private boolean hasPath = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
            return false;
        }else if (root.left == null && root.right == null){
            if (root.val == sum){
                hasPath = true;
                return true;
            }
        }
//        if (root == null){
//            if (sum == 0){
//                hasPath = true;
//                return true;
//            }else {
//                return false;
//            }
//        }
        int rest = sum - root.val;
        hasPathSum(root.left, rest);
        hasPathSum(root.right,rest);
        return hasPath;
    }
}
