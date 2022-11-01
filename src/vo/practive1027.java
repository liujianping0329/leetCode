package vo;

import java.util.Scanner;

public class practive1027 {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("請輸入信用分");
        int grade = sca.nextInt();
        if (grade == 100){
            System.out.println("信用極好");
        }else if (grade >80 && grade < 100) {
            System.out.println("信用優秀");
        }else if (grade>60 && grade < 80){
            System.out.println("信用一般");
        } else{
            System.out.println("信用不及格");
        }
    }
}
