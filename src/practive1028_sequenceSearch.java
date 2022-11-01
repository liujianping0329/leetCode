import java.util.Scanner;

public class practive1028_sequenceSearch {
    public static void main(String[] args) {

        String[] arr= {"豬排飯","天津飯","雞腿飯","雞排飯"};
        Scanner sca = new Scanner(System.in);
        System.out.println("請輸入想吃的料理");
        String food = sca.next();

        int index = -1;//建立個不可能的標準點
        for (int i = 0; i < arr.length; i++) {
            if(food.equals(arr[i])){
                System.out.println("好的立即準備"+"在菜單的第"+(i+1)+"個餐點"+food);
                index = i;//若index有值就代表進入了回圈內，有找到;若 = -1，則代表沒進
                break;
            }

        }
        //為非的狀況下，利用index = -1作為條件，設置
        if (index == -1){
            System.out.println("很抱歉本餐廳沒賣"+"'"+food+"'");
        }
    }
}
