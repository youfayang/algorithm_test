package medium.binarytree;

import easy.binarytree.TreeNode;

/**
 * @Classname LC337_HouseRobberIII
 * @Description TODO
 * 题目： 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 * 解法1:1.
 * @Date 2020/12/21 20:45
 * @Created by youfayang
 */
public class LC337_HouseRobberIII {
    public int rob(TreeNode root) {
        if(root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return root.val;
        }
        int containRoot = root.val;
        if (root.left != null) {
            containRoot += (rob(root.left.left)+rob(root.left.right));
        }
        if (root.right != null) {
            containRoot += (rob(root.right.left)+rob(root.right.right));
        }
        int notContainRoot = rob(root.right)+ rob(root.left);
        return Math.max(containRoot,notContainRoot);
    }
}
