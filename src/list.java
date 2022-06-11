public class list {
    public static void main(String[] args) {
        int size = 10;
        int[] list = new int [size];
        list[0] = 0;
        list[1] = 1;
        list[2] = list[0] + list[1];
        for (int a = 0 ;a < size;a++) {
            if(a < 2){
                list[a] = a;
            }
            else {
            list[a] = list[a - 1] + list[a - 2];
            }
            System.out.println(list[a]);
        }




    }
}
