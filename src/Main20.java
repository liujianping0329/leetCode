import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main20 {
//    https://leetcode-cn.com/problems/jewels-and-stones/

    public static int[] sortedSquares(int[] A) {
        int [] ans=new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i]=A[i]*A[i];
        }
        Arrays.sort(ans);
        return ans;
    }


    public static void main(String[] args) {
        sortedSquares(new int[]{-7,-3,2,3,11});
    }


}
