二叉树最大宽度
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) 
        {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        q.offer(root);
        list.add(1);
        int res = 1;
        while (!q.isEmpty()) {
            int count = q.size();
            for(int i =count; i> 0; i--) {
                TreeNode cur = q.poll();
                Integer curIndex = list.removeFirst();
                if(cur.left != null) {
                    q.offer(cur.left);
                    list.add(curIndex * 2);
                }
                if(cur.right != null) {
                    q.offer(cur.right);
                    list.add(curIndex * 2 +1);
                }
            }
            if(list.size() >= 2) {
                res = Math.max(res, list.getLast() - list.getFirst() + 1);
            }
        }

        return res;
    }
    }
合并二叉树
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

}