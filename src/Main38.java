import java.util.Scanner;

public class Main38 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int index=0;
        for (int i = 2; i <n-2 ; i++) {
            int index=0;
            for (int j=2;j<=(i-1);j++){
                int amari=i%j;
                if(amari==0){
                    index++;
                }
            }
            if(index==0){
                System.out.print(i+" ");
            }
        }
    }
}
