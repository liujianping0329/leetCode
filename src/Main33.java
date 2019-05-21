import java.util.Scanner;

public class Main33 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("幚峴寢壥");
        System.out.println("--- 擖椡 ---");
        double [] a =new double [3];
        int i=0;
        for(i=0;i<a.length;i++){
            System.out.print("攝楍 num["+ i + "]=");
            a[i]=sc.nextDouble();
        }
        System.out.println("--- 奼挘 for 暥偵傛傞昞帵 ---");
        int j=0;
        for(double b:a){
            System.out.println("攝楍 num["+ (j++) + "]="+b);
        }
    }
}
