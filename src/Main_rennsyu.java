public class Main_rennsyu {
    public boolean isPalindrome(int x) {
        String string = x+"";
        String string1 = new StringBuffer(string).reverse().toString();
        return string1.equals(string);
    }
    public static void main(String[] args) {
        Main_rennsyu main50=new Main_rennsyu();
        boolean res = main50.isPalindrome(12231);
        System.out.print(res);
    }
}
