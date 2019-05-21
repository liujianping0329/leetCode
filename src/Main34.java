import java.util.Random;
import java.util.Scanner;

public class Main34 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[] kujis = {"大吉", "吉", "中吉", "小吉", "末吉", "凶"};
        int flag = 1;
        while (flag == 1) {
            System.out.print("■おみくじを引く（凶が出たら終了）1:実行、0:終了>");
            flag = sc.nextInt();
            if (flag == 0) {
                break;
            }
            String res = kujis[rnd.nextInt(6)];
            System.out.println("おみくじの結果:" + res);
            if (res.equals("凶")) {
                break;
            }
        }
    }
}
