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
    public StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode t) {
     if(t==null) {
         return "";
     }
     Helper(t);
     sb.deleteCharAt(0);
     sb.deleteCharAt(sb.length()-1);
     return sb.toString();
    }
    public void  Helper (TreeNode root) {
        if(root==null) {
            return;
        }
        sb.append("(");
        sb.append(root.val);
        Helper(root.left);
        if(root.left==null&&root.right!=null) {
            sb.append("()");
            
        }
        Helper(root.right);
        sb.append(")");
    
    }
}