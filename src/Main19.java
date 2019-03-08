import vo.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main19 {
//    https://leetcode-cn.com/problems/jewels-and-stones/

    public static int numJewelsInStones(String J, String S) {
        int cou=0;
        Map<String,Integer> relation=new HashMap<>();
        for (int i = 0; i < J.split("").length; i++) {
            relation.put(J.split("")[i],1);
        }
        for (int i = 0; i < S.split("").length; i++) {
            if(relation.get(S.split("")[i])!=null){
                cou++;
            }
        }
        return cou;
    }


    public static void main(String[] args) {
        numJewelsInStones("z","ZZ");
    }


}
