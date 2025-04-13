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
    public List<Integer> preorderTraversal(TreeNode root) {
        //     List<Integer> ans=new ArrayList<>();
        //    pt(root,ans);
        //    return ans;
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        if(root==null){
            return ans;
        }
        s.push(root);
        while(!s.isEmpty()){
            TreeNode node=s.pop();
            ans.add(node.val);
            if(node.right!=null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
        }
        return ans;
        // static void pt(TreeNode root,List<Integer> a){
        //     if(root ==null){
        //         return;
        //     }
        //     a.add(root.val);
        //     pt(root.left,a);
        //      pt(root.right,a);
        // }
    }
}