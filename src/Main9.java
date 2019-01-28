import vo.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main9 {
//    https://leetcode-cn.com/problems/range-sum-of-bst/
    public static int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null)return 0;
        if(root.val<L)return rangeSumBST(root.right,L,R);
        if(root.val>R)return rangeSumBST(root.left,L,R);

        if(root.left==null&&root.right==null)return root.val;
        if(root.left==null&&root.right!=null){
            if(root.right.val>R)return root.val;
            else return (root.val+rangeSumBST(root.right,L,R));
        }
        if(root.right==null&&root.left!=null){
            if(root.left.val<L)return root.val;
            else return (root.val+rangeSumBST(root.left,L,R));
        }
        if(root.right!=null&&root.left!=null){
            return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
        }
        return 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left=new TreeNode(5);
        treeNode.right=new TreeNode(15);
        treeNode.left.left=new TreeNode(3);
        treeNode.left.right=new TreeNode(7);
        treeNode.right.right=new TreeNode(18);
        System.out.println(rangeSumBST(treeNode,7,15));
    }


}
