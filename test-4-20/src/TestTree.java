import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-20
 * Time: 14:36
 */
public class TestTree {
    static class Node {
        public char val;
        public Node left;
        public Node right;
        // 此处没有 parent. 面试中常见的二叉树都是不带 parent
        public Node(char val) {
            this.val = val;
            // 以下两个代码可以省略.
            // 引用类型的成员变量, 会被默认初始化为 null
            this.left = null;
            this.right = null;
        }
        @Override
    public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }
    // 辅助我们构造测试数据的.
    static Node build() {
        // 通过 build 方法构建一棵树, 返回树的根节点
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        return A;
    }
    public static int leafSize = 0;
    static void LeafSzie(Node root){
        if(root==null) {
            return;
        }
        if(root.left==null&&root.right==null) {
            leafSize++;
            return;
        }
        LeafSzie(root.left);
        LeafSzie(root.right);
    }
   public static int LeafSize(Node root){
        if(root==null) {
            return 0;
        }
        if(root.left==null&&root.right==null) {
            return 1;
        }
        return LeafSize(root.left)+LeafSize(root.right);
    }
   public static int kLevelSize(Node root,int k) {
        if(root==null||k<1) {
            return 0;
        }
        if(k==1) {
            return 1;
        }
        return kLevelSize(root.left,k-1)+kLevelSize(root.right,k-1);
   }
   public static Node result = null;
   public static void Find(Node root,int toFind ) {
        if(root==null) {
            return;
        }
        if(root.val==toFind) {
          result = root;
          return;
        }
        Find(root.left,toFind);
        Find(root.right,toFind);
   }
   public static Node Find(Node root,char toFind) {
    if(root==null) {
        return null;
    }
    if(root.val==toFind) {
        return root;
    }
    Node result= Find(root.left,toFind);
    if(result!=null) {
        return result;
    }
    return Find(root.right,toFind);

}

    public static void main(String[] args) {
        /*Node root = build();
        LeafSzie(root);
        System.out.println(leafSize);
        Node root1 = build();
        System.out.println(LeafSize(root1));
        Node root2 = build();
        System.out.println(kLevelSize(root2, 3));*/
        Node root3 = build();
        System.out.println(Find(root3, 'G'));
        // System.out.println(result);

    }
}