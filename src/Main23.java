import vo.TreeNode;

import java.util.Arrays;

public class Main23 {
//    https://leetcode-cn.com/problems/construct-binary-search-tree-from-preorder-traversal/

    public static TreeNode bstFromPreorder(int[] preorder) {
        return genTree(preorder,null);
    }

    private static TreeNode genTree(int[] preorder, TreeNode treeNode) {
        return null;
    }

    public static int[] shift(int[] preorder){
        int[] ans=new int[preorder.length-1];
        for (int i = 0; i < preorder.length; i++) {
            if(i==0){
                continue;
            }else{
                ans[i-1]=preorder[i];
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        bstFromPreorder(new int[]{8,5,1,7,10,12});
    }


}
