import vo.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main17 {
//    https://leetcode-cn.com/problems/permutations/

    public static List<List<Integer>> permute(int[] nums) {
        if(nums.length==1){
            return new ArrayList<List<Integer>>(){{
                add(new ArrayList<Integer>(){{
                    add(nums[0]);
                }});
            }};
        }
        List<List<Integer>> ans=new ArrayList<>();
        int curInt=nums[nums.length-1];
        for (List<Integer> integers : permute(sub(nums))) {
            int size = integers.size();
            for(int i=0;i<size+1;i++){
                ans.add(addIt(integers,i,curInt));
            }
        }
        return ans;
    }

    private static List<Integer> addIt(List<Integer> integers, int i, int curInt) {
        List<Integer> integers1=new ArrayList<>();
        for (int i1 = 0; i1 < i; i1++) {
            integers1.add(integers.get(i1));
        }
        integers1.add(curInt);
        for (int i1 = i; i1 < integers.size(); i1++) {
            integers1.add(integers.get(i1));
        }
        return integers1;
    }

    private static int[] sub(int[] nums) {
        int[] ans=new int[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            ans[i]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        permute(new int[]{1,2,3,4});
    }


}
