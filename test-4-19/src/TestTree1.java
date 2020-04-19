import sun.reflect.generics.tree.Tree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-19
 * Time: 20:17
 */
public class TestTree1 {
    static class Node {
        public char val;
        public Node left;
        public Node right;
        public Node(char val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static Node build() {
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
    static int TreeSize = 0;
    static void Size(Node root) {
        if (root == null) {
            return;
        }
        TreeSize++;
        Size(root.left);
        Size(root.right);
    }
    static int TreeSize(Node root) {
        if(root==null) {
            return 0;
        }
        return 1+ TreeSize(root.left)+TreeSize(root.right);
    }
    public static void main(String[] args) {
        Node root = build();
        Size(root);
        System.out.println(TreeSize);
       Node root1 = build();
        System.out.println(TreeSize(root1));
    }
}
