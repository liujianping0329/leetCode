import java.util.*;

public class Main54 {
    public List<String> summaryRanges(int[] nums) {

        List<String> list1 = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (!((i+1<nums.length && nums[i] ==nums[i+1]-1))){
                if (stringBuilder.length()>0){
                    stringBuilder.append("->");
                }
                stringBuilder.append(nums[i]);
                list1.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }else {
                if (stringBuilder.length() == 0){
                    stringBuilder.append(nums[i]);
                }
            }

        }
        return list1;
    }

    public static void main(String[] args) {
        Main54 main54=new Main54();
        List<String> res = main54.summaryRanges(new int[]{0,1,2,4,5,7,8,9});
        System.out.print(res);
    }
}


