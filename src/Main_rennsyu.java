public class Main_rennsyu {
    public boolean isPalindrome(int x) {
        String string = x+"";
        String string1 = new StringBuffer(string).reverse().toString();
        if (string1.equals(string)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Main_rennsyu main51=new Main_rennsyu();
        boolean res = main51.isPalindrome(121);
            System.out.print(res);
    }
}
