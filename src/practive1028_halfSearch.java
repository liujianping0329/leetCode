import java.util.Scanner;

public class practive1028_halfSearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 8, 7, 6, 9, 11, 19, 20, 13, 30};
        Scanner sca = new Scanner(System.in);
        System.out.println("請輸入數字:");
        int b = sca.nextInt();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        //判斷值是否為中間值
        for (int r = 1; r <= arr.length / 4; r++) {
            int mid = 0;
            int c = (arr.length / (r + 1));
            if (b == arr[c]) {
                System.out.println("位於數組第" + c + "個:" + arr[c]);
                break;
            } while (b < arr[c]) {
                c = (1+c)/2;
            }while (b > arr[c]){
                c = (args.length+c)/2;
            }

        }

    }

}

