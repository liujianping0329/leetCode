public class practive1028_5_bubble {
    public static void main(String[] args) {
        int[] arr= {1354,24,69,80,57,13,98,48,45,56,23,2,100,120};
        int a = arr.length;
        int temp = 0;
        long ti=System.currentTimeMillis();
        for (int j = 0; j < a-1; j++) {
//            for (int i = 0; i < a-1; i++) {
//                if (arr[i] > arr[i + 1]){
//                    temp = arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
            for (int i = j+1; i < a-1; i++) {
                if (arr[j] > arr[i]){
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("第"+(j+1)+"輪");
            System.out.print("[");
                for (int i = 0; i < a; i++) {

                    System.out.print(arr[i]+",");
            }
            System.out.print("]");
                System.out.println("");
        }System.out.print(System.currentTimeMillis()-ti);

    }
}
