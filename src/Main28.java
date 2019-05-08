import java.util.Scanner;

public class Main28 {


    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j=1;j<=9;j++){
                for (int k = 1; k <=9 ; k++) {
                    if(100*i+10*j+k+100*k+10*j+i==1333){
                        System.out.println(""+i+j+k+" + "+k+j+i+" = "+1333);
                    }
                }
            }
        }
    }
}
