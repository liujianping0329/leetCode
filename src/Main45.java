import vo.TreeNode;

import java.util.*;

public class Main45 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans=new HashSet<>();
        for(int i1=0;i1<nums.length-3;i1++){
            for(int i2=i1+1;i2< nums.length-2;i2++){
                for (int i3 = i2+1; i3 <nums.length-1 ; i3++) {
                    for (int i4 = i3+1; i4 <nums.length ; i4++) {
                        if(nums[i1]+nums[i2]+nums[i3]+nums[i4]==target){
                            List<Integer> temp=new ArrayList<Integer>();
                            temp.add(nums[i1]);
                            temp.add(nums[i2]);
                            temp.add(nums[i3]);
                            temp.add(nums[i4]);
                            ans.add(temp);
                        }else if(nums[i1]+nums[i2]+nums[i3]+nums[i4]<target){
                            continue;
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
//        https://leetcode-cn.com/problems/4sum/
        int a[]=new int[]{1, 0, -1, 0, -2, 2};
        fourSum(a,0);
    }


}
