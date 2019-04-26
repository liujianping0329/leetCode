import vo.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main25 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("结果");
        int target=0;
        int day=1;
        int sum=0;
        int n=1;
        System.out.print("输入目标钱数");
        target=sc.nextInt();
        do {
            n *= 2;
            day++;
            sum += n;
        }
        while (sum<target);
        System.out.println(day+"日存"+(sum+1)+"钱");
    }
}
