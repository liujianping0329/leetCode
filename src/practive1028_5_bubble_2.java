public class practive1028_5_bubble_2 {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 13544, 98, 48, 45, 56, 23, 2, 100, 300, 1100, 1500};
        int a = arr.length;
        int temp = 0;
        int max=Integer.MIN_VALUE;
        long ti=System.currentTimeMillis();
        for (int j = 0; j < a; j++) {
            if(max<=arr[j])max=arr[j];
        }
        System.out.println(max);
        int[] arr1 = new int[max+1];

        for (int k = 0; k < arr.length - 1; k++) {
            arr1[arr[k]]=1;
        }
        for (int i = 0; i < max+1; i++) {
            if(arr1[i]==1)System.out.print(i+" ");
        }

        System.out.print(System.currentTimeMillis()-ti);
    }


}
