import java.util.HashMap;
import java.util.Map;

public class Main52 {
    public String longestCommonPrefix(String[] strs) {
        int index=0;
        for (int i = 0; i < 200; i++) {
            if("".equals(strs[0])) return "";
            if(i>=strs[0].length()) break;
            String firstMoji= strs[0].split("")[i];
            int cou=1;
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length()){
                    if(strs[j].split("")[i].equals(firstMoji)){
                        cou++;
                    }
                }else{
                    break;
                }
            }
            if(cou==strs.length){
                index=i;
            }else if(i==0&&cou!=strs.length){
                index=-1;
                break;
            }else{
                break;
            }
        }
        return strs[0].substring(0,index+1);
    }

    public static void main(String[] args) {
        Main52 main52=new Main52();
        String res = main52.longestCommonPrefix(new String[]{"a","a","b"});
        System.out.print(res);
    }
}


