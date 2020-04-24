import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-24
 * Time: 10:44
 */
public class TreeInterview {
    static class Node{
      public  Node left;
      public Node right;
      public int val;
        public Node(int val) {
            this.val = val;
        }
    }
  public static   boolean isCompleteTree(Node root)
   {
       if (root == null) {
           return true;
       }
       boolean isFirstTemp = true;
       Queue<Node>  queue= new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
       Node cur = queue.poll();
       if(isFirstTemp==true) {
           if(cur.left!=null&&cur.right!=null) {
               queue.offer(cur.left);
               queue.offer(cur.right);
           }
           if(cur.left==null&&cur.right!=null) {
               return false;
           }
           if(cur.left!=null&&cur.right==null) {
               isFirstTemp = false;
               queue.offer(cur.left);
           }
           if(cur.left==null&&cur.right==null) {
               return false;
           }
       }
       if(cur.left!=null||cur.right!=null) {
           return false;
       }
       }
       return true;
   }
   }
