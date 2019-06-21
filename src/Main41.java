import java.util.HashMap;
import java.util.Map;

public class Main41 {

    public static int numTilePossibilities(String tiles) {
        Map<String,Integer> kinds=new HashMap<>();
        for (int i = 0; i < tiles.split("").length; i++) {
            if(kinds.get(tiles.split("")[i])==null){
                kinds.put(tiles.split("")[i],1);
            }else{
                kinds.put(tiles.split("")[i],kinds.get(tiles.split("")[i])+1);
            }
        }
        return realCou(kinds);
    }

    private static int realCou(Map<String,Integer> kinds) {
        int cou=0;
        for (Map.Entry<String, Integer> stringIntegerEntry : kinds.entrySet()) {
            if(stringIntegerEntry.getValue().equals(0)){
                continue;
            }
            cou++;
            Map<String,Integer> kindsTemp=new HashMap<>();
            kindsTemp.putAll(kinds);
            kindsTemp.put(stringIntegerEntry.getKey(),stringIntegerEntry.getValue()-1);
            cou+=realCou(kindsTemp);
        }
        return cou;
    }

    public static void main(String[] args) {
//        https://leetcode-cn.com/problems/letter-tile-possibilities/
        System.out.println(numTilePossibilities("AAABBC"));
    }
}
