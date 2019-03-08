import vo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Main18 {
//    https://leetcode-cn.com/problems/distribute-coins-in-binary-tree/

    public static int distributeCoins(TreeNode root) {
        int cou = 0;
        while (!isBalance(root)) {
            List<TreeNode> maxNode = findMaxNode(root, null, null);
            if (maxNode.get(0).equals(root)) {
                spreadIt(null, maxNode.get(0));
            } else {
                spreadIt(maxNode.get(1), maxNode.get(0));
            }
            cou++;
        }
        return cou;
    }

    private static void spreadIt(TreeNode parent, TreeNode maxNode) {
        if (maxNode.right != null && parent != null && maxNode.left != null) {
            if(maxNode.left.val<=maxNode.right.val&&maxNode.left.val<=parent.val){
                maxNode.left.val++;
                maxNode.val--;
                return;
            }
            if(maxNode.right.val<=maxNode.left.val&&maxNode.right.val<=parent.val){
                maxNode.right.val++;
                maxNode.val--;
                return;
            }
            if(parent.val<=maxNode.left.val&&parent.val<=maxNode.right.val){
                parent.val++;
                maxNode.val--;
                return;
            }
        }

        if (maxNode.right != null && maxNode.left != null) {
            if(maxNode.left.val<=maxNode.right.val){
                maxNode.left.val++;
                maxNode.val--;
                return;
            }else{
                maxNode.right.val++;
                maxNode.val--;
                return;
            }
        }

        if (maxNode.right != null && parent != null) {
            if(maxNode.right.val<=parent.val){
                maxNode.right.val++;
                maxNode.val--;
                return;
            }else{
                parent.val++;
                maxNode.val--;
                return;
            }
        }

        if (maxNode.left != null && parent != null) {
            if(maxNode.left.val<=parent.val){
                maxNode.left.val++;
                maxNode.val--;
                return;
            }else{
                parent.val++;
                maxNode.val--;
                return;
            }
        }

        if (maxNode.left != null ) {
                maxNode.left.val++;
                maxNode.val--;
                return;
        }
        if (maxNode.right != null ) {
            maxNode.right.val++;
            maxNode.val--;
            return;
        }
        if (parent != null ) {
            parent.val++;
            maxNode.val--;
            return;
        }
    }

    private static List<TreeNode> findMaxNode(TreeNode root, TreeNode parent, TreeNode o) {
        if (o == null) o = root;
        if (root.left != null) {
            if (root.left.val > root.val) {
                return findMaxNode(root.left, root, root.left);
            } else {
                if(root.val>o.val){
                    return findMaxNode(root.left, root, root);
                }else{
                    return findMaxNode(root.left, root, o);
                }
            }
        }
        if (root.right != null) {
            if (root.right.val > root.val) {
                return findMaxNode(root.right, root, root.right);
            } else {
                if(root.val>o.val){
                    return findMaxNode(root.right, root, root);
                }else{
                    return findMaxNode(root.right, root, o);
                }
            }
        }
        TreeNode finalO = o;
        return new ArrayList<TreeNode>() {{
            add(finalO);
            add(parent);
        }};
    }

    private static boolean isBalance(TreeNode root) {
        if (root == null) return true;
        if (root.val != 1) return false;
        return isBalance(root.left) && isBalance(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(0);
        root.left.right.left = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(2);
        root.right.right.right = new TreeNode(0);
        distributeCoins(root);
    }


}
