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
    public int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return buildTreeHelper(preorder,inorder,0,inorder.length);
    }
    public TreeNode buildTreeHelper(int[]preorder,int []inorder,int orderleft,int orderright) {
        if(orderleft>=orderright) {
            return null;
        }
        TreeNode newNode = new TreeNode(preorder[index]);      
        int pos = Find(inorder,orderleft,orderright,newNode.val);
        index++;
        newNode.left = buildTreeHelper(preorder,inorder,orderleft,pos);
        newNode.right = buildTreeHelper(preorder,inorder,pos+1,orderright);
        return newNode;
    }
    public int Find(int []inorder,int orderleft,int orderright,int val ) {
        for(int i=orderleft;i<orderright;i++) {
            if(inorder[i]==val) {
                return i;
            }
        }
        return -1;
    }
}