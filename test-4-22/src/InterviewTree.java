/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-22
 * Time: 14:07
 */
public class InterviewTree {
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
     if(p==null&&q==null) {
         return true;
     }
     if(p==null||q==null) {
         return false;
     }
     if(p.val==q.val) {
         return true;
     }
     return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null) {
            return false;
        }
        return isSameTree(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public int maxDepth(TreeNode root) {
        if(root ==null) {
            return 0;
        }
        if(root.left==null&&root.right==null) {
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1+ (leftDepth>rightDepth ? leftDepth:rightDepth);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) {
            return true;
        }
        if(root.left==null&&root.right==null) {
            return true;
        }
        return ismetric(root.left,root.right);
    }
    public boolean ismetric(TreeNode p,TreeNode q) {
        if(p==null&&q==null) {
            return true;
        }
        if(p==null||q==null) {
            return false;
        }
        return (p.val==q.val&&ismetric(p.left,q.right)&&ismetric(p.right,q.left));
    }
}
