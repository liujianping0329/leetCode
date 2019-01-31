import java.util.Arrays;

public class Main11 {

//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//            Example:
//
//    Given nums = [2, 7, 11, 15], target = 9,
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].
    public static int[] solve(int tar,int... num){
        for (int i = 0; i < num.length; i++) {
            int binarySearch = Arrays.binarySearch(num, tar - num[i]);
            if(binarySearch >=0){
                return new int[]{i,binarySearch};
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int [] ans=solve(18,2, 7, 11, 15);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }


}
