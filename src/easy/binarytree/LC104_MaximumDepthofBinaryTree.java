package easy.binarytree;

/**
 * @Classname LC104_MaximumDepthofBinaryTree
 * @Description TODO
 * 题目：
 * 解法1:1.
 * @Date 2020/12/20 15:32
 * @Created by youfayang
 */
public class LC104_MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
