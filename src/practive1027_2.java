import java.util.Scanner;

public class practive1027_2 {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("請輸入月份");
        int season = sca.nextInt();
        if (season >= 4 && season <= 10){
            System.out.println("輸入年齡");
            int age = sca.nextInt();
            if (age >=18 && age <=60){
                System.out.println("旺季成人票價60元");
            }else if (age < 18 && age >= 0){
                System.out.println("旺季幼童票30元");
            }else {System.out.println("旺季敬老票20元");}
        }else {
            System.out.println("輸入年齡");
            int age = sca.nextInt();
            if (age >=18 && age <=60){
                System.out.println("淡季成人票價40元");
            }else {
                System.out.println("淡季敬老票、幼童票20元");
            }
        }
    }
}
