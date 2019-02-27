import vo.TreeNode;

public class Main16 {
//    https://leetcode-cn.com/problems/binary-tree-pruning/

    public static TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        if(root.val==0){
            if(root.left!=null&&root.right!=null){
                if(root.left.val==0&&root.right.val==0){
                    root.left = pruneTree(root.left);
                    root.right = pruneTree(root.right);
                    if(root.left==null&&root.right==null){
                        return null;
                    }
                    return root;
                }
            }else if(root.left!=null){
                if(root.left.val==0){
                    root.left = pruneTree(root.left);
                    return root;
                }
            }else if(root.right!=null){
                if(root.right.val==0){
                    root.right = pruneTree(root.right);
                    return root;
                }
            }else{
                return null;
            }
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(0);
        treeNode.left.left = new TreeNode(0);
        treeNode.left.right = new TreeNode(0);
//        treeNode.left.left.left = new TreeNode(0);
        treeNode.right = new TreeNode(1);
        treeNode.right.left = new TreeNode(0);
        treeNode.right.right = new TreeNode(1);
        pruneTree(treeNode);
    }


}
