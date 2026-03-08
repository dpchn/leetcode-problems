/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> findLeaves(TreeNode root) {
        height(root);
        return result;
    }

    int height(TreeNode root){
        if(root==null){
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int currentHeigth = 1 + Math.max(leftHeight, rightHeight);

        if(currentHeigth == result.size()){
            result.add(new ArrayList());
        }
        result.get(currentHeigth).add(root.val);
        return currentHeigth;
    }
}