public class practive1028_random {
    public static void main(String[] args) {

        int conter = 0;
        label1 :
        for (int i = 0; i < 600000; i++) {
            int a = (int)(Math.random()*100+1);
            label2:
            if (a != 97){
                System.out.println(a);
                conter++;
            } while (a==97) {
                System.out.println("98");
                System.out.println("總共"+conter+"次");
                break label1 ;
            }

        }
    }
}
