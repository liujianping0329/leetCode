import java.util.Scanner;

public class Main27 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("result");
        System.out.print("1-100 ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(i%5+1);
        }
    }
}
