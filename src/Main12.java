import vo.TreeNode;

import java.util.Arrays;

public class Main12 {

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
//        https://leetcode-cn.com/problems/maximum-binary-tree/
//        if(nums.length==1)return new TreeNode(nums[0]);
        if(nums.length==0)return null;
        SpliteByMaxBO max = findMax(nums);
        TreeNode treeNode=new TreeNode(max.max);
        treeNode.left=constructMaximumBinaryTree(max.left);
        treeNode.right=constructMaximumBinaryTree(max.right);
        return treeNode;
    }

    private static SpliteByMaxBO findMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        int[] left=new int[index+1-1];
        int[] right=new int[nums.length-index-1];
        int leftIndex=0,rightIndex=0;
        for (int i = 0; i < nums.length; i++) {
            if(i<index){
                left[leftIndex++]=nums[i];
            }else if(i>index){
                right[rightIndex++]=nums[i];
            }
        }
        return new SpliteByMaxBO(left,right,max);
    }

    static class SpliteByMaxBO{
        int[] left;
        int[] right;
        int max;

        public SpliteByMaxBO(int[] left, int[] right, int max) {
            this.left = left;
            this.right = right;
            this.max = max;
        }
    }

    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        System.out.print(1);
    }


}
