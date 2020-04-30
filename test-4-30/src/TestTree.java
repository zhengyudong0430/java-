/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-30
 * Time: 10:03
 */
public class TestTree {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val) {
            this.val = val;
        }
    }



    public TreeNode build(){
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
        E.left = G;
        C.right = F;
        return A;
    }
    


}
