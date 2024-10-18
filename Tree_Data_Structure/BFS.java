import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BFS {
    // use case 
    // 1) when answer lies near the root node
    // 2) when asked to search by lavel

    private static class TreeNode {
        int val;
        BFS.TreeNode left;
        BFS.TreeNode right;

        // public TreeNode(int val) {
        //     this.val = val;
        //     this.left = null;
        //     this.right = null;
        // }
        
    }
    
    // private TreeNode root;


    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if(currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }

        return result;

    }

    public static void main(String[] args) {
        
    }
    
}
