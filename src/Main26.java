import java.util.Scanner;

public class Main26 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("＜実行結果＞");
        System.out.println("■整数をどんどん入力してください(-9999で終了します■)");
        int num=0;
        int total=0;
        int x=0;
        int A=0;
        do {
            System.out.print((++A)+"個目：");
            num=sc.nextInt();
            if(num!=-9999){
                total+= num;
                x++;
            }
        }
        while (num!=-9999);
        System.out.println("合計＝"+total+","+"平均＝"+(double)total/x);
    }
}
