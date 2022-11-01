import java.util.Scanner;

public class practive1027_1 {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("請輸入分數");
        double grade = sca.nextDouble();
        if (grade >8.0){
            System.out.println("輸入性別");
            char gender = sca.next().charAt(0);
            if (gender == '男'){
                System.out.println("進入男子組");
            }else if (gender == '女'){
                System.out.println("進入女子組");
            }else {System.out.println("性別有誤,不能參加決賽");}
        }else {
            System.out.println("落選");
        }
    }
}
