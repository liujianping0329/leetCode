import java.util.Scanner;

public class Main32 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        int bit[]=new int[256];
        int i=0;
        do{
            bit[i++]=dec%2;
            dec/=2;
        }while (dec>=1);
        for (int j = i-1; j >=0; j--) {
            System.out.print(bit[j]);
        }
    }
}
