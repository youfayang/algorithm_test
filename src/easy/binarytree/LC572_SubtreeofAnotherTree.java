package easy.binarytree;

/**
 * @Classname LC572_SubtreeofAnotherTree
 * @Description TODO
 * 题目：给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 * 解法1:1.
 * @Date 2020/12/20 17:43
 * @Created by youfayang
 */
public class LC572_SubtreeofAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null){
            return false;
        }
        boolean isEqual = isEqual(s,t);
        return isEqual || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    private boolean isEqual(TreeNode s, TreeNode t) {
        if (s == null && t == null){
            return true;
        }else if (s != null && t != null){
            return (s.val == t.val) && isEqual(s.left,t.left) && isEqual(s.right,t.right);
        }else {
            return false;
        }
    }
}
