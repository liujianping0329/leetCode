public class noob {
    public static void main(String[] args) {
      ping(11);
        ping(16);


    }
    public static void ping(int k){
        int A = 0;
        for (int i = 0; i < k; i++) {
            if(i%4==1){ A = A+i;}

        }
        System.out.println(A);

    }


}
