import java.util.HashMap;
import java.util.Map;

public class Main51 {
    public int romanToInt(String s) {
        String[] split = s.split("");
        Map<String,Integer> map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        Map<String,Integer> mins=new HashMap<>();
        mins.put("IV",2);
        mins.put("IX",2);
        mins.put("XL",20);
        mins.put("XC",20);
        mins.put("CD",200);
        mins.put("CM",200);

        int sum = 0 ;
        for (int i = 0; i < split.length; i++) {
            sum += map.get(split[i]);
        }

        for (int i = 0; i < split.length; i++) {
            Integer min=0;
            if(i!=split.length-1){
                if((min=mins.get(split[i]+split[i+1]))!=null){
                    sum-=min;
                }
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Main51 main51=new Main51();
        int res = main51.romanToInt("MCMXCIV"); //2216
        System.out.print(res);
    }
}

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
