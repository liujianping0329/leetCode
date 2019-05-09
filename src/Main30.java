import java.util.Scanner;

public class Main30 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数组");
        int[] a =new int[5];
        int i;
        for(i=0;i<a.length;i++){
            System.out.print("a["+ i + "]=");
            a[i]=sc.nextInt();//a偺擖椡
        }

        for(i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        System.out.println("  ");
        System.out.println("  ");
        for(i=0;i<a.length;i++){
            System.out.println("a["+ i + "]="+a[i]);
        }
    }
}
