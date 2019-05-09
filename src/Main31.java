import java.util.Scanner;

public class Main31 {


    public static void main(String[] args) {
        System.out.println("亙幚峴寢壥亜");
        int[] a =new int[]{21,45,78,34,98,65,12,87,54,9999};
        int max=a[0];
        int min=a[0];
        int maxindex=0;
        int minindex=0;
        for (int i=0;i<a.length&&a[i]<9999;i++){
            if(a[i]>max){
                max=a[i];
                maxindex=i;
            }
            if(a[i]<min){
                min=a[i];
                minindex=i;
            }
        }
        System.out.println("最大值"+max+", 第几个"+(++maxindex));
        System.out.println("最小值"+min+", 第几个"+(++minindex));
    }
}
