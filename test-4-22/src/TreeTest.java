

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-22
 * Time: 15:45
 */
public class TreeTest {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }
    }
    public static TreeNode build(){
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
        TreeNode G = new TreeNode(7);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        return A;
    }
    public static void LevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        // 1. 创建一个队列, 初始情况下吧 根节点 加入到队列中
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        // 2. 进入循环, 循环结束条件为队列为空
        while (!queue.isEmpty()) {
            // a) 取出队首元素
            TreeNode cur = queue.poll();
            // b) 访问当前元素
            System.out.print(cur.val + " ");
            // c) 把当前节点的左右子树分别入队列
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = build();
        LevelOrder(root);
    }
}
