import java.util.Random;
import java.util.Scanner;

public class Main35 {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //明　　治	めいじ	１８６８	～	１９１２
        //大　　正	たいしょう	１９１２	～	１９２６
        //昭　　和	しょうわ	１９２６	～	１９８８
        //平　　成	へいせい	１９８９	～	２０１９
        //令　　和	レイワ　	２０１９	～
        System.out.print("現在の西暦を入力してください：");
        int year=sc.nextInt();
        String [] wareki={"明治","大正","昭和","平成","令和"};
        int[] time={1868,1912,1926,1989,2019,3000};
        int flag=1;
        while (flag != 0){
            System.out.print("■西暦を入力(0 で終了):");
            flag=sc.nextInt();
            for (int i = 0; i < time.length; i++) {
                if(time[i]>flag){
                    System.out.println("和暦："+wareki[i-1]+((flag-time[i-1])+1)+"年");
                    System.out.println("年齢："+(year-flag)+"歳");
                    break;
                }
            }
        }
        System.out.println("ありがとうございました。");
    }
}
