import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode Left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }

}

public class TreeBFS {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> BFS(TreeNode root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
         queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.data);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return res;
    }
}
//https://www.geeksforgeeks.org/problems/level-order-traversal/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
