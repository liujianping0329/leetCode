import java.util.Scanner;

public class Main29 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("亙幚峴寢壥亜");
        System.out.print("1偐傜100偺惍悢傪擖椡偟偰壓偝偄丗 ");
        int n=sc.nextInt();
        int i,j;
        int a,b;
        a=n/5;
        b=n%5;
        for(i=1;i<=a;i++){
            System.out.print("12345");
        }
        for(j=1;j<=b;j++){
            System.out.print(j);
        }
    }
}
