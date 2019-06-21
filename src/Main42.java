import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main42 {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        String pat = calInt(pattern);
        for (String word : words) {
            if(calInt(word).equals(pat)){
                ans.add(word);
            }
        }
        return ans;
    }

    private static String calInt(String s) {
        String ans="";
        Map<String,Integer> relation=new HashMap<>();
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            String str = split[i];
            if(relation.get(str)==null){
                relation.put(str,i+1);
            }
            ans+=relation.get(str);
        }
        return ans;
    }
    public static void main(String[] args) {
//        https://leetcode-cn.com/problems/find-and-replace-pattern/
        findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"},"abb");
    }


}
