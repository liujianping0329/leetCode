import java.util.Scanner;

public class practive1028_2_for_sum {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        double total = 0 ;
        int passnum = 0;
        for (int j = 1; j < 4; j++) {
            double sum = 0;

        for (int i = 1; i < 6; i++) {

            System.out.println("請輸入第"+j+"個班第"+i+"個學生");
            double score = sca.nextDouble();
            if (score >= 6){
                passnum++;
            }
            sum += score;

            System.out.println("成績為"+score);
        }

        System.out.println(j+"班級平均分="+(sum/5));
            total += sum;


        }
        System.out.println("所有班級平均分="+(total/5/3));
        System.out.println("合格的人"+passnum);
    }
}
