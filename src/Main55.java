import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main55 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            boolean add = set.add(num);
            if (!add){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main55 main55=new Main55();
        boolean res = main55.containsDuplicate(new int[]{1,2,3,9});
        System.out.print(res);
    }
}


