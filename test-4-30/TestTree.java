private static TreeNode build() {

 
        // 通过 build 方法构建一棵树, 返回树的根节点.

 
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

 


 
    public void preOrder(TreeNode root) {

 
        if (root == null) {

 
            return;

 
        }

 
        Stack<TreeNode> stack = new Stack<>();

 
        stack.push(root);

 
        while (!stack.empty()) {

 
            TreeNode top = stack.pop();

 
            System.out.print(top.val + " ");

 
            if (top.right != null) {

 
                stack.push(top.right);

 
            }

 
            if (top.left != null) {

 
                stack.push(top.left);

 
            }

 
        }

 
    }

 


 
    public void inOrder(TreeNode root) {

 
        if (root == null) {

 
            return;

 
        }

 
        Stack<TreeNode> stack = new Stack<>();

 
        TreeNode cur = root;

 
        while (true) {

 
            // 1. cur 一直往左找, 循环入栈, 直到 cur 为空

 
            while (cur != null) {

 
                stack.push(cur);

 
                cur = cur.left;

 
            }

 
            // 2. 取栈顶元素并访问了. 如果遇到空栈, 说明访问完毕了

 
            if (stack.empty()) {

 
                break;

 
            }

 
            TreeNode top = stack.pop();

 
            System.out.print(top.val + " ");

 


 
            // 3. cur 从 top 的右子树出发, 重复 1 2

 
            cur = top.right;

 
        }

 
    }

 


 
    public void postOrder(TreeNode root) {

 
        if (root == null) {

 
            return ;

 
        }

 
        Stack<TreeNode> stack = new Stack<>();

 
        TreeNode cur = root;

 
        // prev 用来记录上一个被访问过的节点. 初始情况下没有任何节点被访问过.

 
        TreeNode prev = null;

 
        while (true) {

 
            // 1. cur 循环往左找, 遇到的非空节点都入栈

 
            while (cur != null) {

 
                stack.push(cur);

 
                cur = cur.left;

 
            }

 
            // 2. 取栈顶元素, 看看能不能访问这个元素

 
            //    满足以下两个条件, 才能够访问当前栈顶元素

 
            //   a) 右子树为空

 
            //   b) 右子树被访问过

 
            if (stack.empty()) {

 
                // 遍历结束

 
                break;

 
            }

 
            TreeNode top = stack.peek();  // 只是取元素判断一下, 并没有真的出栈. 只有这个节点被访问过了, 才能出栈.

 
            if (top.right == null || top.right == prev) {

 
                // 可以访问 top 了

 
                System.out.print(top.val + " ");

 
                stack.pop();

 
                prev = top;

 
            } else {

 
                // 3. 让 cur 从 top.right 出发, 继续循环 1 和 2

 
                cur = top.right;

 
            }

 
        }

 
    }

 


 
    public static void main(String[] args) {

 
        TreeNode root = build();

 
        TreeInterview interview = new TreeInterview();

 
        interview.postOrder(root);

 
    }
 
 
 
}
