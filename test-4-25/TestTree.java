import java.sql.Connection;

public class TreeInterview {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // 借助这个成员变量保存最近公共祖先.
    private TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        findNode(root, p, q);
        return lca;
    }

    // [约定] 如果在 root 中能够找到 p 或者 q, 返回 true, 否则返回 false
    private boolean findNode(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        // 采取后序遍历的形式进行查找
        int left = findNode(root.left, p, q) ? 1 : 0;
        int right = findNode(root.right, p, q) ? 1 : 0;
        // 访问根节点.
        int mid = (root == p || root == q) ? 1 : 0;
        // 接下来的操作非常神奇, 大家一定看好了~~~
        if (left + right + mid == 2) {
            lca = root;
        }
//        if ((left == 1 && right == 1 && mid == 0)
//            || (left == 1 && right == 0 && mid == 1)
//            || (left == 0 && right == 1 && mid == 1)) {
//            lca = root;
//        }
        return (left + right + mid) > 0;
    }

    // 返回值的含义表示链表的头节点.
    public TreeNode Convert(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            // 只有一个根节点. 得到的链表也就只有一个节点
            return root;
        }
        // 先递归处理左子树, 这个方法一执行, 就相当于把左子树已经完整的转换成双向链表了
        // left 就是左子树链表的头结点.
        TreeNode left = Convert(root.left);
        // 处理根节点, 需要把根节点追加到左子树链表的末尾.
        // 这就相当于链表尾插, 需要先找到前面链表的最后一个节点.
        TreeNode leftTail = left;
        while (leftTail != null && leftTail.right != null) {
            leftTail = leftTail.right;
        }
        // 当上述循环结束之后, leftTail 就是 left 这个链表的最后一个节点.
        // 把当前根节点, 尾插过去
        // 当 left 为 null (没有左子树的时候), leftTail 也就是 null
        if (leftTail != null) {
            leftTail.right = root;
            root.left = leftTail;
        }
        // 最后递归处理右子树, right 就是右子树链表的头结点
        TreeNode right = Convert(root.right);
        if (right != null) {
            // 根节点和右子树连接到一起
            right.left = root;
            root.right = right;
        }
        // 返回整个链表的头结点
        return left != null ? left : root;
    }
