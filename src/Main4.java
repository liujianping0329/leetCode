import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    //    https://leetcode-cn.com/problems/zigzag-conversion/
    public static String convert(String s, int numRows) {
        if(s.equals(""))return "";
        if(numRows==1)return s;
        List<String> map[]=new ArrayList[numRows];
        for (int i = 0; i < map.length; i++) {
            map[i]=new ArrayList<>();
        }
        int offset=0;
        for (int i = 0; i < s.split("").length; i++) {
            if(i%(2*(numRows-1))<numRows){
                if(i%(2*(numRows-1))==0&&i!=0){
                    offset++;
                }
                setAndFill(map[i%(2*(numRows-1))],offset,s.split("")[i]);
            }else{
                setAndFill(map[2*(numRows-1)-i%(2*(numRows-1))],++offset,s.split("")[i]);
            }
        }

        String ans="";
        for (int i = 0; i < map.length; i++) {
            for (int i1 = 0; i1 < map[i].size(); i1++) {
                if(map[i].get(i1)!=null){
                    ans+=map[i].get(i1);
                }
            }
        }
        return ans;
    }

    private static void setAndFill(List<String> integers, int offset, String s) {
        int size = integers.size();
        if(offset>= size){
            for(int i = 0; i<offset+1- size; i++){
                integers.add(null);
            }
        }
        integers.set(offset,s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next1 = scanner.nextLine();
        Integer i = scanner.nextInt();
        System.out.println(convert(next1, i));
    }

}
