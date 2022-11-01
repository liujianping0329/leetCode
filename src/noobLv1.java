public class noobLv1 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i < 100; i++) {
         if (extracted(i)){
             a++;
         }

        }
        System.out.println(a);
    }

    private static boolean extracted(int k) {

        for (int i = 2; i < k; i++) {
            if (k%i==0){
                return false;
            }

        }
        return true;
    }
}
