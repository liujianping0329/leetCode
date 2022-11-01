package febonacci;

public class T {
    public int fibonacci(int n) {
        if (n > 0) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }else{
            System.out.println("輸入大於1的整數");
            return n;
        }

    }

}
