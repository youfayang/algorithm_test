package easy.binarytree;

/**
 * @Classname LC108_ConvertSortedArraytoBinarySearchTree
 * @Description TODO
 * 题目：从有序数组里面构造二叉查找树
 * 解法1:1.
 * @Date 2020/12/26 14:24
 * @Created by youfayang
 */
public class LC108_ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBFS(nums,0,nums.length-1);

    }

    private TreeNode toBFS(int[] nums, int s, int e) {
        if (s > e)return null;
        if (s == e) return new TreeNode(nums[s]);
        int mid = s + (e-s) /2;
        TreeNode cur = new TreeNode(nums[mid]);
        cur.left = toBFS(nums,s,mid-1);
        cur.right = toBFS(nums,mid+1,e);
        return cur;
    }

}
