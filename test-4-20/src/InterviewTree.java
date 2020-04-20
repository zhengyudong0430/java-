import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-20
 * Time: 15:55
 */
public class InterviewTree {
    class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) {
            return result;
        }

        result.addAll(preorderTraversal(root.left));
        result.add(root.val);
        result.addAll(preorderTraversal(root.right));
        return result;
    }
    public static void main(String[] args) {

    }
}
