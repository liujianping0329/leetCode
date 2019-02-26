import vo.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main14 {
//    https://leetcode-cn.com/problems/subsets/

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i=0;i<nums.length;i++){
            List<List<Integer>> t=new ArrayList<List<Integer>>();
            for(List<Integer> r:res){
                t.add(r);
                ArrayList<Integer> clone=new ArrayList<Integer>(r);
                clone.add(nums[i]);
                t.add(clone);
            }
            res=t;
        }
        return res;
    }

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }


}
