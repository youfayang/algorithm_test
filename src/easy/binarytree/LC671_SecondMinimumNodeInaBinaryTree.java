package easy.binarytree;

/**
 * @Classname LC671_SecondMinimumNodeInaBinaryTree
 * @Description TODO
 * 题目：
 * 解法1:1.
 * @Date 2020/12/21 21:05
 * @Created by youfayang
 */
public class LC671_SecondMinimumNodeInaBinaryTree {
    int min = Integer.MAX_VALUE;
    int cur = Integer.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null){
            return -1;
        }
        if (root.left == null){
            return -1;
        }
        if (root.left.val == root.right.val){
            int l = findSecondMinimumValue(root.left);
            int r = findSecondMinimumValue(root.right);
            if (l == -1 && r == -1){
                return -1;
            }
            if (l == -1){
                return r;
            }
            if (r == -1){
                return l;
            }
            return Math.min(l,r);
        }
        cur = root.val;
        if (root.left.val == cur){
            int temp = findSecondMinimumValue(root.left);
            if (temp == -1){
                min = Math.min(min,root.right.val);
            } else {
                min = Math.min(min,Math.min(root.right.val, temp));
            }

        }
        if (root.right.val == cur){
            int temp = findSecondMinimumValue(root.right);
            if (temp == -1){
                min = Math.min(min,root.left.val);
            }else {
                min = Math.min(min,Math.min(root.left.val, temp));
            }

        }
        if (min == cur){
            return -1;
        }
        return min;
    }
}
