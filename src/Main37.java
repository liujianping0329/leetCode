import java.util.Scanner;

public class Main37 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] flg=new boolean[n+1];
        for(int i = 2; i <= n; i++){
            flg[i]=true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            for(int j = 2 * i; j <= n; j += i){
                flg[j] = false;
            }
        }
        for(int i = 2; i <= n; i++){
            if(flg[i]){
                System.out.print(i+" ");
            }
        }
    }
}
