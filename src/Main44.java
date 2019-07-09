import vo.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main44 {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=solve(root);
        return ans;
    }

    private static List<Integer> solve(TreeNode root) {
        if(root==null)return new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<Integer>() {{
            add(root.val);
        }};
        integers.addAll(solve(root.left));
        integers.addAll(solve(root.right));
        return integers;
    }

    public static void main(String[] args) {
//        https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
        TreeNode treeNode=new TreeNode(1);
        treeNode.right=new TreeNode(2);
        treeNode.right.left=new TreeNode(3);
        preorderTraversal(treeNode);
    }


}
