package easy.binarytree;

/**
 * @Classname LC101_SymmetricTree
 * @Description TODO
 * 题目：给定一个二叉树，检查它是否是镜像对称的。
 * 解法1:1.递归
 * 解法2:todo 迭代
 * @Date 2020/12/20 17:52
 * @Created by youfayang
 */
public class LC101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isEqual(root.left,root.right);
    }
    private boolean isEqual(TreeNode s, TreeNode t) {
        if (s == null && t == null){
            return true;
        }else if (s != null && t != null){
            return (s.val == t.val) && isEqual(s.left,t.right) && isEqual(s.right,t.left);
        }else {
            return false;
        }
    }
}
