public class Main50 {
    public boolean isPalindrome(int x) {
        String string = x+"";
        String string1 = new StringBuffer(string).reverse().toString();
                return string1.equals(string);
    }
    public static void main(String[] args) {
        Main50 main50=new Main50();
        boolean res = main50.isPalindrome(12231);
        System.out.print(res);
    }
}
