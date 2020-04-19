/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-19
 * Time: 19:23
 */
public class TestTree {
    static class Node{
        public  char val;
        public Node left;
        public Node right;
         public Node(char val) {
             this.val = val;
             this.left = null;
             this.right = null;
         }
     }
     static Node build(){
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
    static void preorder(Node root) {
         if(root==null) {
           return;
         }
        System.out.println(root.val);
         preorder(root.left);
         preorder(root.right);
    }
    static void inorder(Node root) {
        if(root==null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
    public static void main(String[] args) {
      Node root = build();
      preorder(root);
      Node root1 = build();
      inorder(root1);
      Node root2 = build();
      postorder(root2);
    }
}
