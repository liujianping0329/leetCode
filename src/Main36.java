import java.util.Scanner;

public class Main36 {

    public static int solve(int a,int b){
        if(a%b==0)return b;
        return solve(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("整数１入力：");
        int x=sc.nextInt();
        System.out.print("整数２入力：");
        int y=sc.nextInt();
        System.out.println(solve(Math.max(x,y),Math.min(x,y)));
    }
}
