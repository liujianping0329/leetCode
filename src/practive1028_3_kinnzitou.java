public class practive1028_3_kinnzitou {

    public static void main(String[] args) {
        int limt = 30;
        for (int i = 1; i <= limt; i++) {
            for (int k = 0; k <= limt-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        //空心金字塔

        for (int i = 1; i <= limt; i++) {
            for (int k = 0; k <= limt-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j == 1 || j == 2*i-1|| i==limt) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }

    }
}
