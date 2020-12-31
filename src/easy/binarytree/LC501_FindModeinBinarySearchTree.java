package easy.binarytree;

import java.util.*;

/**
 * @Classname LC501_FindModeinBinarySearchTree
 * @Description TODO
 * 题目：二叉搜索树中的众数
 * 解法1:1.
 * @Date 2020/12/31 20:50
 * @Created by youfayang
 */
public class LC501_FindModeinBinarySearchTree {
    public int[] findMode(TreeNode root) {
        List<Integer> nums = new ArrayList<>(16);
        inOrder(root,nums);
        Map<Integer,Integer> map = new HashMap<>(16);
        int maxCout = 0;
        for (Integer num : nums) {
            Integer cnt = map.get(num);
            if (cnt == null){
                cnt = 0;
            }
            cnt++;
            map.put(num,cnt);
            maxCout = Math.max(cnt,maxCout);
        }
        List<Integer> maxNums = new ArrayList<>(16);
        for(Map.Entry<Integer,Integer> mapEntry : map.entrySet()){
            int num = mapEntry.getKey();
            int cnt = mapEntry.getValue();
            if (cnt == maxCout){
                maxNums.add(num);
            }
        }
        int[] res = new int[maxNums.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = maxNums.get(i);
        }
        return res;
    }
    private void inOrder(TreeNode root, List<Integer> nums) {
        if (root == null)return;
        inOrder(root.left,nums);
        nums.add(root.val);
        inOrder(root.right,nums);
    }
}
